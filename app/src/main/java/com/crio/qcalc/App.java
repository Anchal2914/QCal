/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {  
    StandardCalculator calc = new StandardCalculator();
    calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
    calc.printResult();
    }
}
