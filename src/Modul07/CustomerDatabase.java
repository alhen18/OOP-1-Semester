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
public class CustomerDatabase {

    Customer[] customers = new Customer[200];

    public CustomerDatabase() {
    }

    /**
     * Adds a customer if possible. Creat a customer objekt of the type
     * Customer. It returns true if an error occure else it return false.
     */
    public boolean addCustomer(Customer _customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = _customer;
                return false;
            }
        }
        System.out.println("There were an issue adding the customer to the"
                + " database");
        return true;
    }

    /**
     * Removes a customer if possible. An id of an existing customer in the
     * database. It returns true if an error occure else it return false.
     */
    public boolean removeCustomer(int _id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].id == _id) {
                customers[i] = null;
                return false;
            }
        }
        System.out.println("There were an issue removing the customer from the"
                + " database");
        return true;
    }

    // Returns the database array
    public Customer[] getCustomers() {
        return customers;
    }

    // Printes the names of the customers in the database
    public void printCustomerNames() {
        System.out.print("\n" + "The Customers left in the database is: ");
        for (Customer customer : customers) {
            if (customer != null) {
                System.out.print(customer.name + " | ");
            }
        }
    }
}