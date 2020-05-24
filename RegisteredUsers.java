package com.usr.dating.repository;

import com.sun.applet2.preloader.event.UserDeclinedEvent;
import com.usr.dating.domain.UserDetails;
import com.usr.dating.domain.UserInterest;

import java.util.ArrayList;
import java.util.List;

public  class RegisteredUsers {


    public static List<UserDetails> getRegisterdUsers(){
        List<UserDetails> registeredUsers = new ArrayList<>();
        List<UserInterest> userInterests = new ArrayList<>();
        userInterests.add(getUserInterest("Cricket"));
        UserDetails user = new UserDetails("UserA", "Female", 25, userInterests);
        registeredUsers.add(user);

        userInterests = new ArrayList<>();
        userInterests.add(getUserInterest("Cricket"));
        userInterests.add(getUserInterest("Football"));
        userInterests.add(getUserInterest("Movies"));
        user = new UserDetails("UserB", "Male", 27, userInterests);
        registeredUsers.add(user);

        userInterests = new ArrayList<>();
        userInterests.add(getUserInterest("Movies"));
        userInterests.add(getUserInterest("Tennis"));
        userInterests.add(getUserInterest("Football"));
        userInterests.add(getUserInterest("Cricket"));
        user = new UserDetails("UserC", "Male", 26, userInterests);
        registeredUsers.add(user);

        userInterests = new ArrayList<>();
        userInterests.add(getUserInterest("Tennis"));
        userInterests.add(getUserInterest("Football"));
        userInterests.add(getUserInterest("Badminton"));
        user = new UserDetails("UserD", "Female", 24, userInterests);
        registeredUsers.add(user);

        userInterests = new ArrayList<>();
        userInterests.add(getUserInterest("Football"));
        userInterests.add(getUserInterest("Movies"));
        userInterests.add(getUserInterest("Badminton"));
        userInterests.add(getUserInterest("Cricket"));

        user = new UserDetails("UserD", "Female", 32, userInterests);
        registeredUsers.add(user);

        registeredUsers.stream().forEach((user3 -> System.out.println(user3.toString())));


        return registeredUsers;




    }

    public static UserInterest getUserInterest(String interest){
       return new UserInterest(interest);

    }
}
