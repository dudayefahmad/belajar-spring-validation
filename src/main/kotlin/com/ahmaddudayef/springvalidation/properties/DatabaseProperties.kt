package com.ahmaddudayef.springvalidation.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank

@Validated
@ConstructorBinding
@ConfigurationProperties("database")
data class DatabaseProperties(
    @field:NotBlank val username: String,
    @field:NotBlank val password: String
)