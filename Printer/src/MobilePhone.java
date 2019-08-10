import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactList;

    public MobilePhone() {
        contactList = new ArrayList<Contacts>();
    }

    public void addContact(String name, long phoneNo) {
        Contacts contact = new Contacts(name, phoneNo);
        if(FindContactByNumber(phoneNo) != -1) {
            System.out.println("Contact Number Already Exists");
        }
        else{
            contactList.add(contact);
            System.out.println("Contact added successfully!");
        }
    }

    public void printContacts() {
        System.out.println("You have " + contactList.size() + " contacts in your contact list.");
        System.out.println("   Name         PhoneNumber");
        for (int i = 0; i < contactList.size(); i++)
            System.out.println((i + 1) + ". Name:-" + contactList.get(i).getName()
                    + "    Phone No.:-" + contactList.get(i).getPhoneNo());
    }

    public void updateContactList(int position, String updatedName, long updatedNumber) {
        Contacts contact = new Contacts(updatedName, updatedNumber);
        contactList.set(position - 1, contact);
        System.out.println("Contact updated successfully!!");
    }

    public void DeleteContactByName(String Name) {
        boolean k = true;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(Name)) {
                contactList.remove(i);
                System.out.println("Contact removed successfully!");
                k = false;
            }
        }
        if (k)
            System.out.println("Name " + Name + " not found in the phonebook.");
    }

    public void DeleteContactByNumber ( long Number){
        boolean l = true;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNo() == Number) {
                contactList.remove(i);
                System.out.println("Contact removed successfully!");
                l = false;
            }
        }
        if (l)
            System.out.println("Name " + Number + " not found in the phonebook.");
    }

    public int FindContactByName(String Name){
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(Name))
                return i+1;
        }
        return -1;
    }

    public int FindContactByNumber(long phoneNo){
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNo() == phoneNo)
                return i+1;
        }
        return -1;
    }
}