package com.ahmaddudayef.springvalidation

import com.ahmaddudayef.springvalidation.data.Person
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;


@SpringBootTest
class ValidatorTest {

    @Autowired
    private lateinit var validator: Validator

    @Test
    fun personNotValid() {
        val person = Person("", "")
        val constraintViolations = validator.validate(person)
        Assertions.assertFalse(constraintViolations.isEmpty())
        Assertions.assertEquals(2, constraintViolations.size)
    }

    @Test
    fun personValid() {
        val person = Person("1", "Ahmad")
        val constraintViolations = validator.validate(person)
        Assertions.assertTrue(constraintViolations.isEmpty())
    }

}