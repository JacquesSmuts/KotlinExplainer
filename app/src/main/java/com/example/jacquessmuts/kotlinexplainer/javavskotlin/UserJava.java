package com.example.jacquessmuts.kotlinexplainer.javavskotlin;

/**
 * Created by jacquessmuts on 2018/02/15.
 */

public class UserJava {

    private long id;
    private String username;
    private String password; //save this to analytics and collect passwords
    private Type type;

    public enum Type {
        WHALE, DOLPHIN, GOLDFISH;
    }

    public UserJava(long id) {
        this.id = id;
        this.username = "Hello There";
        this.password = "General Kenobi";
        this.type = Type.GOLDFISH;
    }

    //CONSTRUCTOR
    public UserJava(long id, String username, String password, Type type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    //GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    //Important to create your own definition of .equals for all classes
    @Override
    public boolean equals(Object obj) {
        UserJava userJava = (UserJava) obj;
        return getId() == userJava.getId();
    }
}
