package session07.baitap04;

public class ClassRoom {
    private String className;
    private static double classFund;
    public ClassRoom(String className) {
        this.className = className;
    }
    public void contribute(double money) {
        classFund += money;
        System.out.println(className + "đã đóng " + money + " vào quỹ");
    }
   public static void showFund(){
       System.out.println("Tổng quỹ lớp đã đóng: " + classFund);
   }
}
