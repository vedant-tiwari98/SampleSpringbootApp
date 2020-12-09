package com.example.SampleSpringbootApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringbootAppApplication

fun main(args: Array<String>) {
	runApplication<SampleSpringbootAppApplication>(*args)
}
