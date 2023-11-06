package toolMaker;

import java.util.ArrayList;

public class arrayBuilder {
    ArrayList<String> grades = new ArrayList<String>();

    protected void addGrade(String grade) {
        grades.add(grade);
    }
    public ArrayList<String> getGrades() {
        return grades;
    }
    String yourFinalGrade;
    public void calculateFinalGrade(){
        if (grades.contains("F")){
            yourFinalGrade = ("F");
        } else if (grades.contains("D")) {
            yourFinalGrade = ("D");
        } else if (grades.contains("C")) {
            yourFinalGrade = ("C");
        } else if (grades.contains("B")) {
            yourFinalGrade = ("B");
        }else{
            yourFinalGrade = ("A");
        }
    }


}
