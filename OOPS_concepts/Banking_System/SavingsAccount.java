package Banking_System;
public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= getBalance() * 2;
    }

    @Override
    public String calculateLoanEligibility() {
        return "Loan Eligible: " + applyForLoan(50000);
    }
}
