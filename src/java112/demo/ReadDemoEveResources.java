package java112.demo;

import java.io.*;

public class ReadDemoEveResources {

    public static void main(String[] args) {
        ReadDemoEveResources demo = new ReadDemoEveResources();    
        demo.read();
    
    }
    
    public void read() {
        String line = null;
       
        //FileReader reader = new FileReader("foo.in");
        //BufferedReader in = new BufferedReader(reader);
        // line 16 is equivalent to lines 13 and 14 
        try (BufferedReader in = new BufferedReader(new FileReader("foo.in"))) {
            while (in.ready()) {
                line = in.readLine();
                System.out.println(line);
            }      
        } catch (FileNotFoundException fileNotFoundEx) {
            System.out.println("Could not find the file");
            fileNotFoundEx.printStackTrace();
        } catch (IOException ioEx) {
            System.out.println("Could not read the file");
            ioEx.printStackTrace();    
        } catch (Exception exception) {
            System.out.println("Something bad happened");
            exception.printStackTrace();
        }
    }

}
