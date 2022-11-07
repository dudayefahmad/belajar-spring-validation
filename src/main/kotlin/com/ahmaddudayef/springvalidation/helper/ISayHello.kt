package com.ahmaddudayef.springvalidation.helper

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank

@Validated
interface ISayHello {
    fun sayHello(@NotBlank name: String): String
}