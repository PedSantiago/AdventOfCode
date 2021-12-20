package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DepthInputReader {

    private int horizontalPos;
    private int depth;
    private int aim;

    public DepthInputReader() {
        this.horizontalPos = 0;
        this.depth = 0;
        this.aim = 0;
    }

    public int calculateFinalValue() {
        try {
            File myObj = new File("src/main/java/Day2/inputs.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                String currLine = myReader.nextLine();
                String[] currLineArr = currLine.split(" ");

                if(currLineArr[0].equals("forward")){
                    this.horizontalPos = this.horizontalPos + parseInt(currLineArr[1]);
                }

                if(currLineArr[0].equals("down")){
                    this.depth = this.depth + parseInt(currLineArr[1]);
                }

                if(currLineArr[0].equals("up")){
                    this.depth = this.depth - parseInt(currLineArr[1]);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return this.horizontalPos * this.depth;
    }

    public int calculateFinalValueWithAim() {
        try {
            File myObj = new File("src/main/java/Day2/inputs.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                String currLine = myReader.nextLine();
                String[] currLineArr = currLine.split(" ");

                if(currLineArr[0].equals("forward")){
                    this.horizontalPos = this.horizontalPos + parseInt(currLineArr[1]);
                    this.depth = this.depth + (this.aim * parseInt(currLineArr[1]));
                }

                if(currLineArr[0].equals("down")){
                    this.aim = this.aim + parseInt(currLineArr[1]);
                }

                if(currLineArr[0].equals("up")){
                    this.aim = this.aim - parseInt(currLineArr[1]);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return this.horizontalPos * this.depth;
    }
}
