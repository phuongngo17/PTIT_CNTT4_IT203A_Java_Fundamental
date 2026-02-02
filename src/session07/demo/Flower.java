package session07.demo;

public class Flower {
    private final int id;   // final
    private String name;
    private String from;

    public Flower(int id, String name, String from) {
        this.id = id;
        this.name = name;
        this.from = from;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void showInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", From: " + from);
    }
}

