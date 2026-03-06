import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();

        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int date = 1;

        int totalCells = (startDay - 1) + daysInMonth;

        for (int cell = 1; cell <= totalCells; cell++) {

            if (cell < startDay) {
                System.out.print("    ");
            } else {
                System.out.print(date + " ");
                date++;
            }

            if (cell % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}