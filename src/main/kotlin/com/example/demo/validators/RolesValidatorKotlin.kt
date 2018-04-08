package com.example.demo.validators

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class RolesValidatorKotlin : ConstraintValidator<ValidateRolesKotlin, Collection<String>> {
    override fun isValid(value: Collection<String>?, context: ConstraintValidatorContext?): Boolean {
        return false
    }
}