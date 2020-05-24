package com.usr.dating.domain;

import java.util.Objects;

public class UserInterest {

    private String interest;

    public UserInterest(){

    }

    public UserInterest(String interest){
        this.interest = interest;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInterest that = (UserInterest) o;
        return Objects.equals(interest, that.interest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interest);
    }

    @Override
    public String toString() {
        return "UserInterest{" +
                "interest='" + interest + '\'' +
                '}';
    }
}
