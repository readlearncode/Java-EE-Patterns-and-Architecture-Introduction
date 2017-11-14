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
public class TransferService {
    public boolean makeTransfer(Double principle, Customer customer) {
        // Transfer principle to customer bank account
        return true;
    }
}