package basic;

public class ContinueBreakPractice {

	public static void main(String[] args) {
		/*
		 * 구구단 출력 연습 (break, continue를 이용한)
		 * 조건 1) 짝수단만 출력
		 * 조건 2) 단보다 곱하는 수가 작거나 같을 때까지만 출력
		 */
		
		for(int dan=2;dan<=9;dan++) {
			if((dan%2)==1) continue;
			for(int count=1;count<=9;count++) {
				if(count>dan) break;
				System.out.println(dan+"x"+count+"="+count*dan);
			}
			System.out.println();
		}
	}

}
