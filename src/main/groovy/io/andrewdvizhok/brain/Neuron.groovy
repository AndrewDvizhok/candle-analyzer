package io.andrewdvizhok.brain

abstract class Neuron {
    Integer id, layer, group
    private BigDecimal value
    BigDecimal bias
    Integer changed = 0
    List<Connection> incomingConn
    List<Connection> outgoingConn
    abstract BigDecimal getValue()
    abstract void setValue(BigDecimal value)
    abstract void clearValue()
}
