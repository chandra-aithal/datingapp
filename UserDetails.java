package com.usr.dating.domain;

import java.util.List;
import java.util.Objects;

public class UserDetails {

    private String name;
    private String gender;
    private int age;
    private List<UserInterest> interests;

    public UserDetails(String userName, String gender, int age, List<UserInterest> interests){
        this.name = userName;
        this.gender = gender;
        this.age = age;
        this.interests  = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<UserInterest> getInterests() {
        return interests;
    }

    public void setInterests(List<UserInterest> interests) {
        this.interests = interests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
