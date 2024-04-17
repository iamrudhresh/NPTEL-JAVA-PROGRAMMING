## :computer: Week `1` Programming Assignment 4

:white_check_mark: **Exercise 1.4)**<br>
***Complete the code segment to check whether the number is an `Armstrong number` or not.***<br>
**Armstrong Number:**<br>
*A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 1³+5³+3³, 370, 371, 407, etc.*

```java
import java.util.Scanner;
public class Exercise1_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        /********************/
        int sum = 0;
        int copy = n; // copy of `n` is created so that we can equate 
                        // sum with the original value of `n` at the end
        while (0 < copy)
        {
            int digit = copy % 10;      // digit at unit place of curent copy
            sum += digit * digit * digit;
            copy = copy / 10;
        }
        if (n == sum)
            result = 1;
        System.out.print(result);
        /********************/
	}
}
```
▸ **Explanation:** For n = 153, copy = 153.<br>
----------_First iteration:_----------<br>
digit = 153 % 10 = 3<br>
sum = sum + (3 * 3 * 3) = 0 + (27) = 27<br>
copy = copy / 10 = 153 / 10 = 15<br>
----------_Second iteration:_----------<br>
digit = 15 % 10 = 5<br>
sum = sum + (5 * 5 * 5) = 27 + (125) = 152<br>
copy = copy / 10 = 15 / 10 = 1<br>
----------_Third iteration:_----------<br>
digit = 1 % 10 = 1<br>
sum = sum + (1 * 1 * 1) = 152 + (1) = 153<br>
copy = copy / 10 = 1 / 10 = 0<br>
`while` loop terminates.<br>

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
