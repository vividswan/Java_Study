package basic;

public class ShortCircuitPractice {

	public static void main(String[] args) {
		 //논리 and와 or 연산자에서의 단락회로평가(Short Circuit Evaluation) 테스트
		int numOne = 10;
		int numTwo = 20;
		boolean cheakAnd= (++numOne<10) && (++numTwo<20);
		System.out.println(cheakAnd); // false 출력
		System.out.println("numOne:"+numOne+" numTwo:"+numTwo); // numOne:11 numTwo:20 출력
		// ++numTwo는 실행되지 않았다. ((++numOne<10)이 false이기 때문에 끝까지 연산하지 않는다.)
		numOne = 10;
		boolean cheakOr= (++numOne>10) || (++numTwo>20);
		System.out.println(cheakOr);
		System.out.println("numOne:"+numOne+" numTwo:"+numTwo); // numOne:11 numTwo:20 출력
		// ++numTwo는 실행되지 않았다. ((++numOne>10)이 true이기 때문에 끝까지 연산하지 않는다.)
	}

}
