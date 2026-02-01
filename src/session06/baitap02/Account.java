package session06.baitap02;

public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public boolean changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword)) {
            System.out.println("Mật Khẩu không đúng cũ không đúng");
        }
        if (oldPassword.equals(newPassword)) {
            System.out.println("Mật khẩu mới k được trùng mật khẩu cũ");
        }
        password = newPassword;
        System.out.println("Đổi mật khẩu thành công");
        return true;
    }
    public void displayAccount() {
        System.out.println("Username: " + username);
        System.out.println("Password: ********");
        System.out.println("Email: " + email);
    }
}
