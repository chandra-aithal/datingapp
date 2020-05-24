package com.usr.dating.service;

import com.usr.dating.domain.UserDetails;
import com.usr.dating.domain.UserInterest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


class DatingServiceTest {

    DatingService service = new DatingService();

    @Test
    public void findMatchByUser() {
        List<UserInterest> interests = new ArrayList<>();
        UserInterest userInterest1 = new UserInterest("Cricket");
        UserInterest userInterest2 = new UserInterest("Football");
        interests.add(userInterest1);
        interests.add(userInterest2);
        UserDetails details = new UserDetails("UserG", "Male", 28, interests);
        service.findMatchByUser(details);

    }
}