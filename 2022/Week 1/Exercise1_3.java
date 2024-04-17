//Use for or while loop do the operation.
int a=-2;
for (int i=0; i<n; i++) {
  a = a+2;
  if (a%3 == 0) {
    sum += a;
  }
}
System.out.println(sum);