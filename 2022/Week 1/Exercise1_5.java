int sum=0,max=0;
for(int i1=0;i1<arr.length;i1++)
{
  if(arr[i1]>max)
    max=arr[i1];
  sum+=arr[i1];
}
mark_avg=sum/arr.length;
System.out.println(max);
System.out.print(mark_avg);