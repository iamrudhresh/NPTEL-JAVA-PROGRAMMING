## :computer: Week `1` Programming Assignment 3

:white_check_mark: **Exercise 1.3)**<br>
***Consider First `n` even numbers starting from zero(0). Complete the code segment to calculate sum of all the numbers divisible by `3` from 0 to n. Print the sum.***

```java
import java.util.Scanner;
public class Exercise1_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        /********************/
        for (int i=0; i<=2*n; i+=2)
        {
            if (i % 3 == 0)
                sum += i;
        }
        System.out.print(sum);
        /********************/
	}
}
```
▸ **Explanation:** We need to iterate over the range [0,2\*n] to cover all the first `n` _even_ numbers. Keep adding all those numbers which are divisible by 3 to the `sum`.

▶ **Alternative Approaches**:<br>
&emsp;**✱** As even numbers which are multiple of 3 are multiples of 6. So, we will only iterate over the multiples of 6 which are less than equal to `2*n` and keep adding the numbers to the sum.
```java
for (int i=0; i<=2*n; i+=6)
{
    sum += i;
}
```
&emsp;**✱** Using the formula.
```java
int countOfMultiplesOf6 = (2 * n) / 6;
sum = 6 * (countOfMultiplesOf6 * (countOfMultiplesOf6 + 1)) / 2;
```

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
