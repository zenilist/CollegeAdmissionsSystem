import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        beginSignUpProcess();
        Applicant applicant = new Applicant();
        StudentDocuments documents = getStudentDocuments();
        Bursar bursar = new Bursar();
        EligibilityCriteria eligibilityCriteria = getEligibilityCriteria();

        if(applicantIsEligible(eligibilityCriteria, applicant, documents)) {
            BeginEnrollmentProcess(applicant, documents, bursar);
        }
        else
            notifyApplicant("Not eligible for admission");
    }

    private static void BeginEnrollmentProcess(Applicant applicant, StudentDocuments documents, Bursar bursar) throws IOException {
        notifySuccessfulApplication(applicant);
        beginFinancialAidProcess(documents, applicant);
        sendApplicationToBursar(applicant, bursar);
        declareMajor();
    }

    private static void notifyApplicant(String message) {
        System.out.println(message);
    }

    private static void declareMajor() {
        MajorDeclaration majorDeclaration = new MajorDeclaration();
        majorDeclaration.runPattern();
        majorDeclaration.printPattern();
    }

    private static void sendApplicationToBursar(Applicant applicant, Bursar bursar) {
        Document document = new Document();
        document.setText(applicant.getName());
        bursar.saveMyData(new Memento(document));
    }

    private static void beginFinancialAidProcess(StudentDocuments documents, Applicant applicant) throws IOException {
        int income, due;
        FinancialAid financialAid = new FinancialAid();
        income = financialAid.income();
        due = 7000 - (FinancialAid.getFafsa(income, 7000) + FinancialAid.getScholar(documents.getGpa(),7000));
        if(due>0)
            notifyApplicant(applicant.getName() + " owes the City University of New York $" + due);
        else
            notifyApplicant(applicant.getName() + " will get a refund of " + due);
    }

    private static void notifySuccessfulApplication(Applicant applicant) {
        notifyApplicant("Documentation cleared! Eligible for admission.");
        School QueensCollege = new School();
        applicant.applySchool(QueensCollege);
        QueensCollege.addStudent(applicant);
        QueensCollege.upload("Queens College");
        QueensCollege.notifyStudent();
    }

    private static boolean applicantIsEligible(EligibilityCriteria eligibilityCriteria, Applicant applicant, StudentDocuments documents) {
        return eligibilityCriteria.eligibleAge(applicant.getAge()) && eligibilityCriteria.eligibleGpa(documents.getGpa()) && eligibilityCriteria.eligibleSat(documents.getSatScore());
    }

    private static EligibilityCriteria getEligibilityCriteria() {
        StudentEligibility studentEligibility = new StudentEligibility();
        return studentEligibility.getStudent(StudentType.STUDENT_TYPE_IN_STATE);
    }

    private static StudentDocuments getStudentDocuments() throws IOException {
        Documentation documentation = new Documentation();
        StudentDocuments documents = documentation.submit_documents();
        System.out.println(documents.getGpa());
        return documents;
    }

    private static void beginSignUpProcess() {
        Application application = new Application();
        SignUpApplication signUpApplication = new SignUpApplication(application);
        signUpApplication.execute();
    }
}
