package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;

public class RolesValidatorJava implements ConstraintValidator<ValidateRolesJava, Collection<String>> {
    @Override
    public boolean isValid(Collection<String> value, ConstraintValidatorContext context) {
        return false;
    }
}
