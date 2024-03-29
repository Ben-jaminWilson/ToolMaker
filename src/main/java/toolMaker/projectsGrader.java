package toolMaker;

import java.util.ArrayList;
import java.util.Arrays;

public class projectsGrader extends arrayBuilder{
    public void gradeFirst(String firstProject){
        ArrayList<String> passingGrades = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        if (passingGrades.contains(firstProject)) {
            addGrade("A");
        } else {
            addGrade("F");
        }
    }
    public void gradeGUI(String GUIProject){
        ArrayList<String> passingGrades = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        if (passingGrades.contains(GUIProject)) {
            addGrade("A");
        } else {
            addGrade("F");
        }
    }
    public void gradeFinal(String finalProject){
        addGrade(finalProject);
    }


}
