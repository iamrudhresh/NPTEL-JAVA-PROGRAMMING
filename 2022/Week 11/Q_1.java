			PreparedStatement preparedStmt = conn.prepareStatement("insert into Players values(?,?,?,?)");
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Ram");
			preparedStmt.setString (3, "Gopal");
			preparedStmt.setInt(4, 26);

			int x= preparedStmt.executeUpdate();
	        
			PreparedStatement preparedStmt2 = conn.prepareStatement("insert into Players values(?,?,?,?)");

			preparedStmt2.setInt (1, 2);
			preparedStmt2.setString (2, "John");
			preparedStmt2.setString (3, "Mayer");
			preparedStmt2.setInt(4, 22);

           int y= preparedStmt2.executeUpdate();