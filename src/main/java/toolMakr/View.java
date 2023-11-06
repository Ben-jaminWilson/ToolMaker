package toolMakr;

import java.util.Scanner;
public class View {
    Scanner sc = new Scanner(System.in);
    public void questions(){
        System.out.println("enter current achievements");
        int achievments = sc.nextInt();
        System.out.println("enter current assignments");
        int assignments = sc.nextInt();
        System.out.println("did you complete the mid-semester self report?");
        boolean selfReport = sc.nextBoolean();
        System.out.println("what was your letter grade for the first project");
        String firstProject = sc.nextLine();
        System.out.println("what was your letter grade for the first GUI project");
        String GUIProject = sc.nextLine();
        System.out.println("what was your letter grade for the last iteration of the Final project");
        String finalProject = sc.nextLine();
        sc.close();

    }
}
