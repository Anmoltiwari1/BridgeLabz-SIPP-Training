class Bank {
    String bankName;

    Bank(String name) {
        this.bankName = name;
    }

    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI Bank");
        Customer customer = new Customer("Anmol", 5000);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}
