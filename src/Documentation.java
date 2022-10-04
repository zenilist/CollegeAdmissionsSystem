import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Documentation extends StudentDocuments implements documents {

    public StudentDocuments submit_documents() throws IOException {

            BufferedReader doc = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your name to submit the documents for your application:");
            String student_name = doc.readLine();

            System.out.println("Please enter your Student ID:");
            long student_ID = Long.parseLong(doc.readLine());

            System.out.println("Please submit your SAT scores");
            int satScore = Integer.parseInt(doc.readLine());

            System.out.println("Please submit your highschool GPA");
            double gpa = Double.parseDouble(doc.readLine());

            StudentDocuments studentDocuments = new StudentDocuments(student_ID,student_name,satScore,gpa);
            return studentDocuments;

    }

    public String get_document() {
        return null;
    }

    public String get_satScore() {

        long satScore = getSatScore();

        String student_name = getStudent_name();

        long document = getSatScore();

        return ("Thank you for submitting the scores! Good Luck!");
    }
}
