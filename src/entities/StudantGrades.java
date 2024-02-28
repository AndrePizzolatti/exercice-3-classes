package entities;

public class StudantGrades {

    public String Name;

    public double Grade1;
    public double Grade2;
    public double Grade3;

    double FinalGrade() {
        return Grade1 + Grade2 + Grade3;
    }

    String Result() {

        if (FinalGrade() < 60.0) {
            return "FAILED";
        } else {
            return "PASS";
        }
    }

    String Missing () {

        double Points = 60.0 - FinalGrade();

        if (Points > 0.0) {
            return String.format("MISSING %.2f POINTS%n", Points);
        } else {
            return "";
        }
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f %n", FinalGrade())
                + String.format("%s %n", Result())
                + Missing();
    }
}
