import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        
        int a = 0,SUM=0;
        for(int p = 1; p <= n; ++p, a = 0) 
        {
            for(int space = 1; space <= n - p; ++space)
            {
                System.out.print("  ");
            }
            while(a != 2 * p - 1) {
                System.out.print("* ");
                SUM+=1;
                ++a;
            }
            System.out.println();
        }
         System.out.println(SUM); 
    }
}
