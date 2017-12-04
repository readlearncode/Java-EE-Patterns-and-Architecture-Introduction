package com.readlearncode.facade.subsystems;


import com.readlearncode.facade.Customer;

import javax.ejb.Stateless;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Stateless
public class RepaymentService {
    public void setUpPaymentSchedule(Customer customer, Double principle, Integer months) {
        // set up monthly automatic payment from customer account to bank
    }
}