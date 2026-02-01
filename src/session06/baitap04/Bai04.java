package session06.baitap04;

public class Bai04 {
    public static void main(String[] args) {
        Employee em = new Employee();

        em.display();

        Employee em1 = new Employee("001","Nguyễn Văn A");
        em1.display();

        System.out.println("--------------------");

        Employee em2 = new Employee("002","Trần Thị B", 6000000);
        em2.display();


    }
}
