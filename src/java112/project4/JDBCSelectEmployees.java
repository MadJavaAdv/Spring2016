
package java112.project4;

import java.io.*;
import java.sql.*;

/**
 *
 *@author     Paula Waite
 *
 */
public class JDBCSelectEmployees {

    public void runSample() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // build sql statement
        
        try {
            // Step 1: Load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2 & 3: Create connection URL and connect to the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/student", "student", "student");

            // Step 4 Create a statement
            statement = connection.createStatement();

            String name = "Smith";
            String queryString = "SELECT emp_id, first_name, last_name"
                    + " FROM employees " + "WHERE last_name like '"
                    + name + "%'";

            // Best practice is to write out the sql you are building
            System.out.println("queryString: " + queryString);

            // Step 5 Execute the query
            resultSet = statement.executeQuery(queryString);

            System.out.println();

            // Step 6 Process the result
            while (resultSet.next()) {
                String employeeId = resultSet.getString("emp_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println(" Row: " + employeeId + " "
                            + firstName + " " + lastName);
            }

            System.out.println();

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columns = resultSetMetaData.getColumnCount();
            String nameOne = resultSetMetaData.getColumnName(1);
            String typeOne = resultSetMetaData.getColumnTypeName(1);
            String labelOne = resultSetMetaData.getColumnLabel(1);
            System.out.println(" Column count : " + columns);
            System.out.println(" Column 1 name : " + nameOne);
            System.out.println(" Column 1 type : " + typeOne);
            System.out.println(" Column 1 label name : " + labelOne);

            System.out.println();

        } catch (ClassNotFoundException classNotFound) {
            System.err.println("Cannot find database driver ");
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            System.err.println("Error in connection.ecting to database "
                    + sqlException);
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            // Step 7 close everything in the reverse order that it was opened
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.err.println("Error in connecting to database "
                        + sqlException);
                sqlException.printStackTrace();
            } catch (Exception exception) {
                System.err.println("General Error");
                exception.printStackTrace();
            }
        }

    }

    /**
     *  The main program for the JDBCSelectWhereExample class
     *
     *@param  args  The command line arguments
     *
     *@since
     *
     */
    public static void main(String[] args) {

        JDBCSelectEmployees employees = new JDBCSelectEmployees();

        employees.runSample();

    }

}

