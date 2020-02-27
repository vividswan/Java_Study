package objectoriented.array;

public class TwoDimension {

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 } };

        System.out.println(arr.length); // 행의 개수(2출력)
        System.out.println(arr[0].length); // 열의 개수(3출력)
        System.out.println(arr[1].length); // 열의 개수(4출력)

        System.out.println("==================");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // 개행 x
            }
            System.out.println();
            // 한 행을 출력할 때 마다 개행 한 번 씩 출력!
        }
    }

}
