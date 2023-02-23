package model;

public class SemesterEntry {
	
	private String Semester;

	public SemesterEntry(String semester) {
		super();
		Semester = semester;
	}

	public String getSemester() {
		return Semester;
	}

	public void setSemester(String semester) {
		Semester = semester;
	}

	@Override
	public String toString() {
		return "Semester [Semester=" + Semester + "]";
	}
	
	

}
