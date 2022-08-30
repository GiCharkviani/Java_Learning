import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public Branch addBranch(String name) {
        if (findBranch(name) == null) {
            Branch branch = new Branch(name);
            branch.addCustomer("Unknown customer", 2d);
            branches.add(branch);
            return findBranch(name);
        } else {
            System.out.println("Branch " + name + " already exists.");
            return null;
        }
    }

    public void addTransactionTo(String branchName, String customerName, double transaction) {
        Branch foundBranch = findBranch(branchName);

        if(foundBranch != null) {
            Customer foundCustomer = foundBranch.findCustomer(customerName);
            foundCustomer.addTransaction(transaction);
        }
    }

    public void printBranches() {
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            System.out.println("\n----- * ------");
            System.out.println("Branch with name " + branch.getName() + " has following customers: \n");
            branch.printCustomers();
        }

    }

    private Branch findBranch(String name) {
        Branch foundBranch = null;
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).name.equals(name)) {
                foundBranch = branches.get(i);
                break;
            }
        }
        return foundBranch;
    }

}
