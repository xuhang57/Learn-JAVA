# To Be a Top Java Developer

Inspired by https://github.com/hollischuang/toBeTopJavaer

And: https://github.com/Snailclimb/JavaGuide/blob/master/docs/java/Java%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86.md

## Java Basic

### Class

A **class** is a template that describes the data and behavior associated with an instance of that class.

The data associated with a class is stored in **variables**; the behavior associated to class or object is implemented with **methods**.

### Object

An **object** is an instance of a class. Each object is created based on the class definition.

### Packages

Java groups classes into functional **packages**. Packages are typically used to group classes into logical units.

One main reason for the usage of packages is to avoid name collisions of classes. A name collision occurs if two programmers give the same fully qualified name to a class.

### Inheritance

A class can be derived from another class. In this case this class is called **subclass**. (extends) The class from which the subclass is derived is called a **superclass**. **Inheritance** allows a class to inherit the behavior and data definitions of another class.

### Interface

**Interfaces** are used to define common behavior of implementing classes. If two classes implement the same interface, other code which work on the interface level, can use objects of both classes.

Like a class an interface defines methods. Classes can implement one or several interfaces. A class which implements an interface must provide an implementation for all abstract methods defined in the interface.

### Abstract and Default in Interface

An interface can have abstract methods and default methods. All methods without defining using default keyword are public and abstract.

### Multiple Inheritance

If a class implements two interfaces and if these interfaces provide the same default method, Java resolves the correct method for the class by some rules.

### Functional Interfaces

All interfaces that have only one method are called **functional interfaces**. They have the advantage that can be used together with lambda expressions.

### Annotations

Annotations provide data about a class that is not part of the programming logic itself. They have no direct effect on the code they annotate.

### Constructor

A class contains **constructors** that are invoked by the Java runtime to create objects based on the class definition. A class can have several constructors with different parameters.

Each class must define at least one constructor. If no explicit constructor is defined, the compiler implicitly adds a constructor.

Every object is created based on a constructor. This constructor method is the first statement called before anything else can be done with the object

### Modifiers

Java has **public**, **private**, **protected**, **default**, modifiers. private < no modifier (default) < protected < public.

### Class Methods and Class Variable

Class methods and class variables are associated with the class and not an instance of the class, i.e. objects. 

If you define a static variable, no matter how many instances exist, the Java runtime environment associates one class variable for a class. The static variable can therefore be seen as a global variable

### Abstract Class and Method

A class and a method can be declared as abstract. An abstract class can not be directly instantiated. (Why do we need abstract classes?)


## Object-Oriented Programming

### What is Object-Oriented Programming(OOP)?

Object-Oriented Programming is a programming paradigm based on the concept of "objects", which can contain data, in the form of fields(attributes), and code, in the form of procedures(methods). (Quoting from [Wikipedia](https://en.wikipedia.org/wiki/Object-oriented_programming))

OOP Characteristics:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

OOP Principles:

* Single-Responsibility
* Open-Closed
* Liskov-Substitution
* Dependency-Inversion
* Interface-Segregation

Read More:

* [Oracle: Java Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
* [StackOverflow: Functional Programming vs Object-Oriented Programming](https://stackoverflow.com/Questions/2078978/functional-programming-vs-object-oriented-programming)

Challenge:

1. Explain OOP to a six-year old kid.

### Platform-Independent Java

### Is Java "pass-by-reference" or "pass-by-value"?

Java is always **pass-by-value**.

Read More: https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value

### Difference between "overload" and "override" in Java?
  
* @override:
* overloading:

### What are the primitive data type and their range?

### What is the float type? And what is single float and double float?

### What is boxing and un-boxing?

### How does the Integer cache works?

### Why String is immutable?

### What is the difference of the substring implementation between Java 6 and 7?
