package objectoriented.inheritance;

public class OverridingTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(100020, "KIM");
        customerKim.bonusPoint = 10000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.ShowCustomerInfo() + "지불금액은 " + priceLee + "원");
        // 지불금액 10000원 출력
        System.out.println(customerKim.ShowCustomerInfo() + "지불금액은 " + priceKim + "원");
        // 지불금액 9000원 출력

        Customer customerPark = new VIPCustomer(10030, "PARK");
        customerPark.bonusPoint = 10000;

        System.out.println(customerPark.ShowCustomerInfo() + "지불금액은 " + customerPark.calcPrice(10000) + "원");
        // 지불금액 9000원 출력 => 실제 method는 인스턴스의 method(가상 method)!!**

    }

}