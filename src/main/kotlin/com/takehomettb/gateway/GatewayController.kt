package com.takehomettb.gateway

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GatewayController {

    lateinit var appValue: String

    @GetMapping("/")
    fun getValue(): ResponseEntity<Any> {
        println(appValue)
        return ResponseEntity.ok().body(appValue)
    }
}