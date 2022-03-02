package com.example.kopringprac.web.dto

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class HelloResponseDtoTest {

    @Test
    fun 롬복_기능_테스트() {
        val name = "test"
        val amount: Int = 1000

        val dto: HelloResponseDto = HelloResponseDto(name, amount)

        Assertions.assertThat(dto.name).isEqualTo(name)
        Assertions.assertThat(dto.amount).isEqualTo(amount)
    }
}