package objectoriented;

public class Employee { // public => 접근제어자, 클래스명은 항상 대문자
	public int employeeId; // employee의 속성(propery, attribute)들
	public String employeeName;
	public String employeePosition;
	
	public void showInformation() { // employee의 메서드
		System.out.println(employeeId+", "+employeeName+", "+employeePosition);
	}
}