import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        //Start new application
        Application application = new Application();

        //sign up process
        SignUpApplication signUpApplication = new SignUpApplication(application);
        signUpApplication.execute();
        Applicant applicant = new Applicant("John",21,11111,"NY","m");

        //documentation process
        Documentation documentation = new Documentation();
        StudentDocuments documents = documentation.submit_documents();
        System.out.println(documents.getGpa());


        Bursar bursar = new Bursar();



        //Eligibility process
        StudentEligibility studentEligibility = new StudentEligibility();
        EligibilityCriteria eligibilityCriteria = studentEligibility.getStudent(StudentType.STUDENT_TYPE_IN_STATE);

        if(eligibilityCriteria.eligibleAge(applicant.getAge()) && eligibilityCriteria.eligibleGpa(documents.getGpa()) && eligibilityCriteria.eligibleSat(documents.getSatScore())) {
            System.out.println("Documentation cleared! Eligible for admission.");
            School QueensCollege = new School();
            applicant.applySchool(QueensCollege);
            QueensCollege.addStudent(applicant);
            QueensCollege.upload("Queens College");
            QueensCollege.notifyStudent();

            //financial aid and scholarship
            int income, due;
             FinancialAid financialAid = new FinancialAid();
             income = financialAid.income();
             due = 7000 - (FinancialAid.getFafsa(income, 7000) + FinancialAid.getScholar(documents.getGpa(),7000));
            if(due>0)
                System.out.println(applicant.getName() + " owes CUNY $" + due);
            else
                System.out.println(applicant.getName() + " will get a refund of " + due);
            //System.out.println(due);
            //upload applicant name to bursar
            Document document = new Document();
            document.setText(applicant.getName());
            bursar.saveMyData(new Memento(document));
            //document.due(due);


            //select major, minor, interests and subjects
            MajorDeclaration majorDeclaration = new MajorDeclaration();
            majorDeclaration.runPattern();
            majorDeclaration.printPattern();

        }
        else
            System.out.println("Not eligible for admission");


    }
}
