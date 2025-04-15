import java.util.Scanner;
import java.util.ArrayList;

public class GradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter grades for students. Enter -1 to stop.");

        // Input grades
        while (true) {
            System.out.print("Enter a grade: ");
            int grade = scanner.nextInt();

            // Stop if user enters -1
            if (grade == -1) {
                break;
            }

            grades.add(grade);
        }

        // Check if there are grades entered
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }

        // Calculate average, highest, and lowest scores
        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        // Compute the average
        double average = (double) sum / grades.size();

        // Display the results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}
