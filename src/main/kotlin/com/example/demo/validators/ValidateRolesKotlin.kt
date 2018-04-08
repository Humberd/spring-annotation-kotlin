package com.example.demo.validators

import javax.validation.Constraint
import kotlin.reflect.KClass

@Constraint(validatedBy = arrayOf(RolesValidatorKotlin::class))
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
annotation class ValidateRolesKotlin(
    val message: String = "{com.example.demo.validators.ValidateRolesKotlin.message}",
    val groups: Array<KClass<*>> = arrayOf(),
    val payload: Array<KClass<*>> = arrayOf()
)
