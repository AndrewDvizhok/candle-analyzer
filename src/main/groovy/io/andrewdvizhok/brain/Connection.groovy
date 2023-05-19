package io.andrewdvizhok.brain

abstract class Connection {
    BigDecimal strength
    Neuron incoming
    Neuron outgoing
    Integer changed
}
