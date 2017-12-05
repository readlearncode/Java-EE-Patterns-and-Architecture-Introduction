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
public class CustomerService {

    public void createCustomer(@ObservesAsync @Priority(10) @CustomerEvent(ADD) Customer customer) {
        // add new customer
    }

    public void deleteCustomer(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // delete customer
    }

}