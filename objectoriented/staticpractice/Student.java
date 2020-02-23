package staticpractice;

public class Student {
	private static int serialNum = 1000; 
	// �ν���Ʈ�� ������� �л��� �߰��� �� ���� number�� �߰����ְ���� => static ���!!
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName=name;
		serialNum++;
		studentID= serialNum; // serialNum�� �й����� ���
	}
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		address="�ּ� ����";
		serialNum++;
		studentID= serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public static int getSerialNum() {
		return serialNum;
		// studentName="Lee"; �ν���Ʈ ������ static �޼��忡�� ���Ұ�
	}
	// static method = class method
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
