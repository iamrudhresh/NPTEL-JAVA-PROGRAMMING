 ResultSet ans=stmt.executeQuery("SELECT * from players");

int c=0;
int sum=0;
while(ans.next())
{
  c++;
  sum+=Integer.parseInt(ans.getString(4));
}

System.out.println("Average age of players is "+sum/c);