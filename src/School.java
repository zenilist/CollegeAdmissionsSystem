import java.util.ArrayList;
import java.util.List;

public class School implements Observable{
        List<Applicant> applicants = new ArrayList<>();
        private String schoolName;

        public void addStudent (Applicant registerStudent)
        {

            applicants.add(registerStudent);
        }

        public void removeStudent (Applicant unregisterStudent)
        {

            applicants.remove(unregisterStudent);
        }
        public String getSchool(){
        return schoolName;
        }
        public void notifyStudent()
        {
              for(Applicant applicant : applicants)
                 {
                     applicant.update();
                 }
        }

        public void upload(String schoolName){
            this.schoolName = schoolName;
            notifyStudent();
        }
        public String toString(){
            return schoolName;
        }

}