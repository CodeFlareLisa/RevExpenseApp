package com.revature;

public class Employee {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Employee(){

    }

    public Employee(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';

    }

    /*public Employee(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;*/
    }

