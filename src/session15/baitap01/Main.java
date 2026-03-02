package session15.baitap01;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory recordHistory = new MedicalRecordHistory();
        recordHistory.addEdit(new EditAction("Sửa thông tin bệnh nhân", "2026-03-02 08:00"));
        recordHistory.addEdit(new EditAction("Thêm kết quả xét nghiệm", "2026-03-02 08:15"));
        recordHistory.addEdit(new EditAction("Cập nhật đơn thuốc", "2026-03-02 08:30"));

        recordHistory.displayHistory();
        System.out.println("Chỉnh sửa gần nhất: " + recordHistory.getLatestEdit());
        System.out.println("Hoàn tác: " + recordHistory.undoEdit());
        recordHistory.displayHistory();
    }
}
