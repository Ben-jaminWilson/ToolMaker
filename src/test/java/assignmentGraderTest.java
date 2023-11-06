import Modal.assignmentGrader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentGraderTest {

    @Test
    void assignmentGrader(){
        assignmentGrader grader = new assignmentGrader();
        grader.gradeAssignment(4);
        assertEquals("D",grader.getGrades().get(0),"4=D");
    }

}
