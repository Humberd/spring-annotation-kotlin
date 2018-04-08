package com.example.demo

import com.example.demo.models.JavaBodyDTO
import com.example.demo.models.KotlinBodyDTO
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@SpringBootApplication
@RestController
open class App {

    @PostMapping("/updateRolesJava")
    fun updateRolesJava(@RequestBody @Valid body: JavaBodyDTO): ResponseEntity<Void> {
        // this should never reach because validator invalidates body
        return ResponseEntity(HttpStatus.OK)
    }

    @PostMapping("/updateRolesKotlin")
    fun updateRolesKotlin(@RequestBody @Valid body: KotlinBodyDTO): ResponseEntity<Void> {
        // this should never reach because validator invalidates body
        return ResponseEntity(HttpStatus.OK)
    }
}

fun main(args: Array<String>) {
    runApplication<App>(*args)
}