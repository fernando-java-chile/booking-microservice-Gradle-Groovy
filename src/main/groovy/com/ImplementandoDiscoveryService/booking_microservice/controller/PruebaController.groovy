package com.ImplementandoDiscoveryService.booking_microservice.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prueba")
class PruebaController {

    @RequestMapping("/hola")
    String hola() {
        return "Hola Mundo"
    }


}
