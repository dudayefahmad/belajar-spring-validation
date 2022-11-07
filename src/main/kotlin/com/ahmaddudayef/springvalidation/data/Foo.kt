package com.ahmaddudayef.springvalidation.data

import com.ahmaddudayef.springvalidation.validation.Palindrome

data class Foo(@Palindrome val bar: String)