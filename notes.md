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
