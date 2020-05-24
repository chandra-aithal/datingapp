package com.usr.dating.Rules;

import com.usr.dating.domain.UserDetails;
import com.usr.dating.util.MatchNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeRule implements DatingRule {
    @Override
    public List<UserDetails> identifyMatch(UserDetails userDetails, List<UserDetails> userList) {
        List<UserDetails>details = new ArrayList<>();
        details.add(getClosestAgeMatch(userList, userDetails.getAge()));

        return details;
    }

    private UserDetails getClosestAgeMatch(List<UserDetails> userDetailsList, int age){
        return  userDetailsList.stream()
                .min(Comparator.comparingInt(data -> Math.abs(data.getAge()-age)))
                .orElseThrow(() -> new MatchNotFoundException("Age is not matching"));
    }


}
