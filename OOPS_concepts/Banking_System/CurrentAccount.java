package Banking_System;
public class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= getBalance() * 1.5;
    }

    @Override
    public String calculateLoanEligibility() {
        return "Loan Eligible: " + applyForLoan(50000);
    }
}
