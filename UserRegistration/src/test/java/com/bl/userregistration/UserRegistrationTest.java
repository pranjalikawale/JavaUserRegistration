package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidName("Pranjali"));
    }
    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidName("Pr"));
    }
    
}
