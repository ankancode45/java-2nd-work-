class Teacher {
    private String tname;
    private String subject;
    private int yrsofexp;

    // Getter and Setter methods
    public String getTeacherName() {
        return tname;
    }

    public void setTeacherName(String tname) {
        this.tname = tname;
    }

    public String getSubjectTaught() {
        return subject;
    }

    public void setSubjectTaught(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yrsofexp;
    }

    public void setYearsOfExperience(int yrsofexp) {
        this.yrsofexp = yrsofexp;
    }
}

class Student {
    private String sname;
    private String degree;
    private String college;

    // Getter and Setter methods
    public String getStudentName() {
        return sname;
    }

    public void setStudentName(String sname) {
        this.sname = sname;
    }

    public String getDegreePursuing() {
        return degree;
    }

    public void setDegreePursuing(String degree) {
        this.degree = degree;
    }

    public String getCollegeName() {
        return college;
    }

    public void setCollegeName(String college) {
        this.college = college;
    }
}

class Relationship {   // Establishes relation between Teacher and Student classes

    // Method to set details for Teacher
    public static void configureTeacher(Teacher tea, String tname, String subject, int yrsofexp) {
        tea.setTeacherName(tname);
        tea.setSubjectTaught(subject);
        tea.setYearsOfExperience(yrsofexp);
    }

    // Method to set details for Student
    public static void configureStudent(Student stud, String sname, String degree, String college) {
        stud.setStudentName(sname);
        stud.setDegreePursuing(degree);
        stud.setCollegeName(college);
    }

    public static void displayTeacherStudentRelationship(Teacher tea, Student stud) {
        System.out.println(stud.getStudentName() + " takes " + stud.getDegreePursuing() + " class under " + tea.getTeacherName() + " Sir");
    }

    public static void displayTeacherStudentDetails(Teacher tea, Student stud) {
        System.out.println(tea.getTeacherName() + " Sir teaches " + tea.getSubjectTaught() + " to " + stud.getStudentName() +
            " reading as " + stud.getDegreePursuing() + " in " + stud.getCollegeName() + " college");
    }

    public static void main(String[] args) { // Main method
        Teacher tea = new Teacher();
        configureTeacher(tea, "Amitava", "OOPS DESIGN", 10);  

        Student stud1 = new Student();
        configureStudent(stud1, "Ankan", "Java", "UEM");  

        Student stud2 = new Student();
        configureStudent(stud2, "Madhu", "Btech", "UEM");  

        // Using the static methods to establish teacher-student relationships
        displayTeacherStudentRelationship(tea, stud1);
        displayTeacherStudentDetails(tea, stud2);
    }
}