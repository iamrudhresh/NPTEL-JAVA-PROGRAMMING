char act[][]= new char[5][5];
		
		
		for(int L=0;L<5; L++)
        {
			String input = sc.nextLine();
			char pat[] = input.toCharArray();
			if(pat.length==5){
				for(int i=0;i<5;i++)
                {
					if(pat[i]=='0' || pat[i]=='1')
                    {
						act[L][i]=pat[i];
						if(L==4 && i==4) 
							flipflop(act);
					}
					else
                    {
						System.out.print("Only 0 and 1 supported.");
						break;
					}
				}
			}else
            {
				System.out.print("Invalid length");
				break;
			}

		}
	}
	static void flipflop(char[][] flip)
    {
		
		for(int i=0; i<5;i++)
        {
			for(int j=0; j<5;j++)
            {		
				if(flip[i][j]=='1')
					flip[i][j]='0';
				else
					flip[i][j]='1';
			}
		}
	
		
		for(int i=0; i<5;i++)
        {
			for(int j=0; j<5;j++)
            {		
				System.out.print(flip[i][j]);
			}
			System.out.println();
		}