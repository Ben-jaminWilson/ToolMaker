package Modal;

public class achievementGrader extends finalGrader {
    public String gradeAchievement(int achievement) {
        if (achievement == 6) {
            addGrade("A");
        } else if (achievement == 4) {
            addGrade("B");
        } else if (achievement == 2) {
            addGrade("C");
        } else {
            addGrade("D");

        }
        return null;
    }
}
