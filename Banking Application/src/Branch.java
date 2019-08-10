import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public boolean addCustomer(String name, double trans){
        if(findCustomer(name) == null) {
            customerList.add(new Customer(name, trans));
            return true;
        }
        return false;
    }

    public boolean transaction(String name, double trans) {
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.makeTransaction(trans);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for(int i = 0; i < this.customerList.size(); i ++) {
            Customer checkedCustomer = this.customerList.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
