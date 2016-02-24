package java112.labs1;

import java.io.*;

public class LabFive {

    public static void main(String[] args) {
        LabFive lab = new LabFive();
        if (args.length == 2) {
            lab.run(args[0], args[1]);
        } else {
            System.out.println("Please enter two arguments on the command line, a file name and a message");
        }    
    }

    public void run(String fileName, String message) {
        // TODO: When would I NOT want to use try-with-resources?
        // TODO: How could I append to a file, rather than rewriting it each time?
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)))){
              writer.println(message);  
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("There was a problem opening the file:");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("There was a problem writing the file:");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem other than an IOException:");
            exception.printStackTrace();
        }
    }
}
