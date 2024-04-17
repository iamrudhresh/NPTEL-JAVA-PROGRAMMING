	char pattern [] = input.toCharArray();
		int f=0;
		
		
		for(int i=0; i<pattern .length; i++){
			pattern [i]=gui_map(pattern [i]);
		}
		
		
		double operand1=0.0;
		String o1="";
		double operand2=0.0;
		String o2="";
		double ans=0.0;
		
		
		outerloop:
		for(int i=0; i<pattern .length; i++){
			int r=0;
			if(pattern [i]=='+'||pattern [i]=='-'||pattern [i]=='/'||pattern [i]=='X'||pattern [i]=='='){
				for(int j=0; j<i; j++){
					o1+=Character.toString(pattern [j]);
				}
				operand1=Double.parseDouble(o1);
				for(int k=i+1; k<pattern .length; k++){
					if(pattern [k]=='='){
						f=1;
						operand2=Double.parseDouble(o2);
						if(pattern [i]=='+'){
							ans=operand1+operand2;
						}else if(pattern [i]=='-'){
							ans=operand1-operand2;
						}else if(pattern [i]=='/'){
							ans=operand1/operand2;
						}else if(pattern [i]=='X'){
							ans=operand1*operand2;
						}
						break outerloop;
					}else{
						o2+=Character.toString(pattern [k]);
					}
				}
			}
		}
		
		
		if(f==1)
			System.out.print(ans);