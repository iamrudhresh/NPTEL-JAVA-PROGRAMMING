import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int l = inr.nextInt();
       int UL=0;
	   int ll=0; 
	  	
	
	   if (l%2!=0)
       {
	   UL =(l/2)+1;			
	   ll=l-UL;

	for(int p=1;p<=UL; p++)
    {	
	
	for(int s=1;s<=(UL-p); s++)
    {
	    System.out.print(" ");
	}
	
	for(int j=1;j<=p; j++){
	     System.out.print("* ");
	}
	System.out.println();
	}
			
	
	int c=ll;
	for(int p=1;p<=ll; p++)
    {
	
	for(int s=c;s<ll; s++)
    {
	   System.out.print(" ");
	}
	
	for(int q=1;q-1<=ll-p; q++)
    {
	   System.out.print(" *");
	 }
	 c--;
	System.out.println();
        }
	}
        else
    {
	   System.out.print("Invalid line number");
	}

    }
}
