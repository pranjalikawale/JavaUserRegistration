package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    static final String MOBILE_PATTERN="^[0-9]{2}[ ][0-9]{10}$";

    public boolean isValidName(String name)
    {
        return Pattern.compile(NAME_PATTERN).matcher(name).matches();
    }
    public boolean isValidMobileNos(String mobile)
    {
        return Pattern.compile(MOBILE_PATTERN).matcher(mobile).matches();
    }
}
