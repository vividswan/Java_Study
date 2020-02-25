package objectoriented.array;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        System.arraycopy(arr1, 0, arr2, 1, 3);
        // System class의 static method
        // arr1의 0번째부터를 arr2의 1부터 3개 복사

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            // 1 10 20 30 5 출력
        }
    }

}
