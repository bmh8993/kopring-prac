package com.example.kopringprac.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest
@AutoConfigureMockMvc // MockMvc 자동으로 설정
class HelloControllerTest {

    @Autowired // spring에서 mockMvc(bean) 주입
    lateinit var mockMvc: MockMvc // 가상의 client를 주입받아서 생성

    @Test
    fun hello가_리턴된다() {
        val result = "hello"

        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(result))
            .andDo(MockMvcResultHandlers.print()) // 테스트와 관련된 정보들을 상세하게 보여준다.
    }
}