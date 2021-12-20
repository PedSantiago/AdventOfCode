package Day2;

import main.java.Day2.DepthInputReader;

public class main {
    public static void main(String[] args) {

        runTest1();
        runTest2();

    }

    private static void runTest1() {
        DepthInputReader depthInputReader = new DepthInputReader();
        int theNumber = depthInputReader.calculateFinalValue();
        System.out.println(theNumber);
    }

    private static void runTest2() {
        DepthInputReader depthInputReader = new DepthInputReader();
        int theNumber = depthInputReader.calculateFinalValueWithAim();
        System.out.println(theNumber);
    }
}
