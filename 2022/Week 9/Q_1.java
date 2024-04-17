        int i=0;
		int j=0;
		double ans=0;
		
		char pattern[] = input.toCharArray();
		
		for(int a=0; a<pattern.length; a++)
        {
			if(pattern[a]=='+')
            {
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,pattern.length));
				ans = (double)i+j;
			}else if(pattern[a]=='-')
            {
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,pattern.length));
				ans = (double)i-j;
			}else if(pattern[a]=='/')
            {
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,pattern.length));
				ans = (double)i/j;
			}else if(pattern[a]=='*')
            {
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,pattern.length));
				ans = (double)i*j;
			}
		}
		
		System.out.print(input+" = " + Math.round(ans));

	