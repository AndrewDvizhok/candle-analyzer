package io.andrewdvizhok.brain

abstract class Connection {
    BigDecimal strength
    Neuron incomingNeuron
    Neuron outgoingNeuron
    Integer changed
}
