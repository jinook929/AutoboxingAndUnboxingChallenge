package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");

        if(bank.addBranch("Flushing")) {
            System.out.println("Flushing branch created");
        }

        bank.addCustomer("Flushing", "Tim", 50.05);
        bank.addCustomer("Flushing", "Mike", 175.34);
        bank.addCustomer("Flushing", "Percy", 220.12);

        bank.addBranch("Manhattan");
        bank.addCustomer("Manhattan", "Bob", 150.54);

        bank.addCustomerTransaction("Flushing", "Tim", 44.22);
        bank.addCustomerTransaction("Flushing", "Tim", 12.44);
        bank.addCustomerTransaction("Flushing", "Mike", 1.65);

        bank.listCustomers("Flushing", true);
        bank.listCustomers("Manhattan", true);

        bank.addBranch("Little Rock");

    }
}
