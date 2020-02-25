package objectoriented.inheritance;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    // protected => 외부 클래스는 private, 하위 클래스는 public
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        // 보너스 포인트만 적립
        return price;
    }

    public String ShowCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며 적립된 보너스 포인트는" + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}
