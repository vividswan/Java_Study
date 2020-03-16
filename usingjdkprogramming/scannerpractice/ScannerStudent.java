package scannerpractice;

import java.util.Scanner;

public class ScannerStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int studentNumber;
        int age;

        System.out.println("이름: ");
        name = scanner.nextLine();

        System.out.println("학번: ");
        studentNumber = scanner.nextInt();

        System.out.println("나이: ");
        age = scanner.nextInt();

        System.out.println("학생의 이름은 " + name + ", 학번은 " + studentNumber + ", 나이는 " + age + "입니다!");

        scanner.close();
    }

}
