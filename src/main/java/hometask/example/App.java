package hometask.example;

import hometask.example.calculations.MathOperations;

public class App {

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(12, 3)); //returns 12 + 3 = 15
        System.out.println(mathOperations.pow(5, 4)); //returns 5 power of 4 i.e. 5 * 5 * 5 * 5 = 625
    }
}
