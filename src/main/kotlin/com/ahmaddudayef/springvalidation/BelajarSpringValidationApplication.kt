package com.ahmaddudayef.springvalidation

import com.ahmaddudayef.springvalidation.properties.DatabaseProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(
	DatabaseProperties::class
)
class BelajarSpringValidationApplication

fun main(args: Array<String>) {
	runApplication<BelajarSpringValidationApplication>(*args)
}
