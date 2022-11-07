package com.ahmaddudayef.springvalidation.validation

import com.ahmaddudayef.springvalidation.helper.StringHelper
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext


class PalindromeValidator : ConstraintValidator<Palindrome, String> {

    @Autowired
    private lateinit var stringHelper: StringHelper

    override fun isValid(value: String, context: ConstraintValidatorContext): Boolean {
        return stringHelper.isPalindrome(value)
    }

}