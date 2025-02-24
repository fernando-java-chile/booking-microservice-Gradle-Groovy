package com.ImplementandoDiscoveryService.booking_microservice.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/category')
@RefreshScope
class CategoryController {

    @Value('${app.testProp:No encontrado}')
    String testProp

    //192.168.100.14:8087/category/test
    //192.168.100.14:8087/actuator/refresh
    @GetMapping('/test')
    String test() {
        testProp
    }

    @Value('${app.TestMessageBroker}')
    String TestMessageBroker

    @GetMapping("/testbroker")
    String testBroker() {
        return "Test Message Broker: ${TestMessageBroker}"
    }

}
