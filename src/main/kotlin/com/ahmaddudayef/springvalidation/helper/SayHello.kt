package com.ahmaddudayef.springvalidation.helper

import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank

@Validated
@Component
class SayHello : ISayHello {

    override fun sayHello(@NotBlank name: String): String {
        return "Hello $name"
    }
}