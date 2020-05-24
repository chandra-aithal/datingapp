package com.usr.dating.service;

import com.usr.dating.Rules.AgeRule;
import com.usr.dating.Rules.DatingRule;
import com.usr.dating.Rules.GenderRule;
import com.usr.dating.Rules.InterestRule;
import com.usr.dating.domain.UserDetails;

import java.util.ArrayList;
import java.util.List;

public class DatingRecommendationEngine {

    public List<UserDetails> recommend(UserDetails userDetails, List<UserDetails> registeredUsers) {
        List<UserDetails> matchedList = new ArrayList<>();
        //Gender rule evaluation
        DatingRule rule = new GenderRule();
        List<UserDetails> matchingUsers = new ArrayList<>();
        List<UserDetails> filteredGenderUsers = rule.identifyMatch(userDetails, registeredUsers);
        //Age rule evaluation
        rule = new AgeRule();
        matchedList.addAll(rule.identifyMatch(userDetails, filteredGenderUsers)) ;
        //Interest rule evalutation
        rule = new InterestRule();
        matchedList.addAll(rule.identifyMatch(userDetails, registeredUsers));
        return matchedList;
    }


}
