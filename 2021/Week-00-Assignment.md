## :hash: Week `0` Quiz

⭐ **1)** ***In C programming, what is the use of `%d` format specifier in `printf()` function?***<br>
&emsp;&emsp;❑ **a.**  Prints double type value<br>
&emsp;&emsp;❑ **b.**  Prints integer type value<br>
&emsp;&emsp;❑ **c.**  Prints character type value<br>
&emsp;&emsp;❑ **d.**  Prints string type value<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** In C programming, `%lf` is used for `double` data-type value; `%d` is used for `int` data-type value;<br>
`%c` is used for `char` data-type value; `%s` is used for `string` type value.

⭐ **2)** ***Consider the following code and answer the questions.***<br>
```C
int main()
{
    int a[8] = {3, 1, 0, 5, 2, 7, 6, 4};
}
```
&emsp;&emsp;***What is the value of `a[a[a[3]]]`? Select your correct answer from the following options.***<br>
&emsp;&emsp;❑ **a.**  Program is with a compile-time error<br>
&emsp;&emsp;❑ **b.**  Program is with a run-time error<br>
&emsp;&emsp;❑ **c.**  NULL<br>
&emsp;&emsp;❑ **d.**  4<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** Here, `a[3]` = 5. So, `a[a[a[3]]]` = a[a[5]]<br>
And `a[5]` = 7. So, `a[a[5]]` = a[7]. Hence, `a[a[a[3]]]` = a[7] = 4.<br>

⭐ **3)** ***Which of the following is not a valid `identifier` in C programming language?***<br>
&emsp;&emsp;❑ **a.**  21Guns<br>
&emsp;&emsp;❑ **b.**  No<br>
&emsp;&emsp;❑ **c.**  yes<br>
&emsp;&emsp;❑ **d.**  \*p<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** In C, an valid identifier can have letters (both uppercase and lowercase letters), digits and underscores only and the first letter of an identifier should be either a letter or an underscore. Hence, `21Guns` is an invalid identifier as it starts with a numeric digit.<br>
`No`, `no`, `NO`, `_No`, `yes`, `Yes`, `YES`, `_yes`, all are valid identifiers.<br>
The `*` symbol in `*p` indicates that `p` is a pointer.

⭐ **4)** ***Consider the following function definition:***<br>
```C
functionCheck(int a, int b)
{
    return (( a < b ) ? 0 : ( a - b ));
}
```
&emsp;&emsp;***Let `x`, `y` be any two non-negative integers. What does the function `functionCheck(x, functionCheck(x, y))` do? Select your correct answer from the following choices.***<br>
&emsp;&emsp;❑ **a.**  Maximum of x and y.<br>
&emsp;&emsp;❑ **b.**  Positive difference of x and y.<br>
&emsp;&emsp;❑ **c.**  Sum of x and y.<br>
&emsp;&emsp;❑ **d.**  Minimum of x and y.<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** The above function involves use of a ternary operator.<br>
The syntax of a ternary operator is: `result = binaryCondition ? valueReturnedIfTrue : valueReturnedIfFalse;`<br>
The `functionCheck` is equivalent to:
```C
functionCheck(int a, int b)
{
    if (a < b)
        return 0;
    else
        return a - b;
}
```
Now, there can be two different cases,<br>
i) **x < y** ➔ `functionCheck(x, y)` will return 0.<br>
&emsp;So, `functionCheck(x, functionCheck(x, y))` = functionCheck(x, 0). And `functionCheck(x, 0)` will return `x - 0` = x as `0 ≤ x` (non-negative integer).<br>
ii) **x >= y** ➔ `functionCheck(x, y)` will return x - y.<br>
&emsp;So, `functionCheck(x, functionCheck(x, y))` = functionCheck(x, x-y). And `functionCheck(x, x-y)` will return `x - (x-y)` = y as `x ≥ x-y`.<br>
Therefore, it will always return the _minimum_ of x and y.<br>

⭐ **5)** ***What will be the output of the following code?***<br>
```C
#include<stdio.h>
#define myfunc(i, j) i##j
int main()
{
    int v1 = 40;
    int v2 = 0;
    printf("%d", myfunc(1, 1) * myfunc(v, 1));
    return 0;
}
```
&emsp;&emsp;***Select your correct answer from the following choices.***<br>
&emsp;&emsp;❑ **a.**  40<br>
&emsp;&emsp;❑ **b.**  400<br>
&emsp;&emsp;❑ **c.**  440<br>
&emsp;&emsp;❑ **d.**  0<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** The preprocessor double hash (`##`) operator concatenates the variable values.<br>
So, `myfunc(1, 1)` will return `11` and `myfunc(v, 1)` will return `v1`.
Hence, `myfunc(1, 1) * myfunc(v, 1)` will evaluate to `11 * v1` = 11 * 40 = 440.

⭐ **6)** ***To store the string `"Javajuly"`, how many bytes that a C-compiler will take? Select your correct answer from the following options.***<br>
&emsp;&emsp;❑ **a.**  4 bytes.<br>
&emsp;&emsp;❑ **b.**  5 bytes.<br>
&emsp;&emsp;❑ **c.**  8 bytes.<br>
&emsp;&emsp;❑ **d.**  9 bytes.<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** The string (character array) has total 9 characters: `J`,`a`,`v`,`a`,`j`,`u`,`l`,`y`,`\0` ('\0' is string terminator). So, total 9 bytes are required to store the given string as `char` takes 1 byte to store a single character.<br>

⭐ **7)** ***Which of the following operator has the lowest priority?***<br>
&emsp;&emsp;❑ **a.**  ++<br>
&emsp;&emsp;❑ **b.**  +<br>
&emsp;&emsp;❑ **c.**  %<br>
&emsp;&emsp;❑ **d.**  ||<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** The increasing order of precedence of operators is: `||` < `+` < `%` < `++`<br>

⭐ **8)** ***In the declaration given below, what is `array`?***<br>
```C
    int array[20];
```
&emsp;&emsp;❑ **a.**  It is a keyword<br>
&emsp;&emsp;❑ **b.**  It is a literal<br>
&emsp;&emsp;❑ **c.**  It is a operator<br>
&emsp;&emsp;❑ **d.**  It is a pointer<br>
✔️ **Answer:&emsp;D**<br>
▸ **Explanation:** In the above, `array` is a pointer. We can access the different indices of the array through the pointer. Below is an illustration:<br>
```C
    int array[20];
    array[0] = 123;
    array[1] = 456;
    array[2] = 789;
    printf("%d\n", *array);     // = array[0] = 123
    printf("%d\n", *(array+1)); // = array[1] = 456
    printf("%d\n", *(array+2)); // = array[2] = 789
```

⭐ **9)** ***What will be the output of the following C code?***<br>
```C
#include <stdio.h>
int main()
{
    void foo();
    printf("1 ");
    foo();
}
void foo()
{ 
    printf("2 ");
}
```
&emsp;&emsp;❑ **a.**  1 2<br>
&emsp;&emsp;❑ **b.**  It will give compile-time error<br>
&emsp;&emsp;❑ **c.**  2 1 2<br>
&emsp;&emsp;❑ **d.**  Depends on the compiler<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** First, the `printf` statement will be exccuted in the `main` function which will print `1 ` and then `foo` method is called which prints `2 `.<br>

⭐ **10)** ***Which of the following is a valid C expression?***<br>
&emsp;&emsp;❑ **a.**  int my_num = 100,000;<br>
&emsp;&emsp;❑ **b.**  int my_num = 100000;<br>
&emsp;&emsp;❑ **c.**  int my num = 1000;<br>
&emsp;&emsp;❑ **d.**  int $my_num = 10000;<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** `int my_num = 100,000;` is invalid as it has a comma operator `,` in integer number.<br>
`int my num = 1000;` is invalid because space is not allowed in the identifier name in C.<br>
`int $my_num = 10000;` is invalid because the first letter of an identifier should be either a letter or an underscore.<br>

⭐ **11)** ***Consider the following declarations:***<br>
```C
float x=12.0, y=6.0;
int a=4, b=3;
float z;
```
&emsp;&emsp;***What is the value of z computed in each of the following assignment statements?***<br>
&emsp;&emsp;**i. z = x / y + a / b;**<br>
&emsp;&emsp;**ii. z = a / b * b / a * x;**<br>
&emsp;&emsp;**iii. z = (x / y) > 1 ? x : y;**<br>
&emsp;&emsp;**iv. z = (int) (x + b) / a % b;**<br>
&emsp;&emsp;***Select your correct answer from the following choices.***<br>
&emsp;&emsp;❑ **a.**  3.0, 0.0, 12.0, 0.0<br>
&emsp;&emsp;❑ **b.**  0.0, 0.0, 0.0, 0.0<br>
&emsp;&emsp;❑ **c.**  0.0, 0.0, 12.0, 0.0<br>
&emsp;&emsp;❑ **d.**  3.0, 0.0, 12.0, 1.0<br>
✔️ **Answer:&emsp;A**<br>
▸ **Explanation:** z => `(x / y) + (a / b)` = (12.0/6.0) + (4/3) = 2.0 + 1 = `3.0`<br>
z => `(((a / b) * b) / a) * x` = (((4 / 3) * 3) / 4) * 12.0 = ((1 * 3) / 4) * 12.0 = (3 / 4) * 12.0 = 0 * 12.0 = `0.0`<br>
z => `(x / y) > 1 ? x : y` = ((12.0/6.0) > 1) : x : y = (2.0 > 1) : x : y = (true) : x : y = x = `12.0`<br>
z => `(int) (x + b) / a % b` = ((int)(12.0 + 3) / 4) % 3 = ((int)(15.0) / 4) % 3 = (15/4) % 3 = 3 % 3 = `0` (result will be 0.0 as `z` is of _float_ data type)<br>
Please note: `*`, `/`, `%` has _left to right_ associativity.

⭐ **12)** ***Consider the following declarations:***<br>
```C
#include<stdio.h>
void main()
{
    int i, j = 10; y = 0;
    for(i = 0; i < j; i++)
    while(j)
        y += j--;
    printf("%d", y);
}
```
&emsp;&emsp;***What will be the output of the program? Select your option from the following.***<br>
&emsp;&emsp;❑ **a.**  100<br>
&emsp;&emsp;❑ **b.**  10×9×8× ... ×3×2×1<br>
&emsp;&emsp;❑ **c.**  10+9+8+ ... +3+2+1<br>
&emsp;&emsp;❑ **d.**  0<br>
✔️ **Answer:&emsp;C**<br>
▸ **Explanation:** First `j` will be added to `y` and then it will be decremented by 1 in each iteration of the `while` loop. Once j becomes 0, the while loop will break and next iteration of the for loop will start.  But since at i=1, j=0. Hence, `i < j` becomes false and the `for` loop will also terminate.<br>

⭐ **13)** ***A function `foo(int)` is defined as follows:***<br>
```C
int foo(int i)
{
    int x=1, j=1;
    while (i)
    {
        x *= j;
        j++;
        if (j<7) continue;
        else break;
    }
    return x;
}
```
&emsp;&emsp;***What will be the output of the program? Select your option from the following.***<br>
&emsp;&emsp;❑ **a.**  The program will be with compilation error<br>
&emsp;&emsp;❑ **b.**  6×5×4×3×2×1<br>
&emsp;&emsp;❑ **c.**  6+5+4+3+2+1<br>
&emsp;&emsp;❑ **d.**  The program will be with an infinite loop and hence not return any value<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** When i = 0, `foo(0)` will return `x` as the while loop will never be excecuted because `while(0)` is equivalent to while(_false_) in C.<br>
For any other value of x (i.e x != 0), the while loop will always excecute and it will break once j = 7. The result will be equal to `7!`.<br>

⭐ **14)** ***Which of the following statement(s) is/are NOT true.***<br>
&emsp;&emsp;❑ **a.**  Java is an object-oriented programming language<br>
&emsp;&emsp;❑ **b.**  C is an object-oriented programming language<br>
&emsp;&emsp;❑ **c.**  C++ is an object-oriented programming language<br>
&emsp;&emsp;❑ **d.**  C# is an object-oriented programming language<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** `Java`, `C++`, `C#`, `Python`, `R`, `PHP`, `Visual Basic.NET`, `JavaScript`, `Ruby`, `Perl`, `Object Pascal`, etc. are examples of _Object Oriented Programming_ languages.<br>
While `C` programming is a general-purpose, procedural, imperative computer programming language.<br>

⭐ **15)** ***Which of the following is NOT possible in C programming without using specialized
libraries?***<br>
&emsp;&emsp;❑ **a.**  Dynamic memory allocation<br>
&emsp;&emsp;❑ **b.**  Running multiple functions concurrently<br>
&emsp;&emsp;❑ **c.**  Recursive execution of a function<br>
&emsp;&emsp;❑ **d.**  Working with abstract data types<br>
✔️ **Answer:&emsp;B**<br>
▸ **Explanation:** In C, dynamic memory allocation can be done using `malloc()`, `calloc()`, `realloc()`, and `free()` functions.<br>
Working with abstract data types and recursive execution of a function is also allowed in C but concurrent excecution of multiple functions is not allowed.<br>

---
<p align="center">:heavy_plus_sign: <b>If you any <i>doubts/questions</i> related to this course or any <i>quiz/assignment</i>, <br>
please use the <a href="https://github.com/guru-shreyansh/NPTEL-Programming-in-Java/discussions"><i>Discussion Section</i></a>. 
I'll try to help at the earliest!!</b> :smiley:</p>
