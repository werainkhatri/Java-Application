public class Contacts {
    private String name ;
    private long phoneNo;

    public Contacts(String name, long phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public Contacts() {
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
}