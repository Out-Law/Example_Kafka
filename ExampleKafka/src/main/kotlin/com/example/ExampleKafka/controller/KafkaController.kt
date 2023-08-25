package com.example.ExampleKafka.controller

import com.example.ExampleKafka.component.KafkaProducer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafka")
class KafkaController(private val kafkaProducer: KafkaProducer) {

    @GetMapping("/send/{message}")
    fun sendMessage(@PathVariable message: String) {
        kafkaProducer.sendMessage("my-topic", message)
    }

    @GetMapping("/send/global/{message}")
    fun sendGlobalMessage(@PathVariable message: String) {
        kafkaProducer.sendMessage("qwerty", message)
    }
}
