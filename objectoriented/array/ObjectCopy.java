package objectoriented.array;

public class ObjectCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("수학", "park");
        library[1] = new Book("영어", "park");
        library[2] = new Book("과학", "park");
        library[3] = new Book("체육", "park");
        library[4] = new Book("미술", "park");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        /*
         * for( Book book : copyLibrary) { // 향상된 for문 book.showBookInfo(); }
         */

        library[0].setTitle("음악");
        library[0].setAuthor("Lee");

        for (Book book : library) { // 향상된 for문
            book.showBookInfo();
        }

        System.out.println("=============");

        for (Book book : copyLibrary) { // 향상된 for문
            book.showBookInfo();
        }

        // 양쪽의 결과값이 똑같음 => 얕은복사!!
        // 얕은 복사 => 실제로 인스턴트가 생기는게 아니라 주소만 복사됨

        // 깊은 복사 => 일일히 객체를 새로만들어서 대입해야됨(인스턴스가 구별)

    }
}
