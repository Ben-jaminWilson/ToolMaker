package toolMaker;

import java.util.ArrayList;
import java.util.Arrays;

public class projectsGrader extends arrayBuilder{
    public String gradeFirst(String firstProject){
        ArrayList<String> passingGrades = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        if (passingGrades.contains(firstProject)) {
            return "A";
        } else {
            return firstProject;
        }
    }
    public String gradeGUI(String GUIProject){
        ArrayList<String> passingGrades = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        if (passingGrades.contains(GUIProject)) {
            return "A";
        } else {
            return GUIProject;
        }
    }
    public void gradeFinal(String finalProject){
        addGrade(finalProject);
    }


}
