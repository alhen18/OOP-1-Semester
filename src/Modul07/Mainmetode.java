/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opgave1;

/**
 *
 * @author Aleksander Henriksen
 */
public class Mainmetode {

    /**
     * An assignment handler that runs the user requested task
     */
    public static void main(String[] args) {

        // Adding a Customer and giveing hin an id.
        Customer aCustomer = new Customer("Søren Sørensen", 0);

        // Depositing 1000 DKK to his account.
        aCustomer.deposit(1000);

        /**
         * Withdrawing 56.5 DKK for his account, and printing out the new
         * balance.
         */
        aCustomer.withdraw(56.5);
        System.out.printf("The customer balance of " + aCustomer.name
                + " is %.2f DKK%n", aCustomer.getBalance());

        // Giving 2 new customers a valuve for the Database.
        CustomerDatabase database = new CustomerDatabase();
        Customer c1 = new Customer("Anders Andersen", 1, 0);
        Customer c2 = new Customer("Morten Mortensen", 2, 500);
        Customer c3 = new Customer("Poul Poulsen", 3, 1500);

        // Adding them to the database
        database.addCustomer(c1);
        database.addCustomer(c2);
        database.addCustomer(c3);

        // Printing out Customer 3's balance.
        System.out.printf("The customer balance of " + c3.name
                + " is %.2f DKK%n", c3.getBalance());

        // Printing out the customers names.
        database.printCustomerNames();

        // Removeing the first customer from the database.
        database.removeCustomer(1);

        // Printing the Customers left in the database out.
        database.printCustomerNames();

        /**
         * For loop that scan through the customers that is left in the DataBase
         * and then add some bonus cash to there account.
         */
        System.out.println("\n");
        for (Customer customer : database.getCustomers()) {
            if (customer != null) {
                System.out.println("Adding loyalty bonus to " + customer.name);
                customer.deposit(50);
            }
        }
        // Printing the new balance for a customer.
        System.out.printf("The customer balance of " + c3.name
                + " is %.2f DKK%n", c3.getBalance());
    }
}