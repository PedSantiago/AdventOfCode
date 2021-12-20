package Day1;

public class main {
    public static void main(String[] args) {

        runTest1();
        runTest2();

    }

    private static void runTest1() {
        InputReader inputReader = new InputReader();
        int theNumber = inputReader.largerThanLast();
        System.out.println(theNumber);
    }

    private static void runTest2() {
        InputReader inputReader = new InputReader();
        int theNumber = inputReader.largerThanLastThreeGroup();
        System.out.println(theNumber);
    }
}
