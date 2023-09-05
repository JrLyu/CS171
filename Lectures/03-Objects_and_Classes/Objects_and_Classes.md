# Objects and Classes

## Introduction to Object Oriented Programming (OOP)
- Class in Java contains variables and methods. 
- The real purpose of a class in Java is to implement/model an object that contribute to the solution of the problem. 
- Programming methodology before ~1980: use the modular programming technique to help build **large-scale** complex computer programs.
- Today's methodology: use the **object** concept to build large-scale complex computer programs. This style of programming using object is called the **Object-Oriented Programming (OOP)**
- How OOP help us write complex programs:
  - **Abstraction**: OOP provides abstract classes to help reduce(=hide) details
  - **Inheritance**: allows existing code to be re-used.
  - **Polymorphism**: allows existing code to be modified/enhanced.
  - **Encapsulation**: prevents code in other classes from accessing/modifying important variables to localize debugging. 
> **Object**: an object represents an entity in the real world that can be distinctly identified. 
- An object has: 
  - A unique identity
  - A state
  - A behavior
> The **state** of an object (also known as its properties or attributes) is represented by data fields with their current values. 
- A Java class represents the state/properties of objects using: 
  - The **instance variables** inside a class
  - Each object will have its own instance variables. 
> The **behavior** of an object (also known as its actions) is defined by methods. 
> To **invoke** a method on an object is to tell the object to perform an action.
- A Java class defines the behavior of objects using: 
  - The **instance methods** inside a class
  - All objects of a class share the instance methods (because they have the same behavior).
- A class is used as a template(=description) to construct the object's data fields and to define its methods:
  - When we create objects of a class, Java will use the class definition to allocate the instance variables for that object.
  - When you invoke some method on an object, Java will run the code in the method definition on the instance variables of the object. 
  - We can create as many instances(=objects) of a class as we need:
    - Each object will have its own properties(=instance variables).
    - But all objects will share the same actions(=instance methods).

## Defining a Class & Creating Objects
```java
public class Circle {
    public double radius = 1; // The radius of this circle

    public Circle() { } // constructor 1 for a circle object
    public Circle(double newRadius) { // constructor 2 for a circle object
        radius = newRadius;
    }

    public double getArea() { // return the area of this circle
        return 3.14159 * radius * radius;
    }

    public void setRadius(double newRadius) { // set new radius for this circle
        radius = newRadius;
    }
}
```

We use the `Circle` class to create two `Circle` objects: 
```java
    public static void main() {
        Circle circle1 = new Circle(); // Invokes Circle() to make this circle

        Circle circle2 = new Circle(2); // Invokes Circle(double) to make this circle

        double area1 = circle1.getArea(); // Tell circle1 to run getArea()
        System.out.println("Area1: " + area1);

        double area2 = circle2.getArea(); // Tell circle2 to run getArea()
        System.out.println("Area2: " + area2);

        circle1.setRaius(5); // Tell circle1 to run setRadius()

        double area1 = circle1.getArea(); // Tell circle1 to run getArea()
        System.out.println("Area1: " + area1);
    }
```
* See `Demo.java` and `Cirlce.java`
> **Unified Modeling Language (UML)**: a standardized modeling representation description of classes and objects. 
- A Java class uses **variables** to define data fields (properties) of objects.
- A Java class uses **methods** to define the actions/behaviors of objects. 
  - Methods to define the actions of objects DO NOT have the `static` qualifier
- A class provides special method called **constructors** which are invoked only to create a new object.
  -  Constructors are designed to perform initializing actions, such as initializing the data fields of objects.
- A class that represents real world objects usually does not need a `main()` method. Without a `main()` method, such class cannot be run as a Java program.
  - Though we may include a `main()` method in the class to test the methods, but it is preferred to write a separate class to do the testing. 
