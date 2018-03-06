package com.readlearncode.part2;

import javax.interceptor.ExcludeClassInterceptors;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Loggable
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