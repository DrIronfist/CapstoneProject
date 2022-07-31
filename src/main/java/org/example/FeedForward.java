package org.example;

public class FeedForward extends Node{
    public FeedForward(int ic) {
        super(ic);
    }
    @Override
    public double run(double[] input){
        double activationInput = NetworkMath.dotVectors(input, weights) + bias;
        return NetworkMath.sigmoid(activationInput);
    }
}
