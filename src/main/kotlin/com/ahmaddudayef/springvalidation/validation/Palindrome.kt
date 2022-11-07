package com.ahmaddudayef.springvalidation.validation

import java.lang.annotation.Documented
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass


@Documented
@Constraint(validatedBy = [PalindromeValidator::class])
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Palindrome(

    val message: String = "{Palindrome.message}",

    val groups: Array<KClass<*>> = [],

    val payload: Array<KClass<out Payload>> = []
)