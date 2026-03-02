package session15.baitap03;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions = {"Push", "Push", "Pop", "Pop"};

        boolean result = checker.checkProcess(actions);

        if (result) {
            System.out.println("Quy trình hợp lệ");
        } else {
            System.out.println("Quy trình không hợp lệ");
        }
    }
}