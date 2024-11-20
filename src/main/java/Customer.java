public class Customer extends Person{

    private String customerNum;

    private boolean mailingList;

    public Customer(String name, String address, String number, String customerNum, boolean mailingList) {
        super(name, address, number);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super .toString() + "Customer{" +
                "customerNum='" + customerNum + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public Customer() {
        customerNum = " ";
        mailingList = false;
    }
}
