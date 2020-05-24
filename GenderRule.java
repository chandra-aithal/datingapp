package com.usr.dating.Rules;

import com.usr.dating.domain.UserDetails;
import com.usr.dating.repository.RegisteredUsers;

import java.util.List;
import java.util.stream.Collectors;

public class GenderRule implements  DatingRule{

    @Override
    public List<UserDetails> identifyMatch(UserDetails userDetails, List<UserDetails> userList) {
        List<UserDetails> details=  userList.stream().filter(
                user  ->user.getGender().equalsIgnoreCase(userDetails.getGender())).collect(Collectors.toList());
        return details;
    }
}
