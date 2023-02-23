package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.CourseEntry;
import model.ScheduleEntry;
import model.StudentEntry;
import query.CourseQueries;
import query.ScheduleQueries;
import query.SemesterQueries;
import query.StudentQueries;

public class CourseSchedulerGUI extends javax.swing.JFrame {
	private javax.swing.JComboBox<String> scheduleCourseStudentComboBox;
	private javax.swing.JComboBox<String> displayCourseListCourseComboBox;
	private javax.swing.JComboBox<String> dropCourseCourseComboBox;
	private javax.swing.JComboBox<String> scheduleCourseCourseComboBox;
	private javax.swing.JComboBox<String> dropStudentStudentComboBox;
	private javax.swing.JComboBox<String> displayScheduleStudentComboBox;
	private javax.swing.JComboBox<String> dropCouseStudentComboBox;
	private javax.swing.JComboBox<String> dropCouseCourseComboBox;
	private javax.swing.JComboBox<String> changeSemesterComboBox;
	private javax.swing.JButton courseListDisplayButton;
	private javax.swing.JLabel currentSemesterLable;
	private javax.swing.JButton displayCourses;
	private javax.swing.JButton displaySchedule;
	private javax.swing.JTextArea dropStudentTextArea;
	private javax.swing.JButton scheduleCourseButton;
	private javax.swing.JButton addCourseButton;
	private javax.swing.JLabel addCourseStatusLabel;
	private javax.swing.JLabel addSemesterStatusLabel;
	private javax.swing.JButton addSemesterSubmitButton;
	private javax.swing.JTextField addSemesterTextField;
	private javax.swing.JButton addStudent;
	private javax.swing.JLabel addStudentStatusLabel;
	private javax.swing.JLabel enrollStatus;
	private javax.swing.JTextField courseCodeFeild;
	private javax.swing.JTextField seatsField;
	private javax.swing.JTextField firstNameField;
	private javax.swing.JTextField lastNameField;
	private javax.swing.JTextField descriptionField;
	private javax.swing.JButton adminDropCourseButton;
	private javax.swing.JTextArea adminDropCourseText;
	private javax.swing.JButton dropStudentButton;
	private javax.swing.JTable adminTable1;
	private javax.swing.JTable adminTable2;
	private javax.swing.JTextField studentIDField;
	private javax.swing.JButton changeSemesterButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1displaySchedule;
	private javax.swing.JScrollPane jScrollPaneldisplayCourses;
	private javax.swing.JScrollPane jScrollPaneldropStudent;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTabbedPane jTabbedPane3;

	private javax.swing.JButton studentDropCourse;
	private javax.swing.JTextArea studentDropCourseText;
	private javax.swing.JTable table_displaySchedule;
	private javax.swing.JTable table_displayCourses;
	ScheduleQueries scheduleQueries = new ScheduleQueries();
	StudentQueries studentQueries = new StudentQueries();
	CourseQueries courseQueries = new CourseQueries();
	SemesterQueries semesterQueries = new SemesterQueries();

	private String currentSemester;

	public CourseSchedulerGUI() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		addSemesterTextField = new javax.swing.JTextField();
		addSemesterSubmitButton = new javax.swing.JButton();
		addSemesterStatusLabel = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		courseCodeFeild = new javax.swing.JTextField();
		descriptionField = new javax.swing.JTextField();
		seatsField = new javax.swing.JTextField();
		addCourseButton = new javax.swing.JButton();
		addCourseStatusLabel = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		studentIDField = new javax.swing.JTextField();
		firstNameField = new javax.swing.JTextField();
		lastNameField = new javax.swing.JTextField();
		addStudent = new javax.swing.JButton();
		addStudentStatusLabel = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jLabel14 = new javax.swing.JLabel();
		displayCourseListCourseComboBox = new javax.swing.JComboBox<>();
		courseListDisplayButton = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		adminTable1 = new javax.swing.JTable();
		jLabel16 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		adminTable2 = new javax.swing.JTable();
		jPanel10 = new javax.swing.JPanel();
		dropStudentStudentComboBox = new javax.swing.JComboBox<>();
		jLabel13 = new javax.swing.JLabel();
		dropStudentButton = new javax.swing.JButton();
		jScrollPaneldropStudent = new javax.swing.JScrollPane();
		dropStudentTextArea = new javax.swing.JTextArea();
		jPanel11 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		adminDropCourseButton = new javax.swing.JButton();
		dropCourseCourseComboBox = new javax.swing.JComboBox<>();
		jScrollPane6 = new javax.swing.JScrollPane();
		adminDropCourseText = new javax.swing.JTextArea();
		jPanel2 = new javax.swing.JPanel();
		jTabbedPane3 = new javax.swing.JTabbedPane();
		jPanel6 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		scheduleCourseCourseComboBox = new javax.swing.JComboBox<>();
		scheduleCourseStudentComboBox = new javax.swing.JComboBox<>();
		scheduleCourseButton = new javax.swing.JButton();
		enrollStatus = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		displayScheduleStudentComboBox = new javax.swing.JComboBox<>();
		jLabel12 = new javax.swing.JLabel();
		jScrollPane1displaySchedule = new javax.swing.JScrollPane();
		table_displaySchedule = new javax.swing.JTable();
		displaySchedule = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		jScrollPaneldisplayCourses = new javax.swing.JScrollPane();
		table_displayCourses = new javax.swing.JTable();
		displayCourses = new javax.swing.JButton();
		jPanel12 = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		studentDropCourse = new javax.swing.JButton();
		dropCouseStudentComboBox = new javax.swing.JComboBox<>();
		jScrollPane7 = new javax.swing.JScrollPane();
		studentDropCourseText = new javax.swing.JTextArea();
		jLabel19 = new javax.swing.JLabel();
		dropCouseCourseComboBox = new javax.swing.JComboBox<>();
		jLabel2 = new javax.swing.JLabel();
		currentSemesterLable = new javax.swing.JLabel();
		changeSemesterComboBox = new javax.swing.JComboBox<>();
		changeSemesterButton = new javax.swing.JButton();
		List<String> semesterList = semesterQueries.getSemesterList();
		String[] semesterString = new String[semesterList.size()];
		for (int i = 0; i < semesterList.size(); i++) {
			semesterString[i] = semesterList.get(i);
		}
		changeSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
				semesterString));
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 153, 153));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Course Scheduler");

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel3.setText("Semester Name:");

		addSemesterTextField.setColumns(20);
		addSemesterTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

		addSemesterSubmitButton.setText("Add");
		addSemesterSubmitButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						addSemesterSubmitButtonFunction(evt);
					}
				});

		addSemesterStatusLabel
				.setText("                                                   ");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				addSemesterTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																addSemesterStatusLabel,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																361,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addComponent(addSemesterSubmitButton)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(45, 45, 45)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																addSemesterTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																addSemesterSubmitButton))
										.addGap(37, 37, 37)
										.addComponent(addSemesterStatusLabel)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane2.addTab("Add Semester", jPanel3);

		jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel7.setText("Description:");

		jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel8.setText("Maximum Seats:");

		jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel9.setText("Course Code:");

		courseCodeFeild.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		courseCodeFeild.setText("                               ");

		descriptionField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		descriptionField.setText("                               ");

		seatsField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		seatsField
				.setText("                                                           ");

		addCourseButton.setText("Add");
		addCourseButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addCourseButtonFunction(evt);
			}
		});

		addCourseStatusLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		addCourseStatusLabel
				.setText("                                                                   ");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(38, 38, 38)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel8)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jLabel9))
																		.addGap(11,
																				11,
																				11)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																courseCodeFeild,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																descriptionField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				seatsField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(78,
																				78,
																				78)
																		.addComponent(
																				addCourseButton))
														.addComponent(
																addCourseStatusLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																500,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(228, Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(74, 74, 74)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9)
														.addComponent(
																courseCodeFeild,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																20,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																descriptionField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(39, 39, 39)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel8)
														.addComponent(
																seatsField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																addCourseButton))
										.addGap(36, 36, 36)
										.addComponent(addCourseStatusLabel)
										.addContainerGap(73, Short.MAX_VALUE)));

		jTabbedPane2.addTab("Add Course", jPanel4);

		jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel4.setText("Student ID:");

		jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel5.setText("First Name:");

		jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel6.setText("Last Name:");

		studentIDField.setText("                                ");

		firstNameField.setText("                                ");

		lastNameField.setText("                                ");

		addStudent.setText("Add");
		addStudent.setToolTipText("");
		addStudent.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addStudentButtonFunction(evt);
			}
		});

		addStudentStatusLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		addStudentStatusLabel
				.setText("                                           ");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(67, 67, 67)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				79,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				studentIDField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel5))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								firstNameField,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel5Layout
																										.createSequentialGroup()
																										.addComponent(
																												lastNameField,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												addStudent))
																						.addComponent(
																								addStudentStatusLabel,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								312,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(302, Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(81, 81, 81)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																studentIDField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																firstNameField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																addStudent)
														.addComponent(
																lastNameField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(addStudentStatusLabel)
										.addContainerGap(129, Short.MAX_VALUE)));

		jTabbedPane2.addTab("Add Student", jPanel5);

		jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel14.setText("Select Course:");
		jLabel14.setToolTipText("");
		courseListDisplayButton.setText("Display11");
		courseListDisplayButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						courseListDisplayAction(evt);
					}
				});

		jLabel15.setText("Scheduled Students");

		jScrollPane5.setViewportView(adminTable2);

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout
				.setHorizontalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel14)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				displayCourseListCourseComboBox,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				260,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(27,
																				27,
																				27)
																		.addComponent(
																				courseListDisplayButton))
														.addComponent(jLabel15)
														.addComponent(jLabel16)
														.addComponent(
																jScrollPane4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																425,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE))
										.addContainerGap(335, Short.MAX_VALUE)));
		jPanel9Layout
				.setVerticalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel14)
														.addComponent(
																displayCourseListCourseComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																courseListDisplayButton))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel15)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												108,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel16)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												115,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(33, Short.MAX_VALUE)));

		jTabbedPane2.addTab("Display Course List of Students", jPanel9);

		jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel13.setText("Select Student:");

		dropStudentButton.setText("Admin Drop Student");

		dropStudentTextArea.setColumns(20);
		dropStudentTextArea.setRows(5);
		jScrollPaneldropStudent.setViewportView(dropStudentTextArea);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(
				jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout
				.setHorizontalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addGap(39, 39, 39)
										.addGroup(
												jPanel10Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPaneldropStudent,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																539,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel10Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel13)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				dropStudentStudentComboBox,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				200,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(39,
																				39,
																				39)
																		.addComponent(
																				dropStudentButton)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel10Layout
				.setVerticalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addGroup(
												jPanel10Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel13)
														.addComponent(
																dropStudentStudentComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																dropStudentButton))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPaneldropStudent,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		dropStudentButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dropStudent = (String) dropStudentStudentComboBox
						.getSelectedItem();
				String studentID = dropStudent.split(" ")[1];
				studentQueries.dropStudent(studentID);
				rebuildStudentComboBoxesFunction();
				String str = dropStudent
						+ " has been dropped from the list of students.\n";
				List<String> semesterList = semesterQueries.getSemesterList();
				for (int i = 0; i < semesterList.size(); i++) {
					String semesterName = semesterList.get(i);
					List<ScheduleEntry> studentScheduleList = scheduleQueries
							.getScheduleByStudent(semesterName, studentID);
					str += "\nFor Semester " + semesterName + ": \n";
					if (!studentScheduleList.isEmpty()) {
						for (int j = 0; j < studentScheduleList.size(); j++) {
							ScheduleEntry s = studentScheduleList.get(j);
							String courseCode = s.getCourseCode();
							CourseEntry course = courseQueries
									.getCoursesBySemesterAndCourseCode(
											semesterName, courseCode);
							str += dropStudent + " has been dropped from "
									+ courseCode + "\n";

							scheduleQueries.dropScheduleByCourseCodeStudentid(
									semesterName, courseCode, studentID);
							// If Scheduled in the course, schedule another
							// student from the waitlist
							if (s.getStatus().equals("S")) {
								ScheduleEntry sNew = scheduleQueries
										.getScheduleByTimeStamp(
												currentSemester, courseCode);
								if (sNew != null) {
									String newStuId = sNew.getStudentID();
									StudentEntry student = studentQueries
											.getStudent(newStuId);
									str += student.toString()
											+ " has been scheduled into "
											+ courseCode + " \n";
									scheduleQueries
											.updateStudentScheduleByTimeStamp(
													currentSemester,
													courseCode, newStuId);
								} else {
									// find no student in schedule waitlist
									int seat = course.getSeats() + 1;
									courseQueries.UpdateCourseSeat(
											currentSemester, courseCode, seat);
								}
							} else {
								// drop the student from waitlist schedule
								str += dropStudent
										+ " has been dropped from the waitlist for "
										+ courseCode + " \n";
							}
						}
					}
				}
				str += "\n" + dropStudent.split(" ")[0]
						+ " has been removed from all the student comboboxes";
				dropStudentTextArea.setText(str);
			}
		});
		jTabbedPane2.addTab("Drop Student", jPanel10);

		jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel17.setText("Select Course to be Dropped:");

		adminDropCourseButton.setText("Admin Drop Course>>>>");

		adminDropCourseText.setColumns(20);
		adminDropCourseText.setRows(5);
		jScrollPane6.setViewportView(adminDropCourseText);

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(
				jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout
				.setHorizontalGroup(jPanel11Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel11Layout
										.createSequentialGroup()
										.addGap(44, 44, 44)
										.addGroup(
												jPanel11Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																565,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel11Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel17)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				dropCourseCourseComboBox,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				260,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(43,
																				43,
																				43)
																		.addComponent(
																				adminDropCourseButton)))
										.addContainerGap(163, Short.MAX_VALUE)));
		jPanel11Layout
				.setVerticalGroup(jPanel11Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel11Layout
										.createSequentialGroup()
										.addGap(28, 28, 28)
										.addGroup(
												jPanel11Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel17)
														.addComponent(
																adminDropCourseButton)
														.addComponent(
																dropCourseCourseComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												204,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(78, Short.MAX_VALUE)));

		adminDropCourseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String course = (String) dropCourseCourseComboBox
						.getSelectedItem();
				String courseCode = course.split(", ")[1];
				String str = "";
				List<ScheduleEntry> scheduleList = scheduleQueries
						.getScheduleStudentByCourseStatus(currentSemester,
								courseCode, "S");
				str += "Scheduled students dropped from the course:\n";
				if (!scheduleList.isEmpty()) {
					for (int i = 0; i < scheduleList.size(); i++) {
						ScheduleEntry s = scheduleList.get(i);
						StudentEntry student = studentQueries.getStudent(s
								.getStudentID());
						str += student.toString() + "\n";
					}
				}
				scheduleList = scheduleQueries
						.getScheduleStudentByCourseStatus(currentSemester,
								courseCode, "W");
				str += "\nWaitlisted students dropped from the course:\n";
				if (!scheduleList.isEmpty()) {
					for (int i = 0; i < scheduleList.size(); i++) {
						ScheduleEntry s = scheduleList.get(i);
						StudentEntry student = studentQueries.getStudent(s
								.getStudentID());
						str += student.toString() + "\n";
					}
				}
				adminDropCourseText.setText(str);
				courseQueries.dropCourse(currentSemester, courseCode);
				scheduleQueries.dropScheduleByCourse(currentSemester,
						courseCode);
				rebuildCourseComboBoxesFunction();
			}
		});

		jTabbedPane2.addTab("Drop Course", jPanel11);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout
						.createSequentialGroup()
						.addComponent(jTabbedPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 777,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane2));

		jTabbedPane1.addTab("Admin", jPanel1);

		jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel10.setText("Select Course:");

		jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel11.setText("Select Student:");

		scheduleCourseButton.setText("schedule");
		scheduleCourseButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						scheduleCourseButtonFunction(evt);
					}
				});

		enrollStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		enrollStatus
				.setText("                                                                   ");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(23, 23, 23)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel10)
														.addComponent(jLabel11))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																enrollStatus)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								scheduleCourseStudentComboBox,
																								0,
																								90,
																								Short.MAX_VALUE)
																						.addComponent(
																								scheduleCourseCourseComboBox,
																								0,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addGap(62,
																				62,
																				62)
																		.addComponent(
																				scheduleCourseButton)))
										.addContainerGap(360, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(31, 31, 31)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel10)
														.addComponent(
																scheduleCourseCourseComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(28, 28, 28)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel11)
														.addComponent(
																scheduleCourseStudentComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																scheduleCourseButton))
										.addGap(32, 32, 32)
										.addComponent(enrollStatus)
										.addContainerGap(190, Short.MAX_VALUE)));

		jTabbedPane3.addTab("Schedule Courses", jPanel6);

		jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel12.setText("Select Student:");

		table_displaySchedule.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] {

				}));
		jScrollPane1displaySchedule.setViewportView(table_displaySchedule);

		displaySchedule.setText("Display");
		displaySchedule.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				displayScheduleButtonFunction(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel7Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel12)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				displayScheduleStudentComboBox,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				200,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				displaySchedule))
														.addComponent(
																jScrollPane1displaySchedule,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(290, Short.MAX_VALUE)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(45, 45, 45)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																displaySchedule)
														.addComponent(jLabel12)
														.addComponent(
																displayScheduleStudentComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(27, 27, 27)
										.addComponent(
												jScrollPane1displaySchedule,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												183,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(73, Short.MAX_VALUE)));

		jTabbedPane3.addTab("Display Schedule", jPanel7);

		table_displayCourses.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] {

				}));
		jScrollPaneldisplayCourses.setViewportView(table_displayCourses);

		displayCourses.setText("Display");
		displayCourses.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				displayCoursesButtonFunction(evt);
			}
		});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel8Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPaneldisplayCourses,
								javax.swing.GroupLayout.PREFERRED_SIZE, 470,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(displayCourses)
						.addContainerGap(197, Short.MAX_VALUE)));
		jPanel8Layout
				.setVerticalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(53, 53, 53)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																displayCourses)
														.addComponent(
																jScrollPaneldisplayCourses,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																223,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(80, Short.MAX_VALUE)));

		jTabbedPane3.addTab("Display Courses", jPanel8);

		jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel18.setText("Select Student:");

		studentDropCourse.setText("Student Drop Course");

		studentDropCourseText.setColumns(20);
		studentDropCourseText.setRows(5);
		jScrollPane7.setViewportView(studentDropCourseText);

		jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel19.setText("Select Course:");

		studentDropCourse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String studentDropStudent = (String) dropCouseStudentComboBox
						.getSelectedItem();
				String studentDropCourse = (String) dropCouseCourseComboBox
						.getSelectedItem();
				String studentID = studentDropStudent.split(" ")[1];
				String courseCode = studentDropCourse.split(", ")[1];
				ScheduleEntry schdEntry = scheduleQueries
						.getScheduleByCondition(currentSemester, courseCode,
								studentID);
				scheduleQueries.dropScheduleByCourseCodeStudentid(
						currentSemester, courseCode, studentID);
				String str = studentDropStudent + " has been dropped from "
						+ courseCode + ".\n";
				if (schdEntry.getStatus().equals("S")) {
					ScheduleEntry sNew = scheduleQueries
							.getScheduleByTimeStamp(currentSemester, courseCode);
					if (sNew != null) {
						StudentEntry student = studentQueries
								.getStudent(sNew.getStudentID());
						str += student.toString().split(" ")[0]
								+ " has been scheduled into " + courseCode+"\n";
						scheduleQueries.updateStudentScheduleByTimeStamp(
								currentSemester, courseCode, sNew.getStudentID());
					} else {
						CourseEntry c = courseQueries
								.getCoursesBySemesterAndCourseCode(
										currentSemester, courseCode);
						int seat = c.getSeats() + 1;
						courseQueries.UpdateCourseSeat(currentSemester,
								courseCode, seat);
					}
				}
				studentDropCourseText.setText(str);
			}
		});

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(
				jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout
				.setHorizontalGroup(jPanel12Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel12Layout
										.createSequentialGroup()
										.addGap(26, 26, 26)
										.addGroup(
												jPanel12Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jScrollPane7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																481,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel12Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel12Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel18)
																						.addComponent(
																								jLabel19))
																		.addGap(23,
																				23,
																				23)
																		.addGroup(
																				jPanel12Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								dropCouseStudentComboBox,
																								0,
																								117,
																								Short.MAX_VALUE)
																						.addComponent(
																								dropCouseCourseComboBox,
																								0,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				studentDropCourse)))
										.addContainerGap(265, Short.MAX_VALUE)));
		jPanel12Layout
				.setVerticalGroup(jPanel12Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel12Layout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addGroup(
												jPanel12Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel19)
														.addComponent(
																dropCouseCourseComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(16, 16, 16)
										.addGroup(
												jPanel12Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																dropCouseStudentComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																studentDropCourse)
														.addComponent(jLabel18))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												17, Short.MAX_VALUE)
										.addComponent(
												jScrollPane7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												204,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(44, 44, 44)));

		jTabbedPane3.addTab("Drop Course", jPanel12);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 777,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane3));

		jTabbedPane1.addTab("Student", jPanel2);

		jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 18)); // NOI18N
		jLabel2.setText("Current Semester: ");

		currentSemesterLable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
		currentSemesterLable.setText("           ");

		changeSemesterComboBox
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						changeSemesterComboBoxFunction(evt);
					}
				});

		changeSemesterButton.setText("Change Semester");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(10, 10,
																		10)
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		currentSemesterLable,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		195,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		changeSemesterComboBox,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		140,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(30, 30,
																		30)
																.addComponent(
																		changeSemesterButton)
																.addGap(80, 80,
																		80)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														currentSemesterLable)
												.addComponent(
														changeSemesterComboBox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														changeSemesterButton))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTabbedPane1)));

		pack();
		setTitle("Course Scheduling");
		setLocationRelativeTo(null);
		rebuildSemesterComboBoxesFunction();
	}

	public void rebuildSemesterComboBoxesFunction() {
		ArrayList<String> semesters = semesterQueries.getSemesterList();
		changeSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				semesters.toArray()));
		if (semesters.size() > 0) {
			currentSemesterLable.setText(semesters.get(0));
			currentSemester = semesters.get(0);
			currentSemesterLable.setText(currentSemester);
			rebuildStudentComboBoxesFunction();
			rebuildCourseComboBoxesFunction();
		} else {
			currentSemesterLable.setText("None, add a semester.");
			currentSemester = "None";
		}
	}

	public void rebuildCourseComboBoxesFunction() {
		List<CourseEntry> courseList = courseQueries
				.getAllCourses(currentSemester);
		String[] courseStr = new String[courseList.size()];
		for (int i = 0; i < courseList.size(); i++) {
			CourseEntry c = courseList.get(i);
			courseStr[i] = c.toString();
		}
		displayCourseListCourseComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(courseStr));
		dropCourseCourseComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(courseStr));
		scheduleCourseCourseComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(courseStr));
		dropCouseCourseComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(courseStr));

	}

	public void rebuildStudentComboBoxesFunction() {
		ArrayList<StudentEntry> studentList = studentQueries.getAllStudents();
		String[] studentStr = new String[studentList.size()];
		for (int i = 0; i < studentList.size(); i++) {
			StudentEntry c = studentList.get(i);
			studentStr[i] = c.toString();
		}
		scheduleCourseStudentComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(studentStr));
		dropStudentStudentComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(studentStr));
		displayScheduleStudentComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(studentStr));
		dropCouseStudentComboBox
				.setModel(new javax.swing.DefaultComboBoxModel<>(studentStr));
	}

	private void changeSemesterComboBoxFunction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_changeSemesterComboBoxActionPerformed
		String selectedSemester = (String) changeSemesterComboBox
				.getSelectedItem();
		currentSemester = selectedSemester;
		currentSemesterLable.setText(selectedSemester);
		rebuildCourseComboBoxesFunction();
		rebuildStudentComboBoxesFunction();
	}

	private void addStudentButtonFunction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addStudentActionPerformed
		String studentID = studentIDField.getText().trim();
		String firstName = firstNameField.getText().trim();
		String lastName = lastNameField.getText().trim();

		if (studentID.equals("") || firstName.equals("") || lastName.equals("")) {
			addStudentStatusLabel.setText("All information cannot be null!");

		} else {
			if (studentQueries.getStudent(studentID) == null) {

				if (studentQueries.getStudent(firstName, lastName) == null) {
					StudentEntry student = new StudentEntry(studentID,
							firstName, lastName);
					studentQueries.addStudent(student);
					addStudentStatusLabel.setText(lastName + ", " + firstName
							+ " added to student comboboxes.");
					rebuildStudentComboBoxesFunction();
					rebuildCourseComboBoxesFunction();
				} else {
					addStudentStatusLabel.setText(firstName + ", " + lastName
							+ " is already exist!!!");
				}

			} else {
				addStudentStatusLabel.setText("StudentID is already exist!!!");
			}
		}
	}

	private void addSemesterSubmitButtonFunction(java.awt.event.ActionEvent evt) {

		if (addSemesterTextField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "semester cannot be null!");
		} else {
			String semester = addSemesterTextField.getText();

			if (semesterQueries.getSemester(semester) == null) {
				semesterQueries.addSemester(semester);
				addSemesterStatusLabel.setText("Semester: " + semester
						+ " was added.");
				rebuildSemesterComboBoxesFunction();
			} else {
				addSemesterStatusLabel.setText("Semester: " + semester
						+ " is already exist.");
			}
		}
	}

	private void courseListDisplayAction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_courseListDisplayButtonActionPerformed
		String courseCodeStr = (String) displayCourseListCourseComboBox
				.getSelectedItem();
		String courseCode = courseCodeStr.split(", ")[1];
		List<ScheduleEntry> scheduleList = scheduleQueries
				.getScheduleStudentByCourseStatus(currentSemester, courseCode,
						"S");
		String[][] scheduleStudents = new String[scheduleList.size()][3];
		for (int i = 0; i < scheduleList.size(); i++) {
			ScheduleEntry s = scheduleList.get(i);
			String studentID = s.getStudentID();
			StudentEntry stu = studentQueries.getStudent(studentID);
			scheduleStudents[i][0] = stu.getLastName();
			scheduleStudents[i][1] = stu.getFirstName();
			scheduleStudents[i][2] = stu.getStudentID();
		}
		adminTable1.setModel(new javax.swing.table.DefaultTableModel(
				scheduleStudents, new String[] { "Last Name", "FirstName",
						"Student ID" }));
		jScrollPane4.setViewportView(adminTable1);

		scheduleList = scheduleQueries.getScheduleStudentByCourseStatus(
				currentSemester, courseCode, "W");
		scheduleStudents = new String[scheduleList.size()][3];
		for (int i = 0; i < scheduleList.size(); i++) {
			ScheduleEntry s = scheduleList.get(i);
			String studentID = s.getStudentID();
			StudentEntry stu = studentQueries.getStudent(studentID);
			scheduleStudents[i][0] = stu.getLastName();
			scheduleStudents[i][1] = stu.getFirstName();
			scheduleStudents[i][2] = stu.getStudentID();
		}
		adminTable2.setModel(new javax.swing.table.DefaultTableModel(
				scheduleStudents, new String[] { "Last Name", "FirstName",
						"Student ID" }));
		jScrollPane5.setViewportView(adminTable2);
	}

	private void scheduleCourseButtonFunction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EnrollButtonActionPerformed
		String courseCode = ((String) scheduleCourseCourseComboBox
				.getSelectedItem()).split(", ")[1];
		String studentID = ((String) scheduleCourseStudentComboBox
				.getSelectedItem()).split(" ")[1];
		if (scheduleQueries.getScheduleByCondition(currentSemester, courseCode,
				studentID) == null) {
			int seat = courseQueries.getCourseSeat(currentSemester, courseCode);
			Timestamp now = new Timestamp(new Date().getTime());
			if (seat == 0) {
				ScheduleEntry schedule = new ScheduleEntry(currentSemester,
						courseCode, studentID, "W", now);
				enrollStatus
						.setText("This Student has been added to the waitlisted!!");
				scheduleQueries.addScheduleEntry(schedule);
			} else {
				ScheduleEntry schedule = new ScheduleEntry(currentSemester,
						courseCode, studentID, "S", now);
				enrollStatus
						.setText("This Student has been added to the scheduled!!");
				scheduleQueries.addScheduleEntry(schedule);
				seat--;
				courseQueries.UpdateCourseSeat(currentSemester, courseCode,
						seat);
			}
		} else {
			enrollStatus
					.setText("This Student is already exist in this course!!");
		}
	}

	private void addCourseButtonFunction(java.awt.event.ActionEvent evt) {
		String courseCode = courseCodeFeild.getText().trim();
		String seats = seatsField.getText().trim();
		addCourseStatusLabel.setText("");
		int seat = -1;
		try {
			seat = Integer.parseInt(seats);
		} catch (Exception e) {
			addCourseStatusLabel
					.setText("Please input an number into Maximum Seat!!!");
			return;
		}

		String description = descriptionField.getText().trim();

		if (courseCode.equals("") || seats.equals("")) {
			addCourseStatusLabel
					.setText("CourseCode and Maximum Seats cannot be null!!!");
		} else {
			String semester = (String) changeSemesterComboBox.getSelectedItem();
			if (courseQueries.getCoursesBySemesterAndCourseCode(semester,
					courseCode) == null) {
				CourseEntry course = new CourseEntry(semester, courseCode,
						description, seat);
				courseQueries.addCourse(course);
				rebuildCourseComboBoxesFunction();
				addCourseStatusLabel.setText(courseCode
						+ "  added to course comboboxes.");
			} else {
				addCourseStatusLabel
						.setText("Semester: " + semester + ", CourseCode:"
								+ courseCode + " is already exist!!!");
			}

		}
	}// GEN-LAST:event_addCourseActionPerformed

	private void displayCoursesButtonFunction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_displayCoursesActionPerformed
		String[] head = new String[] { "semester", "courserCode",
				"description", "seat" };

		DefaultTableModel tableModel = new DefaultTableModel(queryCourse(head),
				head) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table_displayCourses.setModel(tableModel);
	}

	private void displayScheduleButtonFunction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_displayScheduleActionPerformed
		String[] head = new String[] { "semester", "studentID", "courseCode",
				"status", "TimeStamp" };

		DefaultTableModel tableModel = new DefaultTableModel(
				querySchedule(head), head) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table_displaySchedule.setModel(tableModel);
	}

	private Object[][] queryCourse(String[] head) {

		ArrayList<CourseEntry> list = courseQueries
				.getAllCourses(currentSemester);

		Object[][] data = new Object[list.size()][head.length];

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < head.length; j++) {
				data[i][0] = list.get(i).getSemester();
				data[i][1] = list.get(i).getCourseCode();
				data[i][2] = list.get(i).getDescription();
				data[i][3] = list.get(i).getSeats();
			}
		}
		return data;
	}

	private Object[][] querySchedule(String[] head) {
		String student = (String) displayScheduleStudentComboBox
				.getSelectedItem();
		String studentID = student.split(" ")[1];
		ArrayList<ScheduleEntry> list = scheduleQueries.getScheduleByStudent(
				currentSemester, studentID);

		Object[][] data = new Object[list.size()][head.length];

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < head.length; j++) {
				data[i][0] = list.get(i).getSemester();
				data[i][1] = list.get(i).getCourseCode();
				data[i][2] = list.get(i).getStudentID();
				data[i][3] = list.get(i).getStatus();
				data[i][4] = list.get(i).getTimestamp();
			}
		}
		return data;
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CourseSchedulerGUI().setVisible(true);
			}
		});
	}

}
