package com.readlearncode.observer.part3.services;

import com.readlearncode.observer.part3.Customer;
import com.readlearncode.observer.part3.CustomerEvent;

import javax.enterprise.event.ObservesAsync;

import static com.readlearncode.observer.part3.CustomerEvent.Type.ADD;
import static com.readlearncode.observer.part3.CustomerEvent.Type.REMOVE;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EmailService {

    public void sendWelcomeEmail(@ObservesAsync @CustomerEvent(ADD) Customer customer) {
        // send welcome email
    }

    public void sendGoodbyeEmail(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // send goodbye email
    }

}