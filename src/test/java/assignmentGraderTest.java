import toolMaker.achievementGrader;
import toolMaker.assignmentGrader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentGraderTest {

    @Test
    void assignmentGrader(){
        assignmentGrader grader = new assignmentGrader();
        grader.gradeAssignment(4);
        assertEquals("D",grader.getGrades().get(0),"4 = D");
    }
    @Test
    void achievementGrader(){
        achievementGrader grader = new achievementGrader();
        grader.gradeAchievement(6);
        assertEquals("A",grader.getGrades().get(0),"6 = A");
    }

}
