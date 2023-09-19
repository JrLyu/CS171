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
- How to design the class hierarchy using the is-a generalization technique
  - First, determine all the program classes that we will need to solve the problem. Determine the properties and actions that are needed in each class.
  - Then, generalize similar program classes using the is-a generalization. Use the properties and actions in each class to find the more general classes.
  - If possible, generalize further. Use the final hierarchy to determine the properties and actions of each class. 
> **Superclass**: the more general class in the `is-a` relationship (aka, parent class)
  - A super class has a number of properties and actions.
> **Subclass**: the more specific class in the `is-a` relationship (aka, child class)
  - Every object of the subclass will have all the properties and actions in the superclass.
  - In addition, the subclass object can have other properties and actions not found in the superclass. 
    - * See `TestGeometricObject.java`
- The OOP design allows us to avoid duplications of codes when solving a problem! 
  - * See `TestOldWay.java`
  - We define a superclass that contains the common (shared) properties and actions in all classes
    - Some methods in the superclass may not have a useful method body - it's OK. This is very useful for the polymorphism mechanism.
  - We create subclasses that extend the superclass.
    - For private instance variables, we must use its accessor/mutator methods to use the variables.
    - For public instance variables, we can access them directly. 
  - We can override some methods in the subclass. 
- Relationship between a subclass and its superclass
  - A subclass inherits all variables and (normal) methods from its superclass. 
  - A subclass do not inherit any constructor method from its superclass. 
    - A constructor in the subclass must invoke a constructor in the superclass
    - A subclass object always contains a superclass object. 
    - Objects are initialized using its constructor
  - Rule: a constructor in the subclass must invoke some constructor in its superclass as its first statement.
    - The keyword `super(...)` is used to invoke a constructor in its superclass.
  - Rule: if a constructor in the subclass does not invoke any constructor in its superclass, then, the Java compiler will automatically insert the call `super()` as the first statement. That is, when the first statement in a constructor is not `super(...)`, the Java compiler will call the default constructor. 
  ```java
  public class NewClass extends SomeClass{
    NewClass() {
      // Compile error -- why?
    }
  }

  public class SomeClass {
    public int x;
    public SomeClass(int a) {
      x = a;
    }
  }
  ```
  - The compile error is because the constructor `NewClass()` does not contain any `super(...)` calls, so Java compile will insert `super(...)`: 
  ```java
  public class NewClass extends SomeClass{
    NewClass() {
      super();
    }
  }
  ```
  - However, there is not matching constructor (`SomeClass()`) defined in the supercalss, which causes the error. 
- Consequences of the constructor invocation rule in Java: 
  - Constructor invocation rule in Java:
    - If a class `B` inherits from class `A`, then every constructor in class `B` must invoke some constructor in class `A`.
  - Consequence: 
    - If another class `C` inherits from the class `B`, then every constructor in class `C` must invoke some constructor in class `B` and in class `A`.
    - This phenomenon is called **constructor chaining**. 
- Summary:
  -  A subclass inherits all normal members (including `private` members) from its superclass
  -  Methods in the subclass cannot access the `private` inherited members directly.
  -  A subclass object contains (all members in) a supercalss object.
  -  A subclass do not inherit any constructors from its superclass.
  -  Because a subclass object contains (All members in) a superclass object, every constructor in the subclass must invoke a constructor in the superclass. 
- Sometimes, we must use the overridden method inside the super class (i.e., use `super.methodName()`)
  - * See `05-bank-account`