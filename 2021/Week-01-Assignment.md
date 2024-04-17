## :hash: Week `1` Quiz

⭐ **1)** ***Which of the following cannot be used for a variable name in Java?***<br>
&emsp;&emsp;❑ **a.**  identifier<br>
&emsp;&emsp;❑ **b.**  case<br>
&emsp;&emsp;❑ **c.**  malloc<br>
&emsp;&emsp;❑ **d.**  calloc<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** `Case` is a _reserved keyword_ in Java. Hence, we can't use it as a variable name. `identifier`, `malloc` and `calloc` are all valid variable names.<br>

⭐ **2)** ***Which of the following is an incorrect array declaration?***<br>
&emsp;&emsp;❑ **a.**  int[] b = new int[10];<br>
&emsp;&emsp;❑ **b.**  int [] b;<br>
&emsp;&emsp;❑ **c.**  int [][] b = new int[10];<br>
&emsp;&emsp;❑ **d.**  int [][] b = {{7, 2, 4, 6} , {9, 8, 5}};<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:**`int [] arrayName = new int[size];` is most common way to declare an array.<br>
`int [] b;` is also correct as it declares the array without defining the size of the array.<br>
`int [][] b = new int[10];` is an incorrect way as `int[10]` is for declaration of a 1-D array but on the other side we have a 2-D array `int [][] b`. The correct way of declaration would be: `int [][] b = new int[10][];` or `int [][] b = new int[size][10];` where `size` is the number of rows in the 2-D array of our choice.<br>
`int [][] b = {{7, 2, 4, 6} , {9, 8, 5}};` is also correct. It declares a 2-D array and also initializes it. The compiler gets the size of the array by counting the number of elements in the array.<br>

⭐ **3)** ***When you compile a program written in the Java programming language, the compiler converts the human-readable source file into platform-independent code that a `Java Virtual Machine` can understand. What is this platform-independent code called?***<br>
&emsp;&emsp;❑ **a.**  Source code<br>
&emsp;&emsp;❑ **b.**  Bytecode<br>
&emsp;&emsp;❑ **c.**  Machinecode<br>
&emsp;&emsp;❑ **d.**  Opcode<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** When a Java program is executed, the compiler compiles that piece of code and a _Bytecode_ is generated for each method in that program in the form of a `.class` file. We can run this bytecode on any other platform as well. The bytecode generated after the compilation is run by the Java Virtual Machine.<br>

⭐ **4)** ***Which of the following is/are TRUE regarding the string array provided as a parameter to the main method in Java?***<br>
&emsp;&emsp;❑ **a.**  It can be used to get command line arguments from the user.<br>
&emsp;&emsp;❑ **b.**  It is mandatory to name the string array as 'args'.<br>
&emsp;&emsp;❑ **c.**  Only one command line argument input is allowed at a time.<br>
&emsp;&emsp;❑ **d.**  Both b and c.<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** Through the string array passed as parameter to the `main` method, the arguments passed from the console can be received in the java program and it can be used as an input.<br>
We can name the string array with any valid name, like: `input`, `var123`, ... etc.<br>
Any number of arguments can be passed from the command line like:<br>
To compile> `javac className.java`<br>
To run> `java A B C 12345 xyz`<br>
To print the content of the `args` array, we can traverse the array as:<br>
```java
for (int i=0; i<args.length; i++)
    System.out.println(args[i]);
```
If no argument is passed from the command line then an empty string `""` is passed by default.<br>

⭐ **5)** ***Consider the following program.***<br>
```java
public class Question
{
    public static void main(String args[])
    {
        for(int b=2; b<3; b+=2)
        {
            System.out.print(b+++b);
        }
    }
}
```
&emsp;&emsp;***What will be the output of the program if it is executed?***<br>
&emsp;&emsp;❑ **a.**  5<br>
&emsp;&emsp;❑ **b.**  2<br>
&emsp;&emsp;❑ **c.**  4<br>
&emsp;&emsp;❑ **d.**  1<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** At b = 2, `(b++ + b)` = 2 + 3. After b++, b becomes 3. And at the end of the first iteration of the for loop, with `b += 2`, b becomes 3 + 2 = 5. As 5 is not less than 3, the `for` loop terminates.<br>

⭐ **6)** ***Following is a piece of code where some parts of a statement is missing:***<br>
```java
public class Question3
{
    public static void main(String args[])
    {
        char nptel[] = {'J','A','V','A','N','P','T','E','L'};
        System.out.print(__________);
    }
}
```
&emsp;&emsp;***In the following, some options are given. You have to choose the correct option for the argument in `System.outprint()` function to print the second and the last characters in the array `nptel`.***<br>
&emsp;&emsp;❑ **a.**  nptel[nptel.length-1] + nptel[1]<br>
&emsp;&emsp;❑ **b.**  nptel[1] + nptel[nptel.length-1]<br>
&emsp;&emsp;❑ **c.**  "" + nptel[1] + nptel[nptel.length-1]<br>
&emsp;&emsp;❑ **d.**  "" + nptel[nptel.length-1] + nptel[1]<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** `nptel[nptel.length-1] + nptel[1]` will evaluate to 76 + 65 = 141 as the ASCII value of `L` is 76 and `A` is 65.<br>
`nptel[1] + nptel[nptel.length-1]` will evaluate to 65 + 76 = 141 as the ASCII value of `A` is 65 and `L` is 76.<br>
`"" + nptel[1] + nptel[nptel.length-1]` is correct as the `"" + ` part will convert the output to a string and it is equivalent to `"" + A + L` i.e `AL`.<br>
`"" + nptel[nptel.length-1] + nptel[1]` prints `LA` but it's not the desired result.<br>

⭐ **7)** ***What is the output of this program?***<br>
```java
public class Question
{
    public static void main(String args[])
    {
        int i = 5;
        System.out.print(--i * 5);
    }
}
```
&emsp;&emsp;❑ **a.**  20<br>
&emsp;&emsp;❑ **b.**  25<br>
&emsp;&emsp;❑ **c.**  32<br>
&emsp;&emsp;❑ **d.**  31<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** The pre-decrement `--` operator has higher precedence than the `*`. So, it first decrements the value of `i` and later 5 is multiplied. So, it results into (--5) * 5 = 4 * 5 = 20.<br>

⭐ **8)** ***Which of the following is used to find and fix bugs in the Java programs?***<br>
&emsp;&emsp;❑ **a.**  JVM<br>
&emsp;&emsp;❑ **b.**  JRE<br>
&emsp;&emsp;❑ **c.**  JDK<br>
&emsp;&emsp;❑ **d.**  JDB<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** Java Debugger (`JDB`) is used to find and fix bugs in the Java program.<br>

⭐ **9)** ***Which of the following is/are non-primitive data type(s) in Java?***<br>
&emsp;&emsp;❑ **a.**  int<br>
&emsp;&emsp;❑ **b.**  String<br>
&emsp;&emsp;❑ **c.**  Array<br>
&emsp;&emsp;❑ **d.**  double<br>
✔️ **Answer:&emsp;B, C**<br>
▸ **Explanation:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` are primitive data types in Java.<br>
`Strings`, `Arrays`, `Classes`, `Interface` are non-primitive data types in Java.<br>

⭐ **10)** ***Which of the following features are common in both Java and C?***<br>
&emsp;&emsp;❑ **a.**  The class declaration.<br>
&emsp;&emsp;❑ **b.**  The access modifiers.<br>
&emsp;&emsp;❑ **c.**  The encapsulation of data and methods.<br>
&emsp;&emsp;❑ **d.**  Multiple inheritance from class.<br>
✔️ **Answer:&emsp;A, B, C**<br>
▸ **Explanation:** Class declaration, access modifiers, encapsulation are present in both Java & C++. But multiple inheritance is only allowed in C++. In Java, multiple inheritance can only be achieved using Interfaces due to ambiguity.<br>

---
<p align="center">:heavy_plus_sign: <b>If you any <i>doubts/questions</i> related to this course or any <i>quiz/assignment</i>, <br>
please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!</b> :smiley:</p>
