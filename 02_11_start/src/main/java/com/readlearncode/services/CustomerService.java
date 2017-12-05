package com.readlearncode.services;

import com.readlearncode.Customer;

import javax.enterprise.event.Observes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomerService {

    public void createCustomer(@Observes Customer customer) {
        // add new customer
    }


}