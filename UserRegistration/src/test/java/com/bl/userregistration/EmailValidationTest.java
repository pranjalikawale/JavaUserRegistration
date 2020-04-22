package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private String emailSample;
    private boolean isValid;
    UserRegistration userRegistration;

    public EmailValidationTest(String emailSample,boolean isValid)
    {
        this.emailSample=emailSample;
        this.isValid=isValid;
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",false},
                {"abc-gmail.com",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}
        });
    }
    @Before
    public void invokeConstructor()
    {
        userRegistration=new UserRegistration();
    }
    @Test
    public void EmailValidationTest()
    {
        Assert.assertEquals(isValid,userRegistration.isValidEmail(emailSample));
    }
}
