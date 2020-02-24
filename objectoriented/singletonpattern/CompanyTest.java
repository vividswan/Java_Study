package objectoriented.singletonpattern;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();

        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        // 동일한 address 출력

        Calendar calendar = Calendar.getInstance();
        // java.util에 있는 singletone pattern
    }

}
