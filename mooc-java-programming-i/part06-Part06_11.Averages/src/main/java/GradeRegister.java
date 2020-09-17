
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPts;
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPts = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPts.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        double total = 0.0;
        if (this.grades.isEmpty()) {
            return -1;
        } 
        for (Integer i : this.grades) {
            total += i;
        } 
        return (double) total / this.grades.size();
    }
    
    public double averageOfPoints() {
        double totalPts = 0.0;
        if (this.examPts.isEmpty()) {
            return -1;
        }
        for (Integer i : this.examPts) {
            totalPts += i;
        }
        return totalPts / this.examPts.size();
    }
    
    
}
