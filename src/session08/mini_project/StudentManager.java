package session08.mini_project;

public class StudentManager {
    private Student[] students = new Student[100];
    private int size = 0;

    public boolean addStudent(Student s) {
        if (size >= students.length) {
            System.out.println("Danh sách đã đầy");
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(s.getStudentId())) {
                System.out.println("Mã sinh viên đã tồn tại");
                return false;
            }
        }

        students[size++] = s;
        return true;
    }
}

