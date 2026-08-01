# ArrayList

array list is a class in the java collections framework that uses array internally and automatically resizes when needed

```java
 import java.util.ArrayList;
 ArrayList<Integer> list = new ArrayList<>();
 list.add(12);
```

You don't specify the size.

As you keep adding elements:

```
list.add(40);
list.add(50);
list.add(60);
```

the ArrayList automatically grows.

You can access elements just like an array:

```
System.out.println(list.get(0)); // 10
System.out.println(list.get(2)); // 30
```

3. What happens internally?

Suppose Java creates an internal array of size 10.

```
[10][20][30][ ][ ][ ][ ][ ][ ][ ]
```

When it becomes full:

```
[1][2][3][4][5][6][7][8][9][10]
```

and you execute:

```
list.add(11);
```

Java does something similar to:

```
// old array
int[] old = {1,2,3,4,5,6,7,8,9,10};
```

```
// create a bigger array (roughly 1.5× larger in modern Java implementations)
int[] newArray = new int[15];
```

// copy elements
for (int i = 0; i < old.length; i++) {
newArray[i] = old[i];
}

// point to the new array
old = newArray;

// insert the new element
old[10] = 11;

All of this happens automatically inside ArrayList.

4. Why is it called a Dynamic Array?

Because although it uses an array internally, it changes the underlying array whenever more space is needed.

Initially

Capacity = 4

[10][20][30][40]

↓

Add another element

↓

Create larger array

Capacity = 6 (illustrative)

[10][20][30][40][50][ ]

The user doesn't have to manage resizing.

5. Array vs ArrayList
   Array ArrayList
   Fixed size Dynamic size
   Faster access Nearly as fast for access
   Can store primitives directly (int) Stores objects (Integer, String, etc.)
   No built-in methods Many useful methods like add(), remove(), contains(), size()
   Interview question

Q: Is ArrayList a data structure?

A: Yes. ArrayList is an implementation of the List interface in the Java Collections Framework. It is a dynamic array—internally backed by a regular array that grows automatically when it runs out of space.

So your understanding is correct: an ArrayList is dynamic because it manages resizing for you, whereas a normal array has a fixed size once it is created

---

---

## Bug 1

```java
tried solving follow up question but it is stucking in infinite loop
//print your name N time using recursion

public class Ntimes {
    public static void main(String[] args) {

        printNtimes(4);
        printNtimes1(4, 1);
    }

    public static void printNtimes(int n) {
        // base case
        if (n <= 0) {
            return;
        }
        System.out.println("gfg");

        printNtimes(n--);
    }

    /*
     * Can you
     * print the
     * name N
     * times using
     * recursion without
     * decreasing n, but
     * instead by
     * increasing another
     * variable from 1
     * to N?
     */
    public static void printNtimes1(int n, int var) {
        if (var >= n) {
            return;
        }
        System.out.println(n);
        printNtimes1(n, var++);
    }
}
```

Excellent! You actually ran into one of the **most common Java mistakes** involving the post-increment (`++`) and post-decrement (`--`) operators. Understanding this now will save you from many bugs later.

Let's debug it without jumping straight to the fix.

---

## Problem 1

In your first function:

```java
printNtimes(n--);
```

Ask yourself:

> **What value is passed to the function?**

Remember:

- `n--` = **use the current value first, then decrement afterward**.

Suppose `n = 4`.

Execution:

```text
printNtimes(4)
```

Inside the argument:

```text
n--
```

The value passed is **4**.

Only after evaluating the argument does the local variable become 3.

But then what happens?

The current function is suspended while the new recursive call starts:

```text
printNtimes(4)
    ↓
printNtimes(4)
    ↓
printNtimes(4)
```

The decremented value (`3`) belongs to the previous stack frame and is never used for the recursive call. Every recursive call receives `4`, so the base case is never reached.

---

## Problem 2

Exactly the same issue here:

```java
printNtimes1(n, var++);
```

Suppose:

```text
var = 1
```

The recursive call receives:

```text
printNtimes1(n, 1)
```

not

```text
printNtimes1(n, 2)
```

Again, the increment happens **after** the argument value has already been passed.

So the recursion becomes:

```text
printNtimes1(4,1)

↓

printNtimes1(4,1)

↓

printNtimes1(4,1)
```

Infinite recursion.

---

# A rule you'll remember forever

Whenever you see:

```java
function(x++);
```

or

```java
function(x--);
```

pause and ask:

> **"What value is actually being passed?"**

With **post-increment/post-decrement**, the answer is:

> **The old value.**

---

## One more observation

Your base case is:

```java
if (var >= n)
```

Suppose `n = 4`.

Should the function print **4 times** or **3 times**?

Try tracing the values of `var`:

```text
var = 1
var = 2
var = 3
var = 4
```

At which value does your base case stop the recursion?

Does that match the number of times you want to print?

---
