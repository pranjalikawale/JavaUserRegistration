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
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidName("Kawale"));
    }
    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidName("Ka"));
    }
    @Test
    public void givenMobileNos_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidMobileNos("91 2341567890"));
    }
    @Test
    public void givenMobileNos_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidMobileNos("91 341567890"));
    }


}
