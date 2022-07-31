package org.example;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        NeuralNetwork n1 = new NeuralNetwork(new NetworkData(10,10,10,10, NetworkType.FEEDFORWARD));
        Instant current = Instant.now();
        System.out.println(Arrays.toString(n1.run(new double[]{1,1,1,1,1,1,1,1,1,1})));

        System.out.println(Duration.between(current, Instant.now()).toMillis());

    }
}