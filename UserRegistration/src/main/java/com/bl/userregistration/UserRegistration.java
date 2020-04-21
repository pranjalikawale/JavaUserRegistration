package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    static final String MOBILE_PATTERN="^[0-9]{2}[ ][0-9]{10}$";
    static final String EMAIL_PATTERN="^[a-z]{1}[a-z0-9]{1,}([.|_|+|-]?[a-z0-9]{1,}+)?@[a-z0-9]{1,}([.][a-z]{2,4})([.][a-z]{2})?$";
    static final String PASSWORD_PATTERN="(?=.*[A-Z])(?=.*[0-9])(?=.*[#|?|!|@|$|%|^|&|*|-]*$)^[a-zA-Z]{1}[a-zA-Z0-9#?!@$%^&*-]{7,}$";

    public boolean isValidName(String name)
    {
        return Pattern.compile(NAME_PATTERN).matcher(name).matches();
    }
    public boolean isValidMobileNos(String mobile)
    {
        return Pattern.compile(MOBILE_PATTERN).matcher(mobile).matches();
    }
    public boolean isValidEmail(String email)
    {
        return Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
    }
    public boolean isValidPassword(String password)
    {
        return Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
    }
}
