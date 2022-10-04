import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinancialAid {

    public int income() throws IOException {
        System.out.println("Enter yearly income: ");
        BufferedReader doc = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter income:")
        int income = Integer.parseInt(doc.readLine());
        return income;
    }


    public static int getFafsa(int income, int fafsa) {
        if (income <= 50000) {
            fafsa = fafsa - fafsa;
            return fafsa;
        } else if (income <= 150000) {
            if (fafsa > 3500) {
                fafsa = fafsa - 3500;
                return fafsa;
            } else {
                fafsa = fafsa - fafsa;
                return fafsa;
            }
        } else if (income > 150000) {
            return fafsa;
        }
        return fafsa;
    }

    public static int getScholar(double gpa, int due) {
        if (gpa >= 4.0) {
            due = due - due;
            return due;
        } else if (gpa > 3.5 && due > 3500) {
            due = due - 3500;
            return due;
        }
        else
            return due;

    }
}
