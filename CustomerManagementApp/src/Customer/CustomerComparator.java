package Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        int firstNameComparison = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
        if (firstNameComparison != 0) return firstNameComparison;

        int lastNameComparison = c1.getLastName().compareToIgnoreCase(c2.getLastName());
        if (lastNameComparison != 0) return lastNameComparison;

        int idComparison = Integer.compare(c1.getId(), c2.getId());
        if (idComparison != 0) return idComparison;

        return Double.compare(c1.getBalance(), c2.getBalance());
    }
}
