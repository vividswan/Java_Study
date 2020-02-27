package objectoriented.inheritance;

public class VIPCustomer extends Customer {

    // Customer를 상속!

    // private int customerID;
    // private String customerName;
    // private String customerGrade;
    // int bonusPoint;
    // double bonusRatio;

    // 상속을 받게되면 다시 쓸 필요가 없다.

    double salesRatio;

    /*
     * public VIPCustomer() {
     * 
     * super(); // precompile 단계에 들어감, 상위 클래스의 메모리위치(참조값)을 가지고있음 customerGrade =
     * "VIP"; // 상위 클래스에서 protected라 사용가능! bonusRatio = 0.05; salesRatio = 0.1;
     * 
     * System.out.println("VIPCustomer() 생성자 호출"); }
     */

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";

        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    @Override // 오버라이딩
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }

}
