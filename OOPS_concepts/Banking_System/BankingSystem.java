package Banking_System;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        BankAccount sa = new SavingsAccount("SB1001", "Alice", 100000);
        BankAccount ca = new CurrentAccount("CA2002", "Bob", 150000);

        sa.deposit(10000);
        ca.withdraw(20000);

        accounts.add(sa);
        accounts.add(ca);

        System.out.println("=== Banking System Details ===");
        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            System.out.println("---------------------------");
        }
    }
}
