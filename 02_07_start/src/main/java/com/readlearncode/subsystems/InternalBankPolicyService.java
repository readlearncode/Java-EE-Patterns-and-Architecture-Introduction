package com.readlearncode.subsystems;

import com.readlearncode.Customer;

import javax.ejb.Stateless;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Stateless
public class InternalBankPolicyService {
    public boolean checkCompliance(Customer customer) {
        // Check that customer conforms to bank policy on lending
        return true;
    }
}