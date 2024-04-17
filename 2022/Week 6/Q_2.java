public static void main(String[] args) 
   {  
        Question62 ex = new Question62();  
        Thread t= new Thread(ex);  
        t.setName("Main Thread");
        t.start();  
        System.out.println("Welcome to Java Week 6 New Question.");  
        t.setName("Main Thread");
    }