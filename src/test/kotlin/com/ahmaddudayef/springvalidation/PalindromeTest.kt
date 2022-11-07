package com.ahmaddudayef.springvalidation

import com.ahmaddudayef.springvalidation.data.Foo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import javax.validation.Validator


@SpringBootTest
class PalindromeTest {

    @Autowired
    private lateinit var validator: Validator

    @Test
    fun palindromeValid() {
        val constraintViolations = validator.validate(Foo("kodok"))
        Assertions.assertTrue(constraintViolations.isEmpty())
    }

    @Test
    fun palindromeInvalid() {
        val constraintViolations = validator.validate(Foo("ahmad"))
        Assertions.assertFalse(constraintViolations.isEmpty())
        Assertions.assertEquals(1, constraintViolations.size)
    }

    @Test
    fun palindromeInvalidMessage() {
        val constraintViolations = validator.validate(Foo("ahmad"))
        Assertions.assertFalse(constraintViolations.isEmpty())
        Assertions.assertEquals(1, constraintViolations.size)
        val message = constraintViolations.stream().findFirst().get().message
        Assertions.assertEquals("Data bukan palindrome", message)
    }


}