package toolMaker;

public class selfReportGrader extends arrayBuilder{
        public void gradeSelfReport(boolean selfReport) {
            if (selfReport == true) {
                addGrade("A");
            } else {
                addGrade("D");
            }
        }
    }
