package io.andrewdvizhok.brain

class SimpleBrainFabric extends BrainFabric {

    private Brain brain

    /**
     * This parameter identifies brain structure
     * [ layer_A: [group_a:count,group_b:count],
     *   layer_B: [group_c:count,group_d:count] ]
     */
    private Map<Integer, Map<Integer, Integer>> parameters
    /**
     * This parameter identifies how neurons are connected
     * [ [layer_A, group_a, group_c], [layer_A, group_b, group_d] ]
     * first number for the current layer
     * second number for the current group
     * last number for group from next layer to connect
     */
    private List<Integer[]> network

    SimpleBrainFabric(Map<Integer, Integer[]> parameters, List<Integer[]> network) {
        this.parameters = parameters
        this.network = network
    }

    @Override
    Brain getBrain() {
        fillNeurons()
        return brain
    }

    void fillNeurons(){
        brain = new SimpleBrain()
        brain.layers = new HashMap<>(parameters.size())
        parameters.each { layerNum, layer ->
            brain.layers[layerNum] = new HashMap<Integer, List<Neuron>>(layer.size())
            layer.each { groupNum, countNeurons ->
                brain.layers[layerNum][groupNum] = new ArrayList<Neuron>(countNeurons)
                1..countNeurons.each {
                    brain.layers[layerNum][groupNum].add(new SimpleNeuron(layer: layerNum, group: groupNum))
                }
            }
        }
    }

    @Override
    void trainBrain(Brain brain, Map<Integer, BigDecimal> inputs, Map<Integer, BigDecimal> outputs) {

    }

    @Override
    Neuron getNeuron() {
        return new SimpleNeuron()
    }

    @Override
    Connection getConnection() {
        return new SimpleConnection()
    }
}
