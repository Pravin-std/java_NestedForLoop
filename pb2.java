
import java.util.*;
public class pb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Seating Arrangement: ");
        for(int row = 1;row<=n1;row++)
        {
            System.out.print("Row "+ row  +":");
            for(int col = 1;col<=n2;col++)
            {
                System.out.print("Seat-"+col+" ");
            }
            System.out.println();
        }
        sc.close();;
    }
}
