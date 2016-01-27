/*
    Class: UsePrintWriter

    Author: Eric Knapp

    Create date: 1/20/2009

    Description: This class demonstrates many features of project 1.
*/

package java112.labs1;

import java.io.*;

/**
 *  This class demonstrates the use of the PrintWriter class for writing to
 *  files. It takes two arguments from the command line. The first argument is
 *  the name of the output file. The second argument is a first name.
 *
 *@author    eknapp
 */
public class UsePrintWriter extends java.lang.Object {

    private  PrintWriter  out;
    private  String       fileName;
    private  String       firstName;


    /**
     *  Sets the fileName attribute of the UsePrintWriter object.
     *
     *@param  fileName  The new fileName value
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     *  Gets the fileName attribute of the UsePrintWriter object.
     *
     *@return    The fileName value
     */
    public String getFileName() {
        return fileName;
    }


    /**
     *  Sets the firstName attribute of the UsePrintWriter object.
     *
     *@param  firstName  The new firstName value
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     *  Gets the firstName attribute of the UsePrintWriter object.
     *
     *@return    The firstName value
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     *  Main processing method for the UsePrintWriter object.
     *
     *@exception  java.io.IOException  Description of the Exception
     */
    public void run(String[] args) throws java.io.IOException {

        if (args.length == 0) {
            System.out.println("Please add a file name and a first name.");
            return;
        }
        
        setFileName(args[0]);
        setFirstName(args[1]);
        
        /*
         *  This line creates the new Printer.
         */
        out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));

        out.print("Hello ");
        out.println(firstName);
        out.println("How's it going?");

        
        
        out.close();
    }


    /**
     *  The main program for the UsePrintWriter class.
     *
     *@param  args                     The command line arguments
     *@exception  java.io.IOException  If there is an I/O problem
     */
    public static void main(String[] args) throws java.io.IOException {

        UsePrintWriter  usePrint  = new UsePrintWriter();

        usePrint.run(args);

    }

}

