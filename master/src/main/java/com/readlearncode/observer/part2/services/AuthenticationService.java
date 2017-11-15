package com.readlearncode.observer.part2.services;

import com.readlearncode.observer.part2.Customer;
import com.readlearncode.observer.part2.CustomerEvent;

import javax.enterprise.event.Observes;

import static com.readlearncode.observer.part2.CustomerEvent.Type.ADD;
import static com.readlearncode.observer.part2.CustomerEvent.Type.REMOVE;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AuthenticationService {

    public void createAuthenticationCredentials(@Observes @CustomerEvent(ADD) Customer customer) {
        // create authentication credentials
    }

    public void deleteAuthenticationCredentials(@Observes @CustomerEvent(REMOVE) Customer customer) {
        // delete authentication credentials
    }

}