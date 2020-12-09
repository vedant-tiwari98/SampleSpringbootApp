package com.example.SampleSpringbootApp.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloController {
    @RequestMapping(value = ["/helloworld"], method = [(RequestMethod.GET)])
    fun getHelloWorldMessage(): ResponseEntity<String> = ResponseEntity.ok("Hello World")

    @RequestMapping(value = ["/helloworld/{name}"], method = [(RequestMethod.GET)])
    fun getHelloWorldMessageWithName (
            @PathVariable("name") name : String ) : ResponseEntity<Any> =
            if(name!="Vedant") {
                ResponseEntity.ok( HelloResponse(
                        message = "Hello $name", name = name
                ) )
            } else {
                ResponseEntity.badRequest().body("I am Vedant!")
            }
}

data class HelloResponse (
        val message: String,
        val name: String
)