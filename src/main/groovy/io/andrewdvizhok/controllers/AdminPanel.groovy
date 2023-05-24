package io.andrewdvizhok.controllers

import io.andrewdvizhok.brain.SimpleBrainFabric
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/panel')
class AdminPanel {
    @Get(produces = MediaType.TEXT_PLAIN)
    String index() {

        def brainFabric = new SimpleBrainFabric([0:[0:5,1:5],1:[0:5],2:[0:2]], [])
        def brain = brainFabric.getBrain()
        return brain?.toString()
    }
}