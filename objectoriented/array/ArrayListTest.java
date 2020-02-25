package objectoriented.array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        // 쓰고싶은 클래스를 <> 안에다 써줌(쓰는걸 권장)

        list.add("111");
        list.add("222");
        list.add("333");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        // 향상된 for문
        for (String s : list) {
            System.out.println(s);
        }
    }

}
