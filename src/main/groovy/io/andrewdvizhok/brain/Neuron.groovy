package io.andrewdvizhok.brain

abstract class Neuron {
    private BigDecimal value
    BigDecimal bias
    Integer changed
    List<Connection> incomingConn
    List<Connection> outgoingConn
    abstract BigDecimal getValue()
    abstract void setValue(BigDecimal value)
    abstract void clearValue()
}
