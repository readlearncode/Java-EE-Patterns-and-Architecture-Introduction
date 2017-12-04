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
public class CreditRatingService {
    public boolean checkCustomerRating(Customer customer) {
        Integer rating = 900; // Connect to external credit reference agency
        return rating > 700;
    }
}