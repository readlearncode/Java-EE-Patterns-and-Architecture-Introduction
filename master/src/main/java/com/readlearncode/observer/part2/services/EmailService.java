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
public class EmailService {

    public void sendWelcomeEmail(@Observes @CustomerEvent(ADD) Customer customer) {
        // send welcome email
    }

    public void sendGoodbyeEmail(@Observes @CustomerEvent(REMOVE) Customer customer) {
        // send goodbye email
    }

}