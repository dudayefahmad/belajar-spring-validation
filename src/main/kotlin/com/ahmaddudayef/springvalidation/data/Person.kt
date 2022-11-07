package com.ahmaddudayef.springvalidation.data

import javax.validation.constraints.NotBlank

data class Person(
    @field:NotBlank
    val id: String,
    @field:NotBlank
    val name: String
)