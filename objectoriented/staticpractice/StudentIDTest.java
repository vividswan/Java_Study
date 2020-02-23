package staticpractice;

public class StudentIDTest {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		// �ν��Ͻ��� �������� ������� static ���� ��� ����!
		
		Student studentPark = new Student("Park");
		System.out.println(studentPark.getSerialNum()); // 1001
		// static ������ ���������� access�ϴ°� �ƴϰ� class�� access
		// studentPark�� Student�� �ٲ㵵 �Ȱ���.
		
		Student studentKim = new Student("Kim");
		
		System.out.println(studentKim.getSerialNum()); // 1002
		System.out.println(studentPark.getSerialNum()); // 1002
		// �� �� 1002 => �� ���� ���� �޸𸮸� �����ϰ��ִ�.
		
		// �����Ϳ��� : serialNum, ���� �޸� : studentPark, studentKim, ��: studentPark �ν��Ͻ�, studentKim �ν��Ͻ�
		
		
		System.out.println(studentPark.getStudentID());
		// 1001 ���
		System.out.println(studentKim.getStudentID());
		// 1002 ���
	}

}
