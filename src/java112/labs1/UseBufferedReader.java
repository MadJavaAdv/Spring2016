/*
 *  Class: UseBufferedReader
 *  Author: Eric Knapp
 *  Create date: 1/20/2009
 *  Description: This class demonstrates many features of project 1.
 */
package java112.labs1;

import java.io.*;
import java.util.*;

/**
 *  This class demonstrates the BufferedReader class. <br>
 *
 *
 *@author     eknapp
 *@created    August 21, 2010
 */
public class UseBufferedReader {

    /**
     *  This is the BufferedReader object that will allow us to read in the
     *  file.
     */
    private BufferedReader input;

    /**
     *  This ArrayList will keep track of all the tokens in the order that they
     *  are read from the file. Duplicates are allowed.
     */
    private List tokens = new ArrayList();

    /**
     *  This HashSet will hold all the unique tokens in the input file. There is
     *  no need to do anything special to reject duplicates, this is done
     *  automatically.
     */
    private Set uniqueTokens = new TreeSet();


    /**
     *  The intial stating method
     */
    public void run() {

        readFileAndLoadCollections();
        printTokenList();
        printUniqueTokenList();

    }


    /**
     *  This method reads a file and loads all of its tokens into 2 collections
     */
    private void readFileAndLoadCollections() {

        try {
            //create a BufferedReader using a hard-coded file
            input = new BufferedReader(new FileReader("sample.txt"));

            String inputLine = "";
            String[] tokenArray = null;
            String token = "";

            //loop through the input file one line at a time
            while (input.ready()) {
                inputLine = input.readLine();
                tokenArray = inputLine.split("\\W");
                for (int i = 0; i < tokenArray.length; i++) {
                    tokens.add(tokenArray[i]);
                    uniqueTokens.add(tokenArray[i]);
                }

            }

        } catch (java.io.FileNotFoundException fnfe) {
            System.out.println("Failed to read input file");
            fnfe.printStackTrace();
        } catch (Exception exception) {
            System.out.println("General Error");
            exception.printStackTrace();
        } finally {
            //Don't forget to close!
            try {
                if (input != null) {
                    input.close();
                }
            } catch (java.io.IOException ioe) {
                System.out.println("Failed to close input file");
                ioe.printStackTrace();
            }
        }
    }


    /**
     *  This method prints the tokens
     */
    private void printTokenList() {

        System.out.println("\n####################\ntoken list size: "
                 + tokens.size());
        
        for (Iterator it = tokens.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }


    /**
     *  This method prints the uniqueTokens
     */
    private void printUniqueTokenList() {

        System.out.println("\n####################\nunique token list size: "
                 + uniqueTokens.size());
        
        for (Iterator it = uniqueTokens.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }


    /**
     *  The main program for the UseBufferedReader class
     *
     *@param  args             The command line arguments
     *@exception  IOException  Description of Exception
     */
    public static void main(String[] args) throws IOException {
        UseBufferedReader reader = new UseBufferedReader();
        reader.run();
    }

}

