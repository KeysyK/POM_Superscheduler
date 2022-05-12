package models;

public class Auth {
    private String email;
    private String password;

    public Auth withEmail(String email) {
        this.email = email;
        return this;
    }
    public Auth withPassword(String password) {
        this.password = password;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
