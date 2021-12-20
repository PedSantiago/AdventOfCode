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
            File myObj = new File("src/Day1/inputs.txt");
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

}
