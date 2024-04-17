try {  
     InputStreamReader y=new InputStreamReader(System.in);  
     BufferedReader b=new BufferedReader(y);  
     String number=b.readLine();  
     int n = Integer.parseInt(number);
     System.out.println(n*n);
    }
   catch (Exception e)
   {
       System.out.println("Please enter valid data");
    }