## :computer: Week `1` Programming Assignment 2

:white_check_mark: **Exercise 1.2)**<br>
***Complete the code segment to find the largest among three numbers `x`, `y`, and `z`. You should use `if-then-else` construct in Java.***

```java
import java.util.Scanner;
public class Exercise1_2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        /********************/
        if (y <= x)
        {
            if (z <= x)     // (y , z) <= x
                result = x;
            else            // y <= x < z
                result = z;
        }
        else                // x < y
        {
            if (z <= y)     // (x , z) <= y
                result = y;
            else            // x < y < z
                result = z;
        }
        System.out.print(result);
        /********************/
	}
}
```
▸ **Explanation:** Start with comparing two values then compare the larger of the two with the third.

▶ **Alternative Approach**:<br>
&emsp;**✱** Using Java `max` function of `Math` class.
```java
result = Math.max(x , Math.max(y , z));
```
&emsp;**✱** Using nested _ternary operator_.<br>
The syntax of ternary operator is: `result = binaryCondition ? valueReturnedIfTrue : valueReturnedIfFalse;`
```java
result = (x > y) ? (x > z ? x : y) : (y > z ? y : z);
```

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
