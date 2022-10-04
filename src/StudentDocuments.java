public class StudentDocuments {

    private long student_ID;
    private String student_name;
    private int satScore;
    private double gpa;

    public StudentDocuments(){}
    public StudentDocuments(long student_ID, String student_name, int satScore, double gpa) {
        this.student_ID = student_ID;
        this.student_name = student_name;
        this.satScore = satScore;
        this.gpa = gpa;
    }


    public long getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(long student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getSatScore() {
        return satScore;
    }

    public void setSatScore(int satScore) {
        this.satScore = satScore;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
