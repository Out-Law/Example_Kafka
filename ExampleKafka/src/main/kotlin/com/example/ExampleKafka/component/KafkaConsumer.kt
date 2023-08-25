package com.example.ExampleKafka.component

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {

    @KafkaListener(topics = ["my-topic", "qwerty"], groupId = "my-group")
    fun receiveMessage(message: String) {
        println("Received message: $message")
    }
}