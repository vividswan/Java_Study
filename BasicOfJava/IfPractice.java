package BasicOfJava;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		// if문을 이용한 점수에 따른 성적 출력하기 연습
		
		System.out.println("점수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade;
		
		if(score>=90) grade='A'; // 90~100 점 : A
		else if(score>=80) grade='B'; // 80~89 점 : B
		else if(score>=70) grade='C'; // 70~79 점 : C
		else if(score>=60) grade='D'; // 60~69 점 : D
		else grade='F'; // 0~59점 : F
		
		System.out.println("성적은 "+grade+"입니다.");
	}
	
}