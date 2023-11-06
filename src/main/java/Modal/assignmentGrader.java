package Modal;

public class assignmentGrader extends finalGrader{
    public String gradeAssignment(int assignments){
        if (assignments == 7){
            addGrade("A");
        }else if (assignments == 6){
            addGrade("B");
        }else if (assignments == 5){
            addGrade("C");
        }else if (assignments == 4){
            addGrade("D");
        }else{
            addGrade("F");
        }
    return null;
    }
}
