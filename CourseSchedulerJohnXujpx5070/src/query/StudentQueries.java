package query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.StudentEntry;
import DB.DBConnection;

public class StudentQueries {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	public void addStudent(StudentEntry student) {

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("insert into student (studentid,firstname,lastname) values (?,?,?)");
			preparedStatement.setString(1, student.getStudentID());
			preparedStatement.setString(2, student.getFirstName());
			preparedStatement.setString(3, student.getLastName());
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}

	public ArrayList<StudentEntry> getAllStudents() {
		ArrayList<StudentEntry> list = new ArrayList<StudentEntry>();

		try {
			connection = DBConnection.getConnection();
			String sql = "select * from student";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String id = resultSet.getString("studentid");
				String firstName = resultSet.getString("firstname");
				String lastName = resultSet.getString("lastname");

				StudentEntry student = new StudentEntry(id, firstName, lastName);

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}

		return list;

	}

	public StudentEntry getStudent(String studentID) {
		StudentEntry student = null;

		try {
			connection = DBConnection.getConnection();
			String sql = "select * from student where studentid = ? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, studentID);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String id = resultSet.getString("studentid");
				String firstName = resultSet.getString("firstname");
				String lastName = resultSet.getString("lastname");

				student = new StudentEntry(id, firstName, lastName);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}

		return student;

	}

	public StudentEntry getStudent(String firstName, String lastName) {
		StudentEntry student = null;

		try {
			connection = DBConnection.getConnection();
			String sql = "select * from student where firstname = ? and lastname = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String id = resultSet.getString("studentid");
				String firstName2 = resultSet.getString("firstname");
				String lastName2 = resultSet.getString("lastname");

				student = new StudentEntry(id, firstName2, lastName2);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}

		return student;

	}

	public void dropStudent(String studentID) {

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("delete from student where studentid = ?");
			preparedStatement.setString(1, studentID);

			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}

}
