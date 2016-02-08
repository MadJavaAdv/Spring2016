package java112.demo;

import java.io.*;

/** A sample class to demonstrate reading a file and related exception handling
 *  @author Paula Waite
 */

public class ReadDemo {

    /** main method for starting the program
    *  @param args the command line arguments
    **/
    public static void main(String[] args) {

        ReadDemo demo = new ReadDemo();
        demo.run();
    }

    public void run()  {
        //TODO  research try with resources 
        
        BufferedReader in = null;

        try {
            FileReader reader = new FileReader("input.txt"); 
            in = new BufferedReader(reader); 

            while (in.ready()) {
                System.out.println(in.readLine());
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
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioEx2) {
                System.out.println("There was a problem closing the file");
                ioEx2.printStackTrace();
            }
        }
    }

}
