//Factory Pattern

public class StudentEligibility {

    public EligibilityCriteria getStudent(StudentType studentType) {
        switch (studentType) {
            case STUDENT_TYPE_IN_STATE -> {
                return (new InStateStudent());
            }
            case STUDENT_TYPE_OUT_STATE -> {
                return (new OutStateStudent());
            }
            case STUDENT_TYPE_INTERNATIONAL -> {
                return (new InternationalStudent());
            }
            default -> {
                return null;
            }
        }
    }

    private class InStateStudent implements EligibilityCriteria {

        @Override
        public String toString(){
            return "InState Student";
        }
        @Override
        public boolean eligibleAge(int age) {
            if (age >= 17 && age <= 65) {
                System.out.println("Applicable age.");
                return true;
            } else {
                System.out.println("Not Eligible! Eligible Age for InStateStudent is between 17-65");
                return false;
            }
        }

        @Override
        public boolean eligibleGpa(double gpa) {
            if (gpa >= 3.1) {
                System.out.println("Gpa is within acceptable range");
                return true;
            } else {
                System.out.println("Minimum GPA: 3.1");
                return false;
            }
        }

        @Override
        public boolean eligibleSat(int sat) {
            if (sat >= 1100) {
                System.out.println("Sat score within acceptable range.");
                return true;
            } else {
                System.out.println("Minimum SAT: 1100");
                return false;
            }
        }
    }

    private class OutStateStudent implements EligibilityCriteria {

        @Override
        public String toString() {
            return "OutState Student";
        }

        @Override
        public boolean eligibleAge(int age) {
            if (age >= 17 && age <= 35) {
                System.out.println("Applicable age.");
                return true;
            } else {
                System.out.println("Not Eligible! Eligible age for OutStateStudent should be between 17-35");
                return false;
            }
        }

        @Override
        public boolean eligibleGpa(double gpa) {
            if (gpa >= 3.4) {
                System.out.println("Gpa is within acceptable range");
                return true;
            } else {
                System.out.println("minimum gpa: 3.4");
                return false;
            }
        }

        @Override
        public boolean eligibleSat(int sat) {
            if (sat >= 1250) {
                System.out.println("Sat score is within acceptable range");
                return true;
            } else {
                System.out.println("minimum SAT score: 1250");
                return false;
            }
        }
    }

    private class InternationalStudent implements EligibilityCriteria {

        @Override
        public String toString() {
            return "International Student";
        }
        @Override
        public boolean eligibleAge(int age) {
            if (age >= 17 && age <= 25) {
                System.out.println("Applicable age.");
                return true;
            } else {
                System.out.println("Not Eligible! Eligible age for InternationalStudent should be between 17-25");
                return false;
            }
        }

        @Override
        public boolean eligibleGpa(double gpa) {
            if (gpa >= 3.6) {
                System.out.println("Gpa is within acceptable range");
                return true;
            } else {
                System.out.println("minimum gpa: 3.6 or equivalent international grading score");
                return false;
            }
        }

        @Override
        public boolean eligibleSat(int sat) {
            if (sat >= 1320) {
                System.out.println("Sat score is within acceptable range");
                return true;
            } else {
                System.out.println("minimum SAT score: 1320");
                return false;
            }
        }
    }
}

