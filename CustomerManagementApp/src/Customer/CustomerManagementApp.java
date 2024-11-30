package Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerManagementApp {
    public static void main(String[] args) {
        // Initialize a list of customers
        List<Customer> customers = new ArrayList<>();

        // Add some customers
        customers.add(new Customer(3, 1000.50, "Alice", "Johnson"));
        customers.add(new Customer(1, 1500.75, "Bob", "Smith"));
        customers.add(new Customer(2, 1200.30, "Alice", "Brown"));
        customers.add(new Customer(4, 950.00, "Bob", "Adams"));

        // Print unsorted list
        System.out.println("Before Sorting:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // Sort the list using the custom comparator
        Collections.sort(customers, new CustomerComparator());

        // Print sorted list
        System.out.println("\nAfter Sorting:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
