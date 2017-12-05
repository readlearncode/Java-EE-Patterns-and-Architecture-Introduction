package com.readlearncode.services;

import com.readlearncode.Customer;
import com.readlearncode.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

import static com.readlearncode.CustomerEvent.Type.ADD;
import static com.readlearncode.CustomerEvent.Type.REMOVE;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EmailService {

    public void sendWelcomeEmail(@ObservesAsync @Priority(1000) @CustomerEvent(ADD) Customer customer) {
        // send welcome email
    }


    public void sendGoodbyeEmail(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // send goodbye email
    }
}