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
public class TransferService {
    public void makeTransfer(Double principle, Customer customer) {
        // Transfer principle to customer bank account
    }
}