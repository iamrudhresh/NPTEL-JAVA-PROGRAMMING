## :hash: Week `2` Quiz

⭐ **1)** ***What is the output of the following program?***<br>
```java
public class Main
{
    public static void main(String args[])
    {
        char a = '8';
        int b = 010;
        System.out.println(a+b);
    }
}
```
&emsp;&emsp;❑ **a.**  88<br>
&emsp;&emsp;❑ **b.**  8010<br>
&emsp;&emsp;❑ **c.**  64<br>
&emsp;&emsp;❑ **d.**  810<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** Whenever we perform `+` operation on `char` data-types, the resultant value is based on the addition of the respective _ASCII_ values.<br>
The ASCII value of '8' is 56. In Java, any number prefixed with a `0` is considered _octal_. So, `010` is an octal number whose decimal value is 0\*8² + 1\*8¹ + 0\*8⁰ = 0 + 8 + 0 = 8.<br>
Hence, `'8' + 010` evaluates to 56 + 8 = 64.<br>

⭐ **2)** ***Which of the following is generate `API` documentation in HTML format from Java source code?***<br>
&emsp;&emsp;❑ **a.**  javac<br>
&emsp;&emsp;❑ **b.**  javadoc<br>
&emsp;&emsp;❑ **c.**  javap<br>
&emsp;&emsp;❑ **d.**  java<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** The `Javadoc` is a tool that is used to generate API documentation in HTML format from the Java source files.<br>
The Javadoc command line syntax is:`Javadoc [options] [packagenames] [sourcefiles] [@files]`.<br>
The `javap` tool is used to get the information of any class or interface. It is also known as a disassembler. The `javaw` command is identical to java that displays a window with error information, and the `javah` command is used to generate native method functions.<br>

⭐ **3)** ***Following is a program given for this question.***<br>
```java
public class Main
{
    public static void main(String[] args)
    {
        char[] copyFrom = {'j', 'a', 'n', 'n', 'p', 't', 'e', 'l', 'j', 'a', 'v', 'a',};
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom, 3, copyTo, 0, 9);
    }
}
```
&emsp;&emsp;***What will be the output of the above program?***<br>
&emsp;&emsp;❑ **a.**  javanptel<br>
&emsp;&emsp;❑ **b.**  npteljava<br>
&emsp;&emsp;❑ **c.**  janjavanptel<br>
&emsp;&emsp;❑ **d.**  jannpteljava<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** The signature of `System`'s class arraycopy method is: `arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`. Where,<br>
	_src_ - source array you want to copy<br>
	_srcPos_ - starting position (index) in the source array<br>
	_dest_ - destination array where elements will be copied from the source<br>
	_destPos_ - starting position (index) in the destination array<br>
	_length_ - number of elements to copy<br>
    The `copyTo` array after copying will be: `[n, p, t, e, l, j, a, v, a]`.<br>

⭐ **4)** ***What will happen during the execution of the following code for the command line input?***<br>
```java
public class Question
{
    public static void main(String[] args)
    {
        for (String s: args)
            System.out.println(s+args[0]);
    }
}
```
***Input:***<br>
&emsp;&emsp;**A: "jan java nptel"**<br>
&emsp;&emsp;**B: 1 2 3**<br>
&emsp;&emsp;❑ **a.**  A: jannptel<br>
&emsp;&emsp;&emsp;&emsp;&emsp;javanptel<br>
&emsp;&emsp;&emsp;&emsp;&emsp;nptelnptel<br>
&emsp;&emsp;❑ **b.**  A: jan java nptel jan java nptel<br>
&emsp;&emsp;❑ **c.**  B: 11<br>
&emsp;&emsp;&emsp;&emsp;&emsp;21<br>
&emsp;&emsp;&emsp;&emsp;&emsp;31<br>
&emsp;&emsp;❑ **d.**  B: 1 2 3 1<br>
&emsp;&emsp;***Consider the following input on command line and select the options with the correct output(s).***<br>
✔️ **Answer:&emsp;B, C**<br>
▸ **Explanation:** For A, `args = {"jan java nptel"};` For B, `args = {"1", "2", "3"};`<br>
The `forEach` loop iterates over all the strings of the array one by one and args[0] is "jan java nptel" and "1" respectively.<br>
So, the above program will print all the strings of args array concatenated with args[0] in new lines.<br>
Correct output of command line argument `jan java nptel` will be:<br>
```java
jan java nptel jan java nptel
```
Correct output of command line argument `1 2 3` will be:<br>
```java
11
21
31
```

⭐ **5)** ***Which of the following is/are TRUE about `print()` and `println()` methods?***<br>
&emsp;&emsp;❑ **a.**  print() prints in a single line only and multiple lines cannot be printed in any way.<br>
&emsp;&emsp;❑ **b.**  print() prints and then appends a line break.<br>
&emsp;&emsp;❑ **c.**  println() prints in a single line only and multiple lines cannot be printed.<br>
&emsp;&emsp;❑ **d.**  println() prints and then appends a line break.<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** Method `print()` can be used to print in a single line only but multiple lines can be printed using escape sequence `\n`. Similarly, `println()` prints in a single line only and multiple lines can be printed using escape sequence `\n`. Method `print()` prints but does not appends a line break. `println()` prints and then appends a line break.<br>

⭐ **6)** ***What was the initial name of `Java` when it was first developed for embedded systems?***<br>
&emsp;&emsp;❑ **a.**  Greentalk<br>
&emsp;&emsp;❑ **b.**  Oak<br>
&emsp;&emsp;❑ **c.**  Java<br>
&emsp;&emsp;❑ **d.**  Javac<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** Initially Java was designed for small, embedded systems in electronic appliances like set-top boxes. Firstly, it was called `Greentalk` by James Gosling, and the file extension was `.gt`. After that, it was called `Oak` and was developed as a part of the Green project.<br>

⭐ **7)** ***Which of the following is a valid declaration of an object of class, say `Foo`?***<br>
&emsp;&emsp;❑ **a.**  Foo obj = new Foo;<br>
&emsp;&emsp;❑ **b.**  obj = new Foo();<br>
&emsp;&emsp;❑ **c.**  Foo obj = new Foo();<br>
&emsp;&emsp;❑ **d.**  new Foo obj;<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** There are three steps when creating an object from a class −<br>
- [x] **Declaration** − A variable declaration with a variable name with an object type.<br>
- [x] **Instantiation** − The 'new' keyword is used to create the object.<br>
- [x] **Initialization** − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.<br>

⭐ **8)** ***Following is a program given for this question.***<br>
```java
public class Question
{
	public static void main(String[] args)
	{
		boolean m=Integer.valueOf(0).equals(Long.valueOf(1));
		System.out.println(m);
	}
}
```
&emsp;&emsp;***What will be the output of the above program?***<br>
&emsp;&emsp;❑ **a.**  0<br>
&emsp;&emsp;❑ **b.**  1<br>
&emsp;&emsp;❑ **c.**  false<br>
&emsp;&emsp;❑ **d.**  true<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** The above checks if 0 == 1? Since, 0 != 1, it returns `false`.<br>

⭐ **9)** ***Which of the following can be used to take input from user during the execution of a
program?***<br>
&emsp;&emsp;❑ **a.**  Using the string array provided as a parameter to the main method.<br>
&emsp;&emsp;❑ **b.**  getText() method can be used to get user input from the command line.<br>
&emsp;&emsp;❑ **c.**  Scanner class can be used by passing the predefined object System.in<br>
&emsp;&emsp;❑ **d.**  Once the execution starts, there is no way to provide user input.<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** We can take the input from the user during the execution of a program using the `Scanner` or the `BufferedReader` class.<br>
Through the command line we can only provide the user input _before_ the excecution of the program.<br>

⭐ **10)** ***What is the output of the following program?***<br>
```java
public class Question
{
	public static void main(String[] args)
	{
		int i = 10;
		int n = i++%2;
		int m = ++i%7;
		System.out.println(i+n+m);
	}
}
```
&emsp;&emsp;❑ **a.**  14<br>
&emsp;&emsp;❑ **b.**  12<br>
&emsp;&emsp;❑ **c.**  15<br>
&emsp;&emsp;❑ **d.**  17<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** `i++ % 2` evaluates to 10 % 2 = 0 and then increments the value of `i` by 1 due to the post-increment operator.<br>
Now, i=11, `++i % 7` evaluates to 12 % 7 = 5 as at first, the value of `i` get incremented by 1 due to the pre-increment operator and then the modulo operation is performed.<br>

---
<p align="center">:heavy_plus_sign: <b>If you any <i>doubts/questions</i> related to this course or any <i>quiz/assignment</i>, <br>
please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!</b> :smiley:</p>
