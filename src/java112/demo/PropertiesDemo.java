package java112.demo;

import java.util.*;
import java.io.*;

/** Demonstrate the use of the Properties class
 *  @author pawaite
 */
public class PropertiesDemo {

    /** Starts the properties demo
     *
     * @param args Command Line arguments
     */
    public static void main(String[] args) {
        PropertiesDemo demo = new PropertiesDemo();
        demo.run();
    }

    public void run() {

        // instantiate Properties
        Properties properties = new Properties();

        // Read in the properties file
        try {
            properties.load(this.getClass().getResourceAsStream("/demo.properties"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // find the key/property called "author" and write out the value for that key
        System.out.println(properties.getProperty("author"));

        // Get a list of the keys, aka, property names
       Set<String> propertyNames = properties.stringPropertyNames();

        //Write out all the property names/keys
        System.out.println("The set of property names" + propertyNames);

        //Iterate over the set of names, writing out the property name and the value
        for (String key: propertyNames) {
            String value = properties.getProperty(key);
            System.out.println(key + " => " + value);
        }

    }



}
