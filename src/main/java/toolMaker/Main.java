package toolMaker;

public class Main {
    public static void main(String[] args){
        View view = new View();


        int achievements = view.achievementQuestion();
        int assignments = view.assignmentQuestion();
        boolean selfReport = view.selfReportQuestion();
        String firstProject = view.firstProjectQuestion();
        String GUIProject = view.GUIProjectQuestion();
        String finalProject = view.finalProjectQuestion();


        achievementGrader achievementGrader = new achievementGrader();
        assignmentGrader assignmentGrader = new assignmentGrader();
        projectsGrader projectsGrader = new projectsGrader();
        selfReportGrader selfReportGrader = new selfReportGrader();

        achievementGrader.gradeAchievement(achievements);
        assignmentGrader.gradeAssignment(assignments);
        projectsGrader.gradeFirst(firstProject);
        projectsGrader.gradeGUI(GUIProject);
        projectsGrader.gradeFinal(finalProject);
        selfReportGrader.gradeSelfReport(selfReport);

        arrayBuilder finalGrader = new arrayBuilder();

        finalGrader.getGrades().addAll(achievementGrader.getGrades());
        finalGrader.getGrades().addAll(assignmentGrader.getGrades());
        finalGrader.getGrades().addAll(projectsGrader.getGrades());
        finalGrader.getGrades().addAll(selfReportGrader.getGrades());
        finalGrader.calculateFinalGrade();


        System.out.println("Your final grade is: " + finalGrader.yourFinalGrade);

    }
}
