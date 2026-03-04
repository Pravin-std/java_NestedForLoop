
import java.util.*;
public class pb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        sc.nextLine();
        String choose = sc.nextLine();

        if(choose.equals("Star"))
        {
            for(int i = 0;i<height;i++)
            {
                for(int j = 0;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(choose.equals("Number"))
        {
            for(int i = 0;i<height;i++)
            {
                for(int j = 0;j<=i;j++)
                {
                    System.out.print(j+1);
                }
                System.out.println();
            }
        }
    }
}
