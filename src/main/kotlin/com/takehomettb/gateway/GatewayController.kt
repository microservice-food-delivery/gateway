package com.takehomettb.gateway

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GatewayController {


    @GetMapping("/")
    fun getValue(): ResponseEntity<Any> {
        return ResponseEntity.ok().body("Gateway")
    }
}