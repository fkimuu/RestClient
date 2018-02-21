package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true, value="id")
public class Result {

    private String id;
    private String firstname;
    private String lastname;
    private String age;

    public Result() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname2) {
        this.firstname = firstname2;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname2) {
        this.lastname = lastname2;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age2) {
        this.age =age2;
    }

    @Override
    public String toString() {
        return "Result [id =" + id + "firstname=" + firstname + ", lastname=" + lastname
                + ",age=" + age + "]";
    }
}
