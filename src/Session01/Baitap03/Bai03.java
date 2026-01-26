package Session01.Baitap03;

public class Bai03 {
    public static void main(String[] args) {
        String book1 = "Java Basic ";
        String book2 = "Python Intro";

        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + " , Book2 = " + book2);
        String temp = book1;
        // temp = book1; temp trên Stack trỏ tới cùng vùng nhớ Heap mà book1 đang trỏ ("Java Basic").
        book1 = book2;
        // Bước 2: book1 = book2;
        // book1 thay đổi tham chiếu, giờ trỏ tới vùng nhớ Heap chứa "Python Intro"
        book2 = temp ;
        // Bước 3: book2 = temp;
        //→ book2 trỏ lại vùng nhớ Heap chứa "Java Basic"

        System.out.println("Sau khi hoán đổi: Book1 = " + book1 + " , Book2 = " + book2);

    }
}
