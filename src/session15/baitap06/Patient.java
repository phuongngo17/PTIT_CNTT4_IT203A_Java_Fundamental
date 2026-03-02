package session15.baitap06;

public class Patient {

    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + age + " - " + gender);
    }
}