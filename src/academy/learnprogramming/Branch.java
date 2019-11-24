package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    // Fields
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    // Getter
    public String getName() {
        return name;
    }

    // Add a new customer
    public boolean newCustomer(String customerName, double intialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, intialAmount));
            return true;
        }

        return false;
    }

    // Add a customer's transaction
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    // Find an existing customer
    private Customer findCustomer(String customerName) {
        for(int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(customerName == checkedCustomer.getName()) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
