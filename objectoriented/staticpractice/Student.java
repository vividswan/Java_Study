package objectoriented.staticpractice;

public class Student {
	private static int serialNum = 1000;
	// 인스턴트에 관계없이 학생이 추가될 때 마다 number를 추가해주고싶음 => static 사용!!
	private int studentID;
	public String studentName;
	public String address;

	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum; // serialNum을 학번으로 사용
	}

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		return serialNum;
		// studentName="Lee"; 인스턴트 변수는 static 메서드에서 사용불가
	}
	// static method = class method

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
