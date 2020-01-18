package basic;
import java.util.Scanner;

public class SwitchCasePractice {

	public static void main(String[] args) {
		// 2월이 28일이라고 가정할 때, switch-case문을 이용해 각 달 수를 출력하기
		System.out.println("월을 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int daySize;
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 이런식의 표현도 가능, case는 왠만하면 들여쓰기 해두자!
				daySize = 31;
				break;
			case 2:
				daySize = 28;
				break;
			case 4: case 6: case 9: case 11:
				daySize = 30;
				break;
			default: // 월을 잘 못 입력했을 땐, daySize가 초기화가 안 되있으므로 default를 통해 0으로 초기화 
				daySize = 0;
		}
		if(daySize==0) System.out.println("틀린 달 입니다.");
		else {
			System.out.println(month+"달은 "+daySize+"일 입니다!");
		}
	}

}
