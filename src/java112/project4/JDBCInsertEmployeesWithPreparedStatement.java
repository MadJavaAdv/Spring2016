
package java112.project4;

import java.io.*;
import java.sql.*;

/**
 * An example of insert using PreparedStatements
 *@author     Paula Waite
 *
 */
public class JDBCInsertEmployeesWithPreparedStatement {

    public void runSample(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int numberOfRecordsInserted = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/student", "student", "student");



            String insertString = "INSERT into employees "
            + "(first_name, last_name, ssn, dept, room, phone) "
            + " values (?, ?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(insertString);


            System.out.println("insertstring is: " + insertString);

            preparedStatement.setString(1, args[0]);
            preparedStatement.setString(2, args[1]);
            preparedStatement.setString(3, args[2]);
            preparedStatement.setString(4, args[3]);
            preparedStatement.setString(5, args[4]);
            preparedStatement.setString(6, args[5]);


            System.out.println("insertstring after setting is: " + insertString);
            numberOfRecordsInserted =  preparedStatement.executeUpdate();

            System.out.println("***** Inserted " + numberOfRecordsInserted + " record/s.");

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
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.err.println("Error in connection.ecting to database "
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

        JDBCInsertEmployeesWithPreparedStatement employees =
                new JDBCInsertEmployeesWithPreparedStatement();

        employees.runSample(args);

    }

}

