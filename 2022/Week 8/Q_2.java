import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int l = inr.nextInt();
    
        int a,b;
        int space=l-1;
    
     for(a=0;a< l;a++)
       {
	   
	    for(b=0;b< space;b++)
	    {
		    System.out.print(" ");
	    }
	    for(b=0;b<=a;b++)
	    {
		    System.out.print("* ");
	    }
		
	    System.out.print("\n");
	    space--;	
         }
   	}
}
