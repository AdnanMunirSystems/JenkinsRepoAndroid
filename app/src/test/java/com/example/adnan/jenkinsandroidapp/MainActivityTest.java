package com.example.adnan.jenkinsandroidapp;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;


//

/**
 * Created by Adnan on 7/28/16.
 */
@Config(emulateSdk = 18, reportSdk = 18,manifest=Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }
}