- Preventing undesirable behavior in objects:
  - The `Circle` class implementation allows a user to access the object variables directly because we did not define `radius` to be private. 
  ```java
  public class Circle {
    public double radius = 1; // Then radius cannot be modified outside the class

    public static void main() {
        Circle circle1 = new Circle();
        circle1.radius = 10; // changes the value of radius directlly
    }
  }
  ``````
  - We prevent direct access to variables in a class by using the `private` qualifier. 
  ```java
  public class Circle {
    private double radius = 1; // Then radius cannot be modified outside the class

    public static void main() {
        Circle circle1 = new Circle();
        circle1.radius = 10; // complie error
    }
  }
  ```

## Constructors of a Class
> **Constructors** are special methods in a class that is only invoked when an object is created using the `new` operator: 
> ```java
>   ClassName objVar = new ClassName(...);
> ```
- Constructors have 3 special properties:
  - A constructor must have the same name as the class itself.
  - Constructors do not have a return type - not even `void`.
    - If we include a `void` return type, then the method is not a constructor, but a behavior that the object can take.
  - Constructors cannot be invoked like an ordinary method. 
- Like regular methods, constructors can be overloads (i.e., multiple constructors can be defined with different signatures).
- Rules on constructors and the default constructor: 
  - Every class must have at least one constructor.
  - If a class does not have any constructor, then the Java compiler will automatically insert this constructor: `className() { }`. This constructor is called the **default constructor**. 
  - However, the Java compiler will not insert the default constructor if there is a constructor defined in the class. 

## Objects as Reference Data Types
```java
Circle  is a reference data type
circle1 is a reference variable
circle1 references (points to) a Circle object
```
- We create variables to store the properties of a new object when we create the object
- The behavior of an object (=program instructions) is stored when Java compiles the class definition.
- An object's member can refer to: 
  - A data field in the object
  - A method in the object
- After an object is created, its data can be accessed, and its methods can be invoked using the `dot` operator. 
  ```java
  objectRefVar.dataField  references a data field in the object
  objectRefVar.method(arguments)  invokes a method on the object
  ```
- The `dot` operator is also known as the object member access operator. 
- Why Java have reference typed variables and primitive typed variables? 
  - Variables of a primitive data type can only store 1 value but can be accessed quickly -- such variables are mainly used in computations.
  - Objects can have many data fields and can allow the programmer to represent complex things in the real world.
    - Objects are mainly used for data representation
    - Accessing to data in an object is slower (need 2 memory accesses)
- We can access the member variable without using any reference variable: 
  - An instance method is always invoked using an object reference variable: `objectRefVar.method(arguments)`
  - The variable `objectRefVar` is also passed to an instance method as an implicit (=hidden) parameter. The name of the implicit parameter is called `this`.
- * See `Circle.java`
- This implicit parameter `this` is almost never necessary to write in a Java class. There is only 1 case that it is necessary: 
  - when a parameter variable has the same name as an instance variable in the class. 
- * See `Circle.java`
- The `this` keyword is can also be used to invoke another constructor of the same class. 

## Copying Objects
- **Copy** an object means:
  - Make a duplicate of an object where the duplicated object contains the same data as the original object.
  - Updating the instance variables in the duplicate object must not affect the values in the original object. 
- One way is to create a new object and then copy the data fields.
  ```java
  public static void main() {
    Circle circle1 = new Circle(4);

    // Make a COPY of circle1
    Circle circle2 = new Circle();
    circle2.radius = circle1.radius;
  }
  ```
- * See `CircleCopy.java`. This method only works when the data fields are defined in `public`.
- Another way is through a copy constructor: 
  ```java
  public class Circle{
    private double radius = 1;
    public Circle() { } // constructor for a circle object

    public Circle(Circle c) { // copy constructor that copies circle c
      radius = c.radius; 
    }
  }
  ```
  To invoke the copy constructor: 
  ```java
  public static void main() {
    Circle circle1 = new Circle(4);
    Circile circle2 = new Circle(circle1);
  }
  ```
- * See `CircleCopy.java`.

## Arrays of Objects
- Similar to doubles and integers, we also have arrays of objects in Java. They are also defined in a similar way.
- In other words, we can create a `Circle` object with `new` and assign it to an array element
  ```java
  Circle[] circleArray = new Circle[10];
  circleArray[0] = new Circle(4);
  ```
- However, an array of primitive variables is different from an array of reference variables. 
  - Primitive: 
    - After creating an array of primitive variables, each array element can store a value.
    - Primitive type array variables (`number[k]`) contains values and is used in computations
  - Reference: 
    - After creating an array of reference variables, each array element can store a reference of an object. 
    - Reference array variables (`circleArray[k]`) contains references and is used with the member selection operator `.` (the `dot` operator).