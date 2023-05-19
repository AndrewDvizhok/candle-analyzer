package io.andrewdvizhok.brain

abstract class BrainFabric {
    abstract Brain getBrain()
    abstract void trainBrain(Brain brain, Map<Integer, BigDecimal> inputs, Map<Integer, BigDecimal> outputs)
}
