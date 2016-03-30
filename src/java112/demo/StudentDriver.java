package java112.demo;

import java.util.*;
/** This class serves as the entry point to the collections
 *  interface demo.
 *  @author pwaite
 */

 public class StudentDriver {
     public static void main(String[] args) {
         StudentFactory factory = new StudentFactory();
         System.out.println("The student list follows:");
         System.out.println(factory.createStudentList());


         System.out.println("The student TreeSet follows:");
         System.out.println(factory.createStudentSet());
         System.out.println();
     }

 }
