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
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidEmail("abc12@bridgelabzgmail.com"));
    }
    @Test
    public void givenEmail_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidEmail("abc.1#2@bridgelabzgmail.com"));
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidPassword("Pranjali"));
    }
    @Test
    public void givenPassword_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidPassword("pranjali"));
    }
}
