int num=n;
while(num>0)
{
  int r=num%10;
  result+=r*r*r;
  num/=10;
}

if (result==n)
  System.out.print(1);
else
  System.out.print(0);