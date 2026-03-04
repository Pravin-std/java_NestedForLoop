import java.util.*;

public class pb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int std = sc.nextInt();
        int sub = sc.nextInt();

        String[] names = new String[std];
        int[][] marks = new int[std][sub];

        double avg;

        for (int i = 0; i < std; i++) {
            sc.nextLine();
            names[i] = sc.nextLine();
            int sum = 0;

            for (int j = 0; j < sub; j++) {
                marks[i][j] = sc.nextInt();
                sum += marks[i][j];
            }

            avg = (double) sum / sub;
        }

        System.out.println("Grade Sheet:");
        System.out.print("Student ");

        for(int i = 1; i <= sub; i++) {
            System.out.print("Sub" + i + " ");
        }

        System.out.println("Average");

        for(int i = 0; i < std; i++) {
            int sum = 0;
            System.out.print(names[i] + " ");

        for(int j = 0; j < sub; j++) {
                System.out.print(marks[i][j] + " ");
                sum += marks[i][j];
            }

            double average = (double) sum / sub;
            System.out.printf("%.2f", average);
            System.out.println();
        }
    }
}