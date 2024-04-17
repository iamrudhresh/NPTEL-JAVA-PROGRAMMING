## :computer: Week `2` Programming Assignment 3

:white_check_mark: **Exercise 2.3)**<br>
***Complete the code segment to call `print()` method of class `Question` by creating a method named `studentMethod()`.***

```java
// This is the main class Question
public class Question23
{
    public static void main(String[] args)
    {
		// Object of the main class is created
		Question23 q = new Question23();
		// Print method on object of Question class is called
		q.studentMethod();
    }
    
	// 'print()' method is defined in class Question
	void print(Question23 object)
	{
		System.out.print("Well Done!");
	}
    /********************/
    // Define a method named 'studentMethod()' in class Question
    void studentMethod()
    {
        // Call the method named 'print()' in class Question
        print(this);
    }
    /********************/
}
```
▸ **Explanation:** The `this` keyword can be used for calling another constructor in the same class as the first part of your constructor.

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
