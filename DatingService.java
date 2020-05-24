package com.usr.dating.service;

import com.usr.dating.domain.UserDetails;
import com.usr.dating.repository.RegisteredUsers;

import java.util.List;

public class DatingService {

    private  DatingRecommendationEngine engine;

    public List<UserDetails> findMatchByUser(UserDetails user){
        List<UserDetails> registeredUsers = RegisteredUsers.getRegisterdUsers();
        engine = new DatingRecommendationEngine();
        List<UserDetails> matchedUsers =  engine.recommend(user, registeredUsers);
        for(UserDetails de :matchedUsers){
            System.out.println(de.getName());
            System.out.println(de.getAge());
        }
        return  matchedUsers;

    }
}
