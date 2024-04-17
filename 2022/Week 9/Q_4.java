       char act[][]= new char[5][5];
		
		
		char ref[][]= new char[5][5];
		
		
		for(int L=0;L<5; L++)
        {
			String input = sc.nextLine();
			char seq[] = input.toCharArray();
			if(seq.length==5)
            {
				for(int i=0;i<5;i++)
                {
					act[L][i]=seq[i];
				}
			}
		}
		
		
		for(int i=0; i<5;i++)
        {
			for(int j=0; j<5;j++)
            {		
				ref[i][j]=act[i][4-j];
			}
		}
		
		
		for(int i=0; i<5;i++)
        {
			for(int j=0; j<5;j++)
            {		
				System.out.print(ref[i][j]);
			}
			System.out.println();
		}
