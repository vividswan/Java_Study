package objectoriented.interfacepractice;

public class CalcTest {

	public static void main(String[] args) {
		
		CompleteCalc calc = new CompleteCalc();
		// Calc, Calculator로도 선언 가능,
		// Calc를 사용하면 showInfo() 메서드 사용 불가!
		int n1=10;
		int n2=2;
		
		System.out.println(calc.add(n1, n2)); // 12
		System.out.println(calc.substract(n1, n2)); // 8
		System.out.println(calc.times(n1, n2)); // 20
		System.out.println(calc.divide(n1, n2)); // 5
		calc.showInfo(); // 모두 구현하였습니다.
	}

}
