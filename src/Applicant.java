public class Applicant implements Observer{
    private String name;
    private int age;
    private int zipcode;
    private String state;
    private String gender;

    private School school;

    public Applicant(String name, int age, int zipcode, String state, String gender) {
        this.name = name;
        this.age = age;
        this.zipcode = zipcode;
        this.state = state;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getName();
    }

    public  void update()
    {
        System.out.println ("Congratulations, " + getName() + " has been accepted to " + getSchool());
    }

    //The moment you apply to school iot will update your school
    public void applySchool(School school){
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
