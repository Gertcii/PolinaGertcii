package homework6.entity;

public class User {

    public static final User Roman =
            new User("Roman", "Jdi1234", "ROMAN IOVLEV");

    private String name;
    private String password;
    private String userName;

    public User(String name, String password, String userName) {
        this.name = name;
        this.password = password;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
