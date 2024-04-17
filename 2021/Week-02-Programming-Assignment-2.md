## :computer: Week `2` Programming Assignment 2

:white_check_mark: **Exercise 2.2)**<br>
***Complete the code segment to call the method `print()` of class given class `Printer` to print the following.***
```
--------------------------------
Hi! I am class STUDENT
Hi! I class SCHOOL.
--------------------------------
```

```java
// This is the class named Printer
class Printer
{
    // This are the methods in class Printer
    public void print()
    {
		System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s)
    { 
		System.out.println(s);
    }
}

public class Question2
{
    public static void main(String[] args)
    {
        /********************/
        // Create an object of class Printer
        Printer printerObj = new Printer();
        
        // Call 'print()' methods for desired output
        printerObj.print("Hi! I am class STUDENT");
        printerObj.print();
        /********************/
	}
}
```
▸ **Explanation:** There are 3 types of constructors in Java: `Default`, `No-Argument` and `Parameterized`.<br>
The first `print()` method in class `Printer` is a `No-Argument` constructor but the second `print()` method in class `Printer` is a `Parameterized` constructor which takes a string as input and prints that string.

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
