try
     {  
       URL Url=new URL("http://www.Nptel.com/java-tutorial");  
       System.out.println("Protocol: "+Url.getProtocol());  
       System.out.println("Host Name: "+Url.getHost());  
   
      }
       catch(Exception e)
       {
         System.out.println(e);
       }  
   }  
}