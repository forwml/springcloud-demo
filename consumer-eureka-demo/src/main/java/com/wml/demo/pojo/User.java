package com.wml.demo.pojo;

public class User {

    private Integer id;

    private  String name;

    private  String role;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}
