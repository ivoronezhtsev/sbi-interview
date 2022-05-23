package ru.voronezhtsev.sbi

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class Request(val id: Int, val name: String)
data class Response(val status: String)

@RestController
class Controller {

    @PostMapping("/test")
    fun test(@RequestBody request: Request): ResponseEntity<Response> {
        if (request.id > 0 && listOf("Vasya", "Petya").contains(request.name)) {
            return ResponseEntity(Response("Ok"), HttpStatus.OK);
        }
        return ResponseEntity(Response("Fail"), HttpStatus.BAD_REQUEST)
    }

}

