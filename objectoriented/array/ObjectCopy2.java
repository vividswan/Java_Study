package objectoriented.array;

public class ObjectCopy2 {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("수학", "park");
        library[1] = new Book("영어", "park");
        library[2] = new Book("과학", "park");
        library[3] = new Book("체육", "park");
        library[4] = new Book("미술", "park");

        // 깊은 복사 과정
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        // for문으로 직접 값 할당
        for (int i = 0; i < copyLibrary.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("음악");
        library[0].setAuthor("Lee");

        for (Book book : library) { // 향상된 for문
            book.showBookInfo();
        }
        // library[0] => 음악,Lee 출력

        System.out.println("=============");

        for (Book book : copyLibrary) { // 향상된 for문
            book.showBookInfo();
        }
        // copy:Lbrary[0] => 수학,Park 출력

    }
}
