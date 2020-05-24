package com.usr.dating.Rules;

import com.usr.dating.domain.UserDetails;
import com.usr.dating.domain.UserInterest;

import java.util.ArrayList;
import java.util.List;

public class InterestRule implements DatingRule {

    @Override
    public List<UserDetails> identifyMatch(UserDetails userDetails, List<UserDetails> userList) {
        List<UserDetails> returnUserList = new ArrayList<>();
        for(UserDetails user : userList){
            List<UserInterest> interestList = user.getInterests();
            List<UserInterest> userInterestList = userDetails.getInterests();
            for(UserInterest userInterest: interestList){
                if(userInterestList.contains(userInterest.getInterest())){
                    returnUserList.add(user);
                }
            }
        }
        return returnUserList;
    }
}
