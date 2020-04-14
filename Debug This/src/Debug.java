import java.util.Scanner;

public class Debug {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int testscore = input.nextInt();
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80 && testscore < 90) {
            grade = 'B';
        } else if (testscore >= 70 && testscore < 80) {
            grade = 'C';
        } else if (testscore >= 60 && testscore < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
