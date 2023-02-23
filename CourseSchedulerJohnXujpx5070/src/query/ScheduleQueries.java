package query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import model.ScheduleEntry;
import DB.DBConnection;

public class ScheduleQueries {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	public void addScheduleEntry(ScheduleEntry entry) {
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("insert into schedule (semester,studentid,coursecode,status,timestamp) values (?,?,?,?,?)");
			preparedStatement.setString(1, entry.getSemester());
			preparedStatement.setString(2, entry.getStudentID());
			preparedStatement.setString(3, entry.getCourseCode());
			preparedStatement.setString(4, entry.getStatus());
			preparedStatement.setTimestamp(5, entry.getTimestamp());
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}

	public ArrayList<ScheduleEntry> getScheduleByStudent(String semester,
			String studentID) {
		ArrayList<ScheduleEntry> list = new ArrayList<ScheduleEntry>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?"
							+ "and studentid = ?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, studentID);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String courseCode = resultSet.getString("coursecode");
				String studentID2 = resultSet.getString("studentid");
				String status = resultSet.getString("status");
				Timestamp timestamp = resultSet.getTimestamp("timestamp");

				ScheduleEntry schedule = new ScheduleEntry(semester2,
						courseCode, studentID2, status, timestamp);
				list.add(schedule);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;
	}

	public int getScheduleStudentCount(String currentSemester, String courseCode) {
		int studentCount = 0;
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?"
							+ "and coursecode = ?");
			preparedStatement.setString(1, currentSemester);
			preparedStatement.setString(2, courseCode);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				studentCount++;
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return studentCount;
	}

	public ArrayList<ScheduleEntry> getScheduleStudentByCourse(String semester,
			String courseCode) {
		ArrayList<ScheduleEntry> list = new ArrayList<ScheduleEntry>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?"
							+ "and coursecode = ?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String studentID2 = resultSet.getString("studentid");
				String status = resultSet.getString("status");
				Timestamp timestamp = resultSet.getTimestamp("timestamp");

				ScheduleEntry schedule = new ScheduleEntry(semester2,
						courseCode, studentID2, status, timestamp);
				list.add(schedule);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;
	}

	public void dropScheduleByCourse(String semester, String courseCode) {
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("delete from schedule where semester = ? "
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

	public void dropScheduleByCourseCodeStudentid(String semester,
			String courseCode, String studentid) {
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("delete from schedule where semester = ? "
							+ "and coursecode = ? and studentid=?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			preparedStatement.setString(3, studentid);
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}

	public ScheduleEntry getScheduleByCondition(String semester,
			String courseCode, String studentid) {
		ScheduleEntry schedule = null;
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?"
							+ "and coursecode = ? and studentid =? ");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			preparedStatement.setString(3, studentid);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String courseCode2 = resultSet.getString("coursecode");
				String studentID2 = resultSet.getString("studentid");
				String status = resultSet.getString("status");
				Timestamp timestamp = resultSet.getTimestamp("timestamp");

				schedule = new ScheduleEntry(semester2, courseCode2,
						studentID2, status, timestamp);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return schedule;
	}

	public ArrayList<ScheduleEntry> getScheduleStudentByCourseStatus(
			String semester, String courseCode, String status) {
		ArrayList<ScheduleEntry> list = new ArrayList<ScheduleEntry>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?"
							+ " and coursecode = ? and status = ?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			preparedStatement.setString(3, status);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String studentID2 = resultSet.getString("studentid");
				Timestamp timestamp = resultSet.getTimestamp("timestamp");
				ScheduleEntry schedule = new ScheduleEntry(semester2,
						courseCode, studentID2, status, timestamp);
				list.add(schedule);
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;
	}

	public ArrayList<String> getStudentIDBySchedule(String currentSemester) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?");
			preparedStatement.setString(1, currentSemester);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				String studentID2 = resultSet.getString("studentid");

				list.add(studentID2);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return list;
	}

	public ScheduleEntry getScheduleByTimeStamp(String semester,
			String courseCode) {
		ArrayList<ScheduleEntry> list = new ArrayList<ScheduleEntry>();
		ScheduleEntry schedule = null;
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("SELECT * FROM schedule WHERE semester = ?"
							+ "and coursecode = ? and status='W' order by TimeStamp asc");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String semester2 = resultSet.getString("semester");
				String studentID2 = resultSet.getString("studentid");
				String status = resultSet.getString("status");
				Timestamp timestamp = resultSet.getTimestamp("timestamp");

				schedule = new ScheduleEntry(semester2, courseCode, studentID2,
						status, timestamp);
				list.add(schedule);

			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
		return schedule;
	}

	public void updateStudentScheduleByTimeStamp(String semester,
			String courseCode, String studentid) {
		try {
			connection = DBConnection.getConnection();

			preparedStatement = connection
					.prepareStatement("update schedule set status='S' WHERE semester = ?"
							+ " and coursecode = ? and studentid = ?");
			preparedStatement.setString(1, semester);
			preparedStatement.setString(2, courseCode);
			preparedStatement.setString(3, studentid);
			preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, resultSet);
		}
	}
}
