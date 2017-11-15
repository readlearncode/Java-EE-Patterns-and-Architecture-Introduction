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
public class CustomerService {

    public void createCustomer(@ObservesAsync @CustomerEvent(ADD) Customer customer) {
        // add new customer
    }

    public void deleteCustomer(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // delete customer
    }
}