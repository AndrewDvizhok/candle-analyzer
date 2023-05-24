package io.andrewdvizhok.brain

class SimpleBrain extends Brain {

    @Override
    String toString() {
        return "$id: layers:${layers}"
    }
}
