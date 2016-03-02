package java112.demo;

/** This class represents students
 *  @author pwaite
 */

 public class Student implements Comparable<Student>{
     private String firstName;
     private String lastName;
     private String grade;
     private int id;

     public Student() {
         //no argument constructor
         // put my "always want to do stuff" here
     }

     public Student(String firstName, String lastName, String grade, int id) {
         this();
         this.firstName = firstName;
         this.lastName = lastName;
         this.grade = grade;
         this.id = id;
     }

    /**
	 * Returns the value of firstName.
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * Sets the value of firstName.
	 * @param firstName The value to assign firstName.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * Returns the value of lastName.
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * Sets the value of lastName.
	 * @param lastName The value to assign lastName.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * Returns the value of grade.
	 */
	public String getGrade() {
		return grade;
	}


	/**
	 * Sets the value of grade.
	 * @param grade The value to assign grade.
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}


	/**
	 * Returns the value of id.
	 */
	public int getId() {
		return id;
	}


	/**
	 * Sets the value of id.
	 * @param id The value to assign id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Create a String representation of the student
	 * @return String representing the student
	 */

	 public String toString() {
	     return "Student: " + firstName + " " +
	             lastName + " with id of " +
	             id + " has earned a grade of " +
	             grade + System.lineSeparator();
	 }

	 /**
	  *  Compare students - based on id
	  *  @param thatStudent to compare
	  */
	  public int compareTo(Student thatStudent) {
	      final int BEFORE = -1;
	      final int EQUAL = 0;
	      final int AFTER = 1;

	      if (this == thatStudent) {
	          return EQUAL;
	      }
	      else if (this.id < thatStudent.id) {
	          return BEFORE;
	      }
	      else if (this.id > thatStudent.id) {
	          return AFTER;
	      }
	      else {
	          return EQUAL;
	      }
	  }
 }
