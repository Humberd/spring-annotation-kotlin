package com.example.demo.validators;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = RolesValidatorKotlin.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ValidateRolesJava {
    String message() default "{com.example.demo.validators.ValidateRolesJava.message}";

    Class[] groups() default {};

    Class[] payload() default {};
}
