package java112.demo;

import java.util.*;

/** A class to demonstrate maps containing objects
 *  @author pwaite
 */

 public class StudentMapDemo {

 /** Main method to demonstrate use of the Treemap class to
  *  hold a sorted set of mapped data.
  *  @param args Parameters that are entered on the command line.
  */

  public static void main(String args[]) {

      // create a map
      Map<Integer, Student> students = new TreeMap<Integer, Student>();

      students.put(1, new Student("Jim", "G", "A", 1));
      students.put(2, new Student("Joe", "P", "A", 2));
      students.put(3, new Student("Joe", "P", "A", 3));

      System.out.println(students);

      int studentId = 1;
      // update an object in the map
      if (students.containsKey(studentId)) {
           Student student = students.get(studentId);
           student.setFirstName("Suzie");
      }
      // notice that student 1's name is updated...
      System.out.println(students);

  }





 }
