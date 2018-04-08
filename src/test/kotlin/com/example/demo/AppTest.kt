@file:Suppress("RemoveRedundantBackticks")

package com.example.demo

import com.example.demo.models.JavaBodyDTO
import com.example.demo.models.KotlinBodyDTO
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
open class AppTest {
    @Autowired
    lateinit var http: TestRestTemplate

    @Test
    fun `should return 400 when sending a request to java annotated body`() {
        http.postForEntity("/updateRolesJava", JavaBodyDTO(), String::class.java)
            .also {
                assertEquals(HttpStatus.BAD_REQUEST, it.statusCode)
            }
    }

    @Test
    fun `should return 400 when sending a request to kotlin annotated body`() {
        http.postForEntity("/updateRolesKotlin", KotlinBodyDTO(), String::class.java)
            .also {
                assertEquals(HttpStatus.BAD_REQUEST, it.statusCode)
            }
    }
}