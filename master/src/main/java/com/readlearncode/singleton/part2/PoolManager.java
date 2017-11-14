package com.readlearncode.singleton.part2;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@DependsOn("ConfigurationBean")
@Startup
@Singleton
public class PoolManager {

    private Queue<Object> pooledObjects;

    @PostConstruct
    void constructExpensiveObjects() {
        pooledObjects = new LinkedBlockingQueue<>(1_000);
        for (int i = 0; i <= 1_000; i++) {
            pooledObjects.offer(new Object());
        }
    }

    @AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void returnObject(Object obj) {
        pooledObjects.offer(obj);
    }

    @Lock(LockType.READ)
    public Object borrowObject() {
        return pooledObjects.poll();
    }
}
