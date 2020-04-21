package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    public boolean isValidName(String name)
    {
        return Pattern.compile(NAME_PATTERN).matcher(name).matches();
    }
}
