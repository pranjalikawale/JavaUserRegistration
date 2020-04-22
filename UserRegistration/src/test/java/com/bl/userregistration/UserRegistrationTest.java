package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// This is the test class for user registration class
public class UserRegistrationTest {
   UserRegistration userRegistration;
   /*
   @Before : Method annotated with @before will execute before all test method run.
   @Test :It indicate this is a test method.
    */
    @Before
    public void invokeConstructor()
    {
        userRegistration=new UserRegistration();
    }
    // Its test the positive case for first name.
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidName("Pranjali"));
    }
    // Its test the negative case for first name
    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidName("Pr"));
    }
    // Its test the positive case for last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidName("Kawale"));
    }
    // Its test the negative case for last name
    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidName("Ka"));
    }
    // Its test the positive case for mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidMobileNos("91 2341567890"));
    }
    // Its test the negative case for mobile number
    @Test
    public void givenMobileNos_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidMobileNos("91 341567890"));
    }
    // Its test the positive case for email
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidEmail("abc12@bridgelabzgmail.com"));
    }
    // Its test the negative case for email
    @Test
    public void givenEmail_WhenImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidEmail("abc.12@bridgelabzgmail.#com"));
    }
    // Its test the positive case for password
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(userRegistration.isValidPassword("Pranjali123@"));
    }
    // Its test the negative case for password with no uppercase
    @Test
    public void givenPassword_WhenNoCapImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidPassword("pran1##"));
    }
    // Its test the negative case for password with no digit
    @Test
    public void givenPassword_WhenNoDigitImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidPassword("Pran##"));
    }
    // Its test the negative case for password with more than one symbol
    @Test
    public void givenPassword_WhenMoreThanOneSymbolImproper_ShouldReturnFalse()
    {
        Assert.assertFalse(userRegistration.isValidPassword("Pran1##"));
    }
}
