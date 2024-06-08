public class CollegeStudent extends Student {
    // instance variables
    protected String major;
    protected int year;

    // constructors
    public CollegeStudent(String name, int age, String gender, String idNum, double GPA, String major, int year) {
        super(name, age, gender, idNum, GPA);
        this.major = major;
        this.year = year;
    }

    // getters and setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID num: " + this.myIdNum + ", GPA: " + this.myGPA + ", major: " + this.major
                + ", year: " + this.year;
    }
}
