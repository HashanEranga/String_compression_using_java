package com.hashan.solid.o.solution.validator;

import com.hashan.solid.o.solution.User;

public class PersonalLoanValidator implements Validator{
    @Override
    public boolean isValid(User user){
        return true;
    }
}
