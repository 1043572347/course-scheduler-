package query;

import DB.DBConnection;
import java.sql.*;
import java.util.*;

import model.*;

public class CourseQueries {

	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	public ArrayList<CourseEntry> getAllCourses(String semester) {
		ArrayList<CourseEntry> list = new ArrayList<CourseEntry>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT Semester,CourseCode,Description,Seats FROM Course WHERE Semester = ?");
			preparedStatement.setString(1, semester);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String description = resultSet.getString("description");
				String courseCode = resultSet.getString("courseCode");
				int seats = resultSet.getInt("seats");

				CourseEntry course = new CourseEntry(semester2, courseCode,
						description, seats);
				list.add(course);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;
	}

	public void addCourse(CourseEntry course) {

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("INSERT INTO COURSE (SEMESTER, COURSECODE, DESCRIPTION, SEATS) "
							+ "VALUES (?,?,?,?)");
			preparedStatement.setString(1, course.getSemester());
			preparedStatement.setString(2, course.getCourseCode());
			preparedStatement.setString(3, course.getDescription());
			preparedStatement.setInt(4, course.getSeats());
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}

	public ArrayList<String> getAllCourseCodes(String semester) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT Semester,CourseCode,Description,Seats FROM Course WHERE Semester = ?");
			preparedStatement.setString(1, semester);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				String courseCode = resultSet.getString("courseCode");

				list.add(courseCode);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;

	}

	public int getCourseSeat(String semester, String courseCode) {
		int seat = -1;
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT Semester,CourseCode,Description,Seats FROM Course WHERE Semester = ? "
							+ "and coursecode = ?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				seat = resultSet.getInt("seats");
			}

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}

		return seat;

	}

	public void dropCourse(String semester, String courseCode) {
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("delete  FROM Course WHERE Semester = ? "
							+ "and coursecode = ?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			preparedStatement.executeUpdate();

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}

	}

	public CourseEntry getCoursesBySemesterAndCourseCode(String semester,
			String courseCode) {
		CourseEntry course = null;
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT Semester,CourseCode,Description,Seats FROM Course WHERE Semester = ?"
							+ "and coursecode =?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String description = resultSet.getString("description");
				String courseCode2 = resultSet.getString("courseCode");
				int seats = resultSet.getInt("seats");
				course = new CourseEntry(semester2, courseCode2, description,
						seats);
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return course;
	}

	public void UpdateCourseSeat(String semester, String courseCode, int seat) {
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("update Course set seats = ?   WHERE Semester = ? "
							+ "and coursecode = ?");
			preparedStatement.setInt(1, seat);
			preparedStatement.setString(2, semester);
			preparedStatement.setString(3, courseCode);
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}

	}

}
