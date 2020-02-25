package objectoriented.array;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("수학", "park");
        library[1] = new Book("영어", "park");
        library[2] = new Book("과학", "park");
        library[3] = new Book("체육", "park");
        library[4] = new Book("미술", "park");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            // 각각의 address 출력
            library[i].showBookInfo();
            // 배열마다의 정보 출력
        }

    }

}
