package session07.baitap06;

public class User {
    public final int id; // ID không thể sửa
    public String username;
    public String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}
