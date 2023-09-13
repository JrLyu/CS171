# Inheritance and Polymorphism

## Introduction to Inheritance
- Problem: we need to write a program (software) to solve a new problem (How to re-sue existing software to build more complex software prior to ~1995, invention of OOP)
  - We want to write a `NewClass` class to solve the problem
  - We find a program (`SomeClass`) that can be used as the starting point to build our more complex software.
  - We make a copy of the program.
  - Then, we make changes to the copy of software, so the new software does what we want. 
  - However, we have the problem of: 
    - **Redundancy**: we can have multiple copies of the same method
    - **Hard to maintain programs**: when we update the original software (from which we made the new software), we may need to update our programs that are based on the existing software
- After the invention of OOP, we define (not copying!) the new class to **inherit** from the original class.
  - The new class will **inherit**(=receive) all the variables and (normal) methods from an existing class
  - Example:
  ```java
  public class SomeClass{
    public int x;
    public SomeClass{ 
        x = 99;
    }
    public void method1() {
        System.out.println("I am SomeClass.method1(). x = " + x);
    }
    public void method2 () {
        System.out.println("I am Someclass.method2(). x = " + x);
    }
  }
  ```
  ```java
  public class NewClass extends SomeClass{ 
    NewClass() { }
    // No other methods defined
  }
  ```
  ```java
  public static void main(String[] args) {
    NewClass b = new NewClass();
    b.method1(); // Invokes SomeClass.method1()
    b.method2(); // Invokes SomeClass.method2()
  }
  ```
  - If An inherited method is not appropriate (does not do what we want), we **replace (override)** that method with a new method with the same signature. 
    - Methods defined inside the `NewClass` will take priority over an inherited method with the same method signature (this mechanism is called **overriding**).
  - If original class does not have a suitable method for some task in the new class, we can add new methods to our `NewClass` to perform that task. 
    - These new methods will only be defined in the `NewClass` (and will not be defined or inherit in the original class). 
  - * See 02-override
- Accessing an overridden method and an overriding method: 
  - Notice there are two different methods named `method1()` with the same signature if we override the method.
    - The original `method1()` is in `SomeClasses` (the overridden method)
    - The new `method1()` is in `NewClass` (the overriding method)
    - When writing methods in `NewClass`, both methods are available for use (=accessible).
  - To access the overridden method, we use the `super` keyword, which always refers to the members in the super class. 
    - For example, `super.method1()` refers to the `method1()` defined in `SomeClass`
- Important note: Accessibility modifiers are enforced on inherited members.
  - Note: the subclass and its superclass are separate class. 
  - Therefore, methods defined (written) inside a subclass cannot access `private` members in the super class. 
  - Only the **unmodified inherited methods** in the subclass can access the inherited `private` members. 

## Object-Oriented Thinking
- Object-Oriented Thinking
  - In order to maximize the inheritance mechanism to re-use existing software, we need to adopt the Object-Oriented Design methodology when developing the classes.
  - The Object-Oriented Design methodology organizes object class in a hierarchy according to common properties and actions
  - The Object-Oriented methodology can minimize the re-use of variables and methods.
- How to maximize the sharing of properties and/or actions among classes
  - We use a class to model objects of the same type
  - Different classes can have common properties and/or behaviors
  - To maximize sharing of common properties/behaviors, we generalize different classes into a large (super) class.
    - The `is-a` generalization method will give us the maximum sharing of properties and actions
- The Object-Oriented Design methodology uses the **is-a** generalization technique to achieve maximal sharing of properties and actions between classes. 