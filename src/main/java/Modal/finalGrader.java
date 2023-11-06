package Modal;

import java.util.ArrayList;

public class finalGrader {
    ArrayList<String> grades = new ArrayList<String>();

    protected void addGrade(String grade) {
        grades.add(grade);
    }
    public ArrayList<String> getGrades() {
        return grades;
    }


}
