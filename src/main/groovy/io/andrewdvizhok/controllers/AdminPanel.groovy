package io.andrewdvizhok.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/panel')
class AdminPanel {
    @Get(produces = MediaType.TEXT_PLAIN)
    String index() {
        'Hello World'
    }
}