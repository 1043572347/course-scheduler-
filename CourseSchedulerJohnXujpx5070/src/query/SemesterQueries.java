package query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.DBConnection;

public class SemesterQueries {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	public void addSemester(String Semester) {
		connection = DBConnection.getConnection();
		try {
			preparedStatement = connection
					.prepareStatement("insert into semester (semester) values (?)");
			preparedStatement.setString(1, Semester);
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}

	public String getSemester(String semester) {
		String s = null;
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM semester where semester =?");
			preparedStatement.setString(1, semester);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				s = resultSet.getString("semester");
				System.out.println(s);
			}

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return s;
	}

	public ArrayList<String> getSemesterList() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection.prepareStatement("SELECT * FROM semester");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");

				list.add(semester2);
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;
	}
}
