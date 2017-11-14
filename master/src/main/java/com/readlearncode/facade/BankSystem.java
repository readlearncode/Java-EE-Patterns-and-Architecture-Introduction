package com.readlearncode.facade;

import com.readlearncode.facade.subsystems.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Stateless
public class BankSystem {

    @EJB
    private CreditRatingService creditRatingService;

    @EJB
    private RepaymentPayabilityService payabilityService;

    @EJB
    private InternalBankPolicyService internalBankPolicyService;

    @EJB
    private TransferService transferService;

    @EJB
    private RepaymentService repaymentService;

    public boolean processLoanApplication(Customer customer, Double principle, Double income, Integer months) {

        Integer rating = creditRatingService.checkCustomerRating(customer);
        if (rating < 700) return false;

        boolean affordable = payabilityService.calculatePayability(principle, income, months);
        if (!affordable) return false;

        boolean compliant = internalBankPolicyService.checkCompliance(customer);
        if (!compliant) return false;

        boolean success = transferService.makeTransfer(principle, customer);
        if(!success) return false;

        repaymentService.setUpPaymentSchedule(customer, principle, months);

        return true;
    }

}