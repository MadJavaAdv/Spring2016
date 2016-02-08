package java112.labs1;

import java.io.*;

public class LabFour {

    public static void main(String[] args) {
        LabFour lab = new LabFour();
        if (args.length == 1) {
            lab.run(args[0]);
        } else {
            System.out.println("Please enter one argument on the command line");
        }    
 }

    public void run(String input) {
        try (BufferedReader reader = new BufferedReader(new FileReader(input))){
              while (reader.ready()) {
                System.out.println(reader.readLine());   
             }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("There was a problem opening the file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("There was a problem reading the file");
            ioException.printStackTrace();
        }  catch (Exception exception) {
            System.out.println("There was a really big problem");
            exception.printStackTrace();
        }
    }
}
