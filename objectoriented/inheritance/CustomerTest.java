package objectoriented.inheritance;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "Lee");
        // customerLee.setCustomerName("Lee");
        // customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.ShowCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(100020, "KIM");
        // customerKim.setCustomerName("KIM");
        // customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.ShowCustomerInfo());

    }

}
