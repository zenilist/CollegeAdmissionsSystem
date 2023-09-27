import java.util.Scanner;

public class Applicant implements Observer{
    private String name;
    private int age;
    private int zipcode;
    private String state;
    private String gender;
    private School school;

    public Applicant(){
        getApplicantInput();
    }

    private void getApplicantInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        setName(input.nextLine());
        System.out.println("Enter age: ");
        setAge(input.nextInt());
        System.out.println("Enter zipcode: ");
        setZipcode(input.nextInt());
        System.out.println("Enter state of residency: ");
        setState(input.nextLine());
        System.out.println("Enter gender: ");
        setGender(input.nextLine());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() throws NumberFormatException {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setState(String state) {
        this.state = state;
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
