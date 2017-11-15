package com.readlearncode.observer.part1.services;

import com.readlearncode.observer.part2.Customer;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomerService {

    public void createCustomer(@Observes @Priority(10) Customer customer) {
        // add new customer
    }


}