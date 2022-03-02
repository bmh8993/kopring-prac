package com.example.kopringprac.web

import com.example.kopringprac.web.dto.HelloResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    fun hello(): String {
        return "hello"
    }

    @GetMapping("/dto")
    fun helloDto(
        @RequestParam name: String,
        @RequestParam amount: Int
    ): HelloResponseDto {
        return HelloResponseDto(name, amount)
    }
}