import java.util.ArrayList;

public class Branch {
    String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
    }

    public Customer addCustomer(String name, double transaction) {
        Customer customer = new Customer(name, transaction);
        customers.add(customer);
        return customer;
    }

    public void printCustomers() {
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("\tCustomer " + customer.getName() + " has following transactions: ");
            customer.printTransactions();
        }
    }

    public Customer findCustomer(String name) {
        Customer foundCustomer = null;
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(name)) {
                foundCustomer = customers.get(i);
                break;
            }
        }
        return foundCustomer;
    }
}
