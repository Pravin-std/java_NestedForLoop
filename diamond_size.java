import java.util.Scanner;

public class diamond_size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        System.out.println("Diamond Pattern:");

        for(int i = 1; i <= n; i += 2) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for(int i = n-2; i >= 1; i -= 2) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}