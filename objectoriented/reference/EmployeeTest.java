package objectoriented.reference;

public class EmployeeTest {

	public static void main(String[] args) { // main에서 시작
		Employee employeePark = new Employee(); // new => 새로운 클래스를 만들겠다는 선언
		employeePark.employeeId = 1234;
		employeePark.employeeName = "vividswan";
		employeePark.employeePosition = "master";

		employeePark.showInformation(); // 1234, vividswan, master 출력
	}

}