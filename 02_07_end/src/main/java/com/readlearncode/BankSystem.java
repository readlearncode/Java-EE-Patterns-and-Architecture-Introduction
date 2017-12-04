package com.readlearncode;

import com.readlearncode.subsystems.*;

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

        boolean passes = creditRatingService.checkCustomerRating(customer);
        if (!passes) return false;

        boolean affordable = payabilityService.calculatePayability(principle, income, months);
        if (!affordable) return false;

        boolean compliant = internalBankPolicyService.checkCompliance(customer);
        if (!compliant) return false;

        // Application successful, so transfer principle and set up repayment schedule
        transferService.makeTransfer(principle, customer);
        repaymentService.setUpPaymentSchedule(customer, principle, months);

        return true;
    }

}