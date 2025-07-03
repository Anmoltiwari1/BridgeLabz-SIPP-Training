package Banking_System;

public interface Loanable {
    boolean applyForLoan(double amount);
    String calculateLoanEligibility();
}
