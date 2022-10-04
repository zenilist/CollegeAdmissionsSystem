public interface EligibilityCriteria {
    boolean eligibleAge(int age);
    boolean eligibleGpa(double gpa);
    boolean eligibleSat(int sat);
}
