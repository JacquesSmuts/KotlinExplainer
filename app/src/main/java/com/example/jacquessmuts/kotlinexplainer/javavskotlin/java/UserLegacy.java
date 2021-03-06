package com.example.jacquessmuts.kotlinexplainer.javavskotlin.java;

/**
 * Created by jacquessmuts on 2018/02/15.
 * This is one of those legacy files that are a bit of a mess
 */

public class UserLegacy {

    private long id;
    private String username;
    private String password; //save this to analytics and collect passwords
    private Type type;

    public enum Type {
        WHALE, DOLPHIN, GOLDFISH;
    }

    public UserLegacy(long id) {
        this.id = id;
        this.username = "Hello There";
        this.password = "General Kenobi";
        this.type = Type.GOLDFISH;
    }

    //CONSTRUCTOR
    public UserLegacy(long id, String username, String password, Type type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    //GETTERS AND SETTERS

    public long getTheId() {
        return id;
    }

    public void setNewId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setNewUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return password;
    }

    public void setNewPassword(String password) {
        this.password = password;
    }

    public Type getType() {
        return type;
    }

    public void setNewType(Type type) {
        this.type = type;
    }

    //Important to create your own definition of .equals for all classes
    @Override
    public boolean equals(Object obj) {
        UserLegacy userJava = (UserLegacy) obj;
        return getTheId() == userJava.getTheId();
    }
}
