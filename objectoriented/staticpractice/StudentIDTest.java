package objectoriented.staticpractice;

public class StudentIDTest {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		// 인스턴스의 생성과는 상관없이 static 변수 사용 가능!

		Student studentPark = new Student("Park");
		System.out.println(Student.getSerialNum()); // 1001
		// static 변수는 참조변수를 access하는게 아니고 class를 access
		// studentPark을 Student로 바꿔도 똑같다.

		Student studentKim = new Student("Kim");

		System.out.println(Student.getSerialNum()); // 1002
		System.out.println(Student.getSerialNum()); // 1002
		// 둘 다 1002 => 두 개가 같은 메모리를 공유하고있다.

		// 데이터영역 : serialNum, 스택 메모리 : studentPark, studentKim, 힙: studentPark 인스턴스,
		// studentKim 인스턴스

		System.out.println(studentPark.getStudentID());
		// 1001 출력
		System.out.println(studentKim.getStudentID());
		// 1002 출력
	}

}
