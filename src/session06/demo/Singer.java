package session06.demo;

public class Singer {
    private String singerId;
    private String fullName;
    private String gender;
    private String birthDate;
    private String hometown;
    private int startYear;
    private String field;

    public Singer(){

    };
    public Singer(String singerId, String fullName, String gender, String birthDate, String hometown, int startYear, String field) {
        this.singerId = singerId;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hometown = hometown;
        this.startYear = startYear;
        this.field = field;
    }

    public String getSingerId() {
        return singerId;
    }

    public void setSingerId(String singerId) {
        this.singerId = singerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void display(){
        System.out.println("Mã ca sĩ: " + singerId);
        System.out.println("Tên: " + fullName);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("Quê quán: " + hometown);
        System.out.println("Năm bắt đầu sự nghiệp: " + startYear);
        System.out.println("Lĩnh vực: " + field);

    }
}
