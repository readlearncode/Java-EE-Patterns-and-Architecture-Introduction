package com.readlearncode.subsystems;

import com.readlearncode.Customer;

import javax.ejb.EJB;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@EJB
public class CreditRatingService {
    public boolean checkCustomerRating(Customer customer) {
        Integer rating = 900; // Connect to external credit reference agency
        return rating > 700;
    }
}