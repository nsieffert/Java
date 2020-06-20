package bank;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        bank.addBranch("Greenville");
        bank.addCustomer("Greenville", "Joanne", 120.45);
        bank.addCustomer("Greenville", "Kim", 200.99);
        bank.addCustomer("Greenville", "Mike", 150);

        bank.addBranch("Quinlan");
        bank.addCustomer("Quinlan", "Marsha", 4030.10);
        bank.addCustomer("Quinlan", "Kevin", 575);
        bank.addCustomer("Quinlan", "Debra", 450);

        bank.addBranch("Como");
        bank.addCustomer("Como", "Don", 2500.50);
        bank.addCustomer("Como", "Roxy", 9005.50);

        bank.addCustomerTransaction("Como", "Roxy", 250.55);
        bank.addCustomerTransaction("Greenville", "James", 100);
        // James does not show up on the list because he is not a current customer.

        bank.listCustomers("Greenville", false);
        bank.listCustomers("Quinlan", true);
        bank.listCustomers("Como", true);

    }
}









