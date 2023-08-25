# Introduction \& Review

## Introduction
> ***Algorithm***: A method for solving a problem expressed as a **sequence of steps** that is suitable for execution by a computer(machine).

Different ways to express algorithms: 
- Natural languages (bad - ambiguous)
- Flow charts (good for conceptualization of the algorithm)
- Pseudo code (good for algorithm development)
- Programming languages (good for communicating the algorithm to a machine because it's unambiguous)

> ***Data structure***: a way to **organize** (insert, delete, and retrieve) the data used by an algorithm

Example of a data structure: arrays

Every data structure has its strengths and its weaknesses: 
- Array: The data is stored in consecutive array elements & The array elements are accessed efficiently using an index. 
  - Strength: efficient (low) storage cost
  - Weakness: not dynamic (cannot increase in size easily)

Metrics used to measure the goodness of algorithms: 
- **Running time**: how long does it take for the program to finish
- **Storage requirement**: how much memory does the program use to store its information.

## Review - Computer Architecture
### The smallest unit of Computer Memory: bit
1. Computers use memory devices built with electronics. 
2. The smallest memory device used by the computer works like a switch. It can be in one of the 2 states:
   - Off state (state 0)
   - On state (state 1)
   - 0 and 1 are called **binary digits**
3. The smallest memory device is called a bit (=binary digit)
4. A row on $n$ bits can be in one of $2^n$ states: each switch can be in 2 states, and so the total number of combinations is $2\times2\times2\times\cdots\times2=2^n$
5. Byte memory = 8 bits = a memory device that can retain (=remember) 8 binary digits. Since $2^8=256$, each byte can store one of the 256 possible patterns of binary numbers. 
6. Though humans are very flexible in storing data (can use many different methods), computers can only store data/information as binary numbers. 

### Memory address and Memory content
1. Each memory cell is identified by a unique address (which is a number).
2. Each memory cell stores a number (that is the data/information stored by the computer).

## Review - Variables in Java

1. What happens inside the computer when we define a variable `int a`: 
   - The computer will find some used memory cells and mark them as used (aka: allocate memory)
   - The the computer equates(=records) the name `a` to the memory location of the reserved cells. 
  
2. Each variable has a **data type**
   - The data type specifies the kind of information.
   - Each kind of information has its own way of representation. The way of representation is called a **code**.

3. Encoding method of a data type:
   - Information of a data type are represented by binary numbers.
   - The encoding method defines the way to interpret a binary number. 

4. <mark>**Data type provide the context to interpret a number and obtain the meaningo f the number.**</mark>
   * See `datatype.java` for an example.

5. Java's primitive data types: 
     
|   Data type   | Encoding method|
|:-------:|:-------:|
|byte|2's complement encoding using 8 bits|
|short|2's complement encoding using 16 bits|
|int|2's complement encoding using 32 bits|
|long|2's complement encoding using 64 bits|
|float|IEEE 754 encoding using 32 bits|
|double|IEEE 754 encoding using 64 bits|
|char|Unicode encoding using 16 bits|
|boolean|Enumeration encoding using 0=false and 1=true|

6. Besides the primitive data types, all other data types in Java are **reference data types**: 
   - Reference: A reference in computer science is a memory address
   - Reference data type: A variable of a reference data type stores a memory address

7. Primitive and reference data types are stored differently:
   - The variable of primitive data types contains a value of that data type. 
   - The variable of reference data types contains a reference to the location where the object is stored. 