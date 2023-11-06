package toolMaker;

import java.util.Scanner;
public class View {
    Scanner sc = new Scanner(System.in);
    public int achievementQuestion(){
        System.out.println("enter current achievements");
        int achievements = sc.nextInt();
        return achievements;
    }
    public int assignmentQuestion(){
        System.out.println("enter current assignments");
        int assignments = sc.nextInt();
        return assignments;

    }
    public boolean selfReportQuestion(){
        System.out.println("did you complete the mid-semester self report? (true or false because booleans suck in java)");
        boolean selfReport = sc.nextBoolean();
        return selfReport;
    }
    public String firstProjectQuestion(){
        System.out.println("what was your letter grade for the first project");
        sc.nextLine();
        String userInput = sc.nextLine();
        String firstProject = userInput.toUpperCase();
        return firstProject;
    }
    public String GUIProjectQuestion(){
       System.out.println("what was your letter grade for the first GUI project");
       String userInput = sc.nextLine();
       String GUIProject = userInput.toUpperCase();
       return GUIProject;
    }
    public String finalProjectQuestion(){
      System.out.println("what was your letter grade for the last iteration of the Final project");
      String userInput = sc.nextLine();
      String finalProject = userInput.toUpperCase();
      return finalProject;
    }
    public void closeScanner(){
        sc.close();
    }

}
