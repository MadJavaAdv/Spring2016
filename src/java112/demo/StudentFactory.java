package java112.demo;

import java.util.*;
/** This class will create students
 *  @author pwaite
**/

public class StudentFactory {

    List<Student> studentList;
   /** Create a StudentFactory **/
   public StudentFactory() {
       createStudents();
   }

    /** create a list of students */
    public void createStudents() {
        studentList = new ArrayList<Student>();
        studentList.add(new Student("Jim", "S", "A", 111222));
        studentList.add(new Student("A", "Slacker", "F", 11222));
        studentList.add(new Student("Austin", "D", "A", 222333));
        studentList.add(new Student("M", "Slacker", "D", 11222));
    }

    /** Put the students in a Set and return the set
     *  @return set of students
     */
    public Set createStudentSet() {
        Set<Student> students = new TreeSet<Student>();
        students.addAll(studentList);
        return students;
    }

    /** Put the students in a List and return the list
     *  @return list of students
     */
    public List createStudentList() {
       return studentList;
    }

}

