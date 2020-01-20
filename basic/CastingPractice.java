package basic;

public class CastingPractice {

	public static void main(String[] args) {
		/* 
		 * 묵시적 형 변환 (작은 자료형 => 큰 자료형)
		 * 명시적 형 변환 (큰 자료형 => 작은 자료형)
		 * test (큰 자료형 : double형, 작은 자료형 : int형)
		 */
		int intNum=10; // 작은 자료형
		double doubleNum=20.5; // 큰 자료형
		double testDouble=intNum; // double형에 intNum의 모든 정보를 담을 수 있기 때문에 명시적으로 캐스팅 하지 않아도 묵시적으로 캐스팅 된 후 assign
		System.out.println(testDouble); // 10.0 출력
		// int testInt=doubleNum; // int형에 doubleNum의 모든 정보를 담을 수 없기 때문에 명시적으로 캐스팅 하지 않으면 에러발생 -> 주석처리
		int testInt=(int)doubleNum; // 10.0에서의 자료손실을 감수하고 명시적 형 변환 -> (int)
		System.out.println(testInt); // 20이 출력 doubleNUm의 소수점 아래 정보는 담지 못 했다.
	}

}
