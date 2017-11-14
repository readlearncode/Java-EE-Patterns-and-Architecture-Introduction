package com.readlearncode.facade.subsystems;

import com.readlearncode.facade.Customer;

import javax.ejb.EJB;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@EJB
public class CreditRatingService {
    public Integer checkCustomerRating(Customer customer) {
        // Connect to external credit reference agency
        // Pass customer details
        // return customer's credit rating
        return 0;
    }
}