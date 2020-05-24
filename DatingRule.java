package com.usr.dating.Rules;

import com.usr.dating.domain.UserDetails;

import java.util.List;

public interface DatingRule {

   public List<UserDetails> identifyMatch(UserDetails userDetails, List<UserDetails> userList);
}
