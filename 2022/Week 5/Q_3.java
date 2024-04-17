       int R;  
       a = input.nextInt();
       b = input.nextInt();
  
      
         try {
              R= a/b;
              System.out.print(R);
     	     }
          
          catch (ArithmeticException e) 
          {
             System.out.print("Exception caught: Division by zero.");
          }