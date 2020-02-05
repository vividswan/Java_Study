package objectoriented.constructor;

public class Student {

    int studentID;
    String studentName;

    // 참조자료형 => 속성들이 개별적인 객체가 될 수 있다.

    Subject korea; // 참조 자료형의 변수로 선언
    Subject math;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Subject(); // 시용하기 위해선 생성해야됨!!(생성자로)
        math = new Subject();
    }

    // 생성자로 먼저 생성되었기 때문에 사용가능 (안되면 사용 불가능)

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점!");
    }

}
