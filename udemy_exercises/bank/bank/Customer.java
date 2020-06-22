package bank;

import java.util.ArrayList;
//Using autoboxing to create the array list - Double

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.customerName = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
