package io.andrewdvizhok.brain

abstract class Neuron {
    private BigDecimal value
    BigDecimal bias
    Integer changed
    List<Connection> incoming
    List<Connection> outgoing
    abstract BigDecimal getValue()
}
