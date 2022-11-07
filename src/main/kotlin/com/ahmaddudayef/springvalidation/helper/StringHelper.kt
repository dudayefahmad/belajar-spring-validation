package com.ahmaddudayef.springvalidation.helper

import org.springframework.stereotype.Component

@Component
class StringHelper {

    fun isPalindrome(value: String): Boolean {
        val reverse = StringBuilder(value).reverse().toString()
        return value == reverse
    }

}