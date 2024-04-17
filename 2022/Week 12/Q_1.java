        char seq[] = input.toCharArray();
		int f=0;
		
		for(int a=0; a<seq.length; a++)
        {
			seq[a]=gui_map(seq[a]);
		   if (seq[a]=='R' || seq[a]=='S' || seq[a]=='F' ||seq[a]=='C')
				break;
		}
		
		double op1=0.0;
		String o1="";
		double op2=0.0;
		String o2="";
		double output=0.0;
	
		outerloop:
		for(int i=0; i<seq.length; i++)
        {
			if(seq[i]=='C')
            {				
				op1=0.0;
				op2=0.0;
				output=0.0;
				f=0;
				break outerloop;
		    }
          else if(seq[i]=='R')
              
            {			
				for(int j=0; j<i; j++)
                {
					o1+=Character.toString(seq[j]);
				}
				op1=Double.parseDouble(o1);
				output=Math.sqrt(op1);
				f=1;
				break outerloop;
			}
			else if(seq[i]=='S')
            {			
				for(int j=0; j<i; j++)
                {
					o1+=Character.toString(seq[j]);
				}
				op1=Double.parseDouble(o1);
				output=Math.pow(op1,2);
				f=1;
				break outerloop;
			}
          else if(seq[i]=='F')
            {			
				for(int j=0; j<i; j++)
                {
					o1+=Character.toString(seq[j]);
				}
				op1=Double.parseDouble(o1);
				output=Math.pow(op1,-1);
				f=1;
				break outerloop;
			}else
          {
				int r=0;
	                     if(seq[i]=='+'||seq[i]=='/'||seq[i]=='*'||seq[i]=='='){
					for(int j=0; j<i; j++){
						o1+=Character.toString(seq[j]);
    		}
			op1=Double.parseDouble(o1);
			for(int k=i+1; k<seq.length; k++)
            {
			 if(seq[k]=='=')
             {

                  f=1;
						   
                  op2=Double.parseDouble(o2);
			 if(seq[i]=='+')
             {
								     
                         output=op1+op2;
			 	}else if(seq[i]=='-')
             {
			 output=op1-op2;
				}else if(seq[i]=='/')
             {
								              
                       output=op1/op2;
				}else if(seq[i]=='*')
             {
								            
                      output=op1*op2;
				 }
				break outerloop;
				}else
             {
              o2+=Character.toString(seq[k]);
						}
					}
				}
			}
		}
		

		if(f==1)
			System.out.print(output);
