## :computer: Week `2` Programming Assignment 4

:white_check_mark: **Exercise 2.4)**<br>
***Complete the code segment to call default constructor first and then any other constructor in the class.***

```java
// This is the main class Question
public class Question214
{
	public static void main(String[] args)
	{
		Answer a = new Answer(10,"MCQ");
	}
}
/********************/
class Answer
{
	Answer()
    {
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type)
    {
      	this();
		System.out.print("You got "+marks+" for an "+ type);
	}
}
/********************/
```
▸ **Explanation:** We can call the default constructor using the `this` keyword as `this();`.

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
