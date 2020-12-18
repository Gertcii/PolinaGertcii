package com.epam.training.center.hw2.enums;

public enum LoginUser {

    DEFAULT_USER(
            "Roman",
            "Jdi1234",
            "ROMAN IOVLEV");

    private final String login;
    private final String password;
    private final String userName;

    LoginUser(String login, String password, String userName) {
        this.login = login;
        this.password = password;
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
