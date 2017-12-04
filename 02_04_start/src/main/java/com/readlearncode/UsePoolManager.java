package com.readlearncode;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class UsePoolManager {

    @Inject
    private PoolManager poolManager;

    public void UsePooledObject() {
        Object obj = poolManager.borrowObject();
        // use object
        poolManager.returnObject(obj);
    }
}
