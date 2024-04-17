## :computer: Week `2` Programming Assignment 1

:white_check_mark: **Exercise 2.1)**<br>
***Complete the code segment to call the method `print()` of class `Student` first and then call `print()` method of class `School`.***

```java
// This is the class named School
class School
{
    // This is a method in class School
    public void print()
    {
		System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student
{
	// This is a method in class Student
    public void print()
    {
		System.out.println("Hi! I am class STUDENT");
    }
}

public class Question21
{ 
    public static void main(String args[])
    {
        /********************/
        // Create an object of class Student
        Student student = new Student();
        // Call 'print()' method of class Student
        student.print();
        
        // Create an object of class School
        School school = new School();
        // Call 'print()' method of class School
        school.print();
        /********************/
	}
}
```
▸ **Explanation:** In Java, the `new` keyword is used to create new objects.<br>
To create an object of `Student`, specify the class name, followed by the object name, and use the keyword `new`.<br>
To call a method in Java, write the method's name followed by two parentheses `()` and a semicolon `;`.

---
:heavy_plus_sign: **If you any _doubts/questions_ related to this course or any _quiz/assignment_, <br>
&emsp;&emsp;&emsp;please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!** :smiley:
