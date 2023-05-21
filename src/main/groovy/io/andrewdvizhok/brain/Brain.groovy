package io.andrewdvizhok.brain

abstract class Brain {
    Integer id
    Map<Integer, Map<Integer, List<Neuron>>> layers
    Integer changed
}
