package objectoriented.constructor;

public class StudentTest {

    // 참조자료형을 이용한 실습

    public static void main(String[] args) {
        Student studentPark = new Student(100, "Park");
        studentPark.setKoreaSubject("국어", 80);
        studentPark.setMathSubject("수학", 99);

        Student studentLee = new Student(99, "Lee");
        studentLee.setKoreaSubject("국어", 95);
        studentLee.setMathSubject("수학", 82);

        studentPark.showStudentScore(); // Park학생의 총점은 179점! 출력
        studentLee.showStudentScore(); // Lee학생의 총점은 177점! 출력

    }
}
