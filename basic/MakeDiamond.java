package basic;
import java.util.Scanner;
public class MakeDiamond {

	public static void main(String[] args) {
		// 반복문을 활용하여 주어진 수가 가운데인 다이아몬드 만들기
		System.out.println("홀수를 입력하시오.");
		int num;
		Scanner scanner =new Scanner(System.in);
		num=scanner.nextInt();
		scanner.close();
		for(int i=0;i<num/2;i++) {
			for(int j=0;j<num;j++) {
				if(num/2-i<=j && j<=num/2+i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=(num-1)/2;i>=0;i--) {
			for(int j=0;j<num;j++) {
				if(num/2-i<=j && j<=num/2+i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
