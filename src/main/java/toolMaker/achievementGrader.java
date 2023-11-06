package toolMaker;

public class achievementGrader extends arrayBuilder {
    public String gradeAchievement(int achievements) {
        if (achievements >= 6) {
            addGrade("A");
        } else if (achievements == 4) {
            addGrade("B");
        } else if (achievements == 2) {
            addGrade("C");
        } else {
            addGrade("D");

        }
        return null;
    }
}
