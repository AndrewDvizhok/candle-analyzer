package io.andrewdvizhok.brain

abstract class Connection {
    Integer id
    private BigDecimal strength
    Neuron incomingNeuron
    Neuron outgoingNeuron
    Integer changed = 0
    abstract void setStrength(BigDecimal newStrength)
    BigDecimal getStrength(){
        return strength
    }
}
