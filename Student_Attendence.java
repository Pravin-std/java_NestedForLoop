import java.util.Scanner;
public class std_attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        sc.nextLine();
    
    
        System.out.println();
        System.out.println("Attendence Matrix:");
        System.out.println("Student Day1 Day2 Day3 Day4 Day5 Attendence%");
   
        for(int i = 0;i<row;i++)
        {
          String name= sc.next();
              System.out.print(name + " ");
              int percentage = 0;
            for(int j = 0;j<col;j++)
            {
               String per = sc.next();
                 System.out.print(per + " ");
                if(per.equals("P"))
                {
                    percentage ++;
                }
            }
            Double percentange = ((double)percentage/col)*100.0;
            System.out.printf("%.2f",(double)percentange , "%" );
            System.out.println();
        }
        
    
       
    }
}
