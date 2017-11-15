package com.readlearncode.Interceptor.part1;

import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Interceptors(LoggerInterceptor.class)
public class AccountService {


    public AccountService() {
    }


    public void upgradeAccount(String accountNumber){
        // Upgrade account
    }


    @ExcludeClassInterceptors
    public void AuditAccount(String accountNumber){
        // perform audit logic
    }


}