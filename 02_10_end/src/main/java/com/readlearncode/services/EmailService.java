package com.readlearncode.services;

import com.readlearncode.Customer;

import javax.enterprise.event.Observes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EmailService {

    public void sendWelcomeEmail(@Observes Customer customer) {
        // send welcome email
    }

}