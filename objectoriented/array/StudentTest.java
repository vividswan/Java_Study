package objectoriented.array;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 90);
        studentLee.addSubject("수학", 100);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 95);
        studentKim.addSubject("수학", 80);
        studentKim.addSubject("영어", 100);

        studentKim.showStudentInfo();
        /*
         * Kim학생의 국어과목의 성적은95입니다. Kim학생의 수학과목의 성적은80입니다. Kim학생의 영어과목의 성적은100입니다. Kim학생의
         * 총점은275점 입니다!
         */
        System.out.println("=====================");
        studentLee.showStudentInfo();
        /*
         * Lee학생의 국어과목의 성적은90입니다. Lee학생의 수학과목의 성적은100입니다. Lee학생의 총점은190점 입니다!
         */
    }

}
