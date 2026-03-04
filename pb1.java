package NestedForLoop;
import java.util.*;
public class pb1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int row = 1;row<=n1;row++)
        {
            for(int col = 1;col <=n2;col++)
            {
                System.out.print(col*row+ " ");
            }
            System.out.println();
        }
        
    }
    
}