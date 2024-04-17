try{
       for(int a=0;a<length;a++)
         {  
          int userInput=sc.nextInt();
          name[a] = userInput;
          sum=sum+name[a]; 
          } 
        System.out.print(sum);
     }
       catch(InputMismatchException e) 
        {
        System.out.print("You entered bad data.");
        }