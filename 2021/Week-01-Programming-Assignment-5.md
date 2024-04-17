## :computer: Week `1` Programming Assignment 5

:white_check_mark: **Exercise 1.5)**<br>
***Complete the code segment to help Ragav, find the highest mark and average mark secured by him in `s` number of subjects.***

```java
import java.util.Scanner;
public class Exercise1_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s; // size of array
        s = input.nextInt();
        int[] arr = new int[s];   
        for (i=0; i<arr.length; i++)
        {
            arr[i]=input.nextInt();
        }
        /********************/
        result = arr[0];
        double markSum = 0;
        
        for (int element : arr)
        {
            result = Math.max(element , result);
            markSum += element;
        }
        mark_avg = markSum / s;
        System.out.println(result);
        System.out.print(mark_avg);
        /********************/
	}
}
```
▸ **Explanation:** Find the sum of all the marks in the array and then divide the sum with the size of arr to get the average.

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
