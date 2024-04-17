## :computer: Week `1` Programming Assignment 1

:white_check_mark: **Exercise 1.1)**<br>
***Complete the code segment to find the perimeter and area of a circle given a value of radius.
You should use `Math.PI` constant in your program. If radius is zero or less than zero then print `"please enter non zero positive number"`.***

```java
import java.util.Scanner;
public class Exercise1_1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;
        /********************/
	    if (radius <= 0)
	        System.out.println("please enter non zero positive number");
	    
	    // Perimeter of the Circle = 2.pi.R
	    perimeter = 2 * Math.PI * radius;
	    // Area of the Circle = pi.R.R
	    area = Math.PI * radius * radius;
	    
	    // Value of `Math.PI` = 3.141592653589793
	    System.out.println(perimeter);
	    System.out.print(area);
        /********************/
	}
}
```
▸ **Explanation:** This is a simple formula-based question. Use the formulas of perimeter & area of a circle to find the results.
Use of `Math.PI` is suggested as if we use pi = 3.14, we won't get the accurate results.

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
