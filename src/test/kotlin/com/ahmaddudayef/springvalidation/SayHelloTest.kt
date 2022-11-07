package com.ahmaddudayef.springvalidation

import com.ahmaddudayef.springvalidation.helper.SayHello
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import javax.validation.ConstraintViolationException


@SpringBootTest
class SayHelloTest {

    @Autowired
    private lateinit var sayHello: SayHello

    @Test
    fun testSuccess() {
        val message = sayHello.sayHello("Ahmad Dudayef")
        Assertions.assertEquals("Hello Ahmad Dudayef", message)
    }

    @Test
    fun testError() {
        Assertions.assertThrows(ConstraintViolationException::class.java) {
            sayHello.sayHello("")
        }
    }
}