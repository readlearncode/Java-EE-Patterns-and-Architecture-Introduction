package com.readlearncode.singleton.part3;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@DependsOn("Configuration")
@Startup
@Singleton
public class PoolManager {

    private Queue<Object> pooledObjects;

    @PostConstruct
    void constructExpensiveObjects(){
        pooledObjects = new LinkedBlockingQueue<>(1_000);
        for (int i = 0; i <= 1_000; i++) {
            pooledObjects.offer(new Object());
        }
    }


    public void returnObject(Object obj) {
        pooledObjects.offer(obj);
    }

    public Object borrowObject() {
        return pooledObjects.poll();
    }
}
