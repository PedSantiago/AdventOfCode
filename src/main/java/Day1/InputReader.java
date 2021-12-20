package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.util.Objects.isNull;

public class InputReader {

    private int largerCounter;

    public InputReader() {
        this.largerCounter = 0;
    }

    public int largerThanLast() {

        try {
            File myObj = new File("src/main/java/Day1/inputs.txt");
            Scanner myReader = new Scanner(myObj);
            String firstVal = null;
            String secondVal = null;

            if(myReader.hasNextLine() && isNull(firstVal)) {
                firstVal = myReader.nextLine();
            }

            while (myReader.hasNextLine()) {

                secondVal = myReader.nextLine();

                if(parseInt(secondVal) > parseInt(firstVal)) {
                    this.largerCounter++;
                }

                firstVal = secondVal;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return this.largerCounter;
    }

    public int largerThanLastThreeGroup() {

        try {
            File myObj = new File("src/main/java/Day1/inputs.txt");
            Scanner myReader = new Scanner(myObj);
            String firstVal = null;
            String secondVal = null;
            String thirdVal = null;
            String fourthVal = null;

            if(myReader.hasNextLine() && isNull(firstVal) && isNull(secondVal) && isNull(thirdVal)) {
                firstVal = myReader.nextLine();
                secondVal = myReader.nextLine();
                thirdVal = myReader.nextLine();
            }

            while (myReader.hasNextLine()) {

                fourthVal = myReader.nextLine();

                int sumOfFirstThree = parseInt(firstVal) + parseInt(secondVal) + parseInt(thirdVal);
                int sumOfSecondThree = parseInt(fourthVal) + parseInt(secondVal) + parseInt(thirdVal);

                if(sumOfSecondThree > sumOfFirstThree) {
                    this.largerCounter++;
                }

                firstVal = secondVal;
                secondVal = thirdVal;
                thirdVal = fourthVal;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return this.largerCounter;
    }
}
