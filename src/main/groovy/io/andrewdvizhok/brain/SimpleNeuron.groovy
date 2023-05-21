package io.andrewdvizhok.brain

class SimpleNeuron extends Neuron {

    @Override
    BigDecimal getValue() {
        if(value == null){
            value = incomingConn.sum { it.incomingNeuron.getValue() * it.strength } + bias
        }
        return value
    }

    @Override
    void setValue(BigDecimal newValue) {
        value = newValue
        changed++
        //clear all outgoing neurons
        outgoingConn.each {it.outgoingNeuron.clearValue() }
    }

    @Override
    void clearValue() {
        if(value != null){
            value = null
            //clear all outgoing neurons
            outgoingConn.each {it.outgoingNeuron.clearValue() }
        }
    }

}
