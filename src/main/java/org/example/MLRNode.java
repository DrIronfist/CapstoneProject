package org.example;

public class MLRNode extends Node {
    public MLRNode(int ic){
        super(ic);
    }

    @Override
    public double run(double[] input) {
        return NetworkMath.dotVectors(input, weights)+bias;
    }
}
