import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchList = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branchList = branchList;
    }

    public boolean addBranch(String branch) {
        if(findBranch(branch) == null) {
            this.branchList.add(new Branch(branch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double iniTrans) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomer(name, iniTrans);
        }

        return false;
    }

    public boolean makeTrans(String branchName, String name, double trans) {
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.transaction(name, trans);
        }

        return false;
    }

    public boolean printCustomerList(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomerList();

            for (int i = 0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName());
            }
            return true;
        }
        else {
            System.out.println("Branch Not Found! Try Again");
            return false;
        }

    }

    private Branch findBranch(String Branchname) {
        for(int i = 0; i < this.branchList.size(); i ++) {
            Branch checkedBranch = this.branchList.get(i);
            if (checkedBranch.getName().equals(Branchname)) {
                return checkedBranch;
            }
        }
        return null;
    }

}