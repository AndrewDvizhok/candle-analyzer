package io.andrewdvizhok.brain

class SimpleConnection extends Connection {

    @Override
    void setStrength(BigDecimal newStrength) {
        strength = newStrength
        changed++
    }

}
