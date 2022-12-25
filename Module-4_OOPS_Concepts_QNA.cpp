B1>What is Class in Object Oriented Programming?
->Classes are user-defined data types that act as the blueprint for individual objects, attributes and methods.

B2>What is An Object In Object Oriented Programming Language?
->Objects are instances of a class created with specifically defined data. Objects can correspond to real-world objects or an abstract entity. When class is defined initially, the description is the only object that is defined.

B3>What is Difference Between Class And Interface?
->class : 1.The Keyword used to create class is"Class".
		  2.A class can be instantiated i.e., objects of class can be created.
		  3.Classes does not support multiple inheritance.
		  4.It can be inherit another class.
		  5.It can contain constructors.
  interface : 1.The keyword used to create an interface is “interface”.
  			  2.An Interface cannot be instantiated i.e, objects cannot be created.
			  3.Interface supports multiple inheritance.
			  4.It cannot inherit a class.
			  5.It cannot contain constructors.

B4>What is method overloading in Object Oriented Programming Language?	  	
->If two or more methods within the same class have the same name but different method signatures then this is called method overloading. For example, in the real world, a person can do multiple tasks provided what the characteristics of the task are-
	This means that a task can have many forms-
	To incorporate such a scenario in object-oriented programming, method overloading is used.
	
B5>What is data hiding in Object Oriented Programming Language?
->Data hiding ensures exclusive data access to class members and protects object integrity by preventing unintended or intended changes.

B6>What is difference between Abstract classes and interfaces?
-> Abstract classes:1) Abstract class can have abstract and non-abstract methods.	
					2) Abstract class doesn't support multiple inheritance.	
					3) Abstract class can provide the implementation of interface.	
					4) The abstract keyword is used to declare abstract class.	
					5) An abstract class can be extended using keyword "extends".
	Interfaces : 1)Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
				 2)Interface supports multiple inheritance.
				 3)Interface can't provide the implementation of abstract class.
				 4)The interface keyword is used to declare interface.
				 5)	An interface can be implemented using keyword "implements".

B7>What Are The Virtual Functions in Objected Oriented Programming?
->A virtual function is a member function which is declared within a base class and is re-defined (overridden) by a derived class. When you refer to a derived class object using a pointer or a reference to the base class-
	you can call a virtual function for that object and execute the derived class’s version of the function.
	
B8>What is constructor In Object Oriented Programming?
->A Constructor is a member function, that is called automatically when an object is created.

B9>What is abstract class in Object Oriented Programming Language?
->An abstract class in Object-Oriented Programming (OOP) is a class that cannot be instantiated. In other words, you cannot create an object using the abstract class.

B10>What Is Final Keyword in Object Oriented Programming?
->Final keyword is used to make a particular class OR method as concrete. This means, particular class OR object is prevented from making any new change in it and further change in the behavior is restricted.

B11>What is Pure Virtual Function In Object Oriented Programming?
->A pure virtual function is a function which has no definition in the base class. Its definition lies only in the derived class i.e it is compulsory for the derived class to provide definition of a pure virtual function-
	Since there is no definition in the base class, these functions can be equated to zero.

B12>What are Sealed Modifiers In Object Oriented Programming?
->Sealed types cannot be inherited & are concrete. Sealed modifiers can also be applied to instance methods, properties, events & indexes. It can't be applied to static members-
	Sealed members are allowed in sealed and non-sealed classes.

B13>What is Dynamic Or Run time Polymorphism in oops?
->Dynamic Polymorphism in OOPs is the mechanism by which multiple methods can be defined with same name and signature in the superclass and subclass. The call to an overridden method are resolved at run time-
	Dynamic Polymorphism Example: A reference variable of the super class can refer to a sub class object.
	
B14>What is Access Modifier in Object Oriented Programming?
->Access modifiers are used to implement an important aspect of Object-Oriented Programming known as Data Hiding.
	There are Three Types Of access modifiers:
		1>public
		2>private
		3>protected
		
B15>What is Friend Function In Objected Oriented Programming?
->friend function in object-oriented programming is a way of declaring a relationship between two objects. The friend function takes two arguments: the object and the reference to the friend object-
	The friend function creates a new friend object for the reference.

B16>What is Overriding in Object Oriented Programming?
->Method overriding, in object-oriented programming, is a language feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes.
	It allows for a specific type of polymorphism (subtyping).
	
B17>What is the role of mutable storage class specifier?
->The mutable storage class specifier is used only on a class data member to make it modifiable even though the member is part of an object declared as const. You cannot use the mutable specifier with names declared as static or const, or reference members.

B18>Distinguish between shallow copy and deep copy ?
->Shallow Copy: Shallow repetition is quicker. However, it’s “lazy” it handles pointers and references. Rather than creating a contemporary copy of the particular knowledge the pointer points to, it simply copies over the pointer price. So-
				each the first and therefore the copy can have pointers that reference constant underlying knowledge.

	Deep Copy: Deep repetition truly clones the underlying data. It is not shared between the first and therefore the copy.

B19>what is a Refrence variable in Object oriented Programming Language ?
->  1. Reference variable is used to point object/values.
	2. Classes, interfaces, arrays, enumerations, and, annotations are reference types in Java. Reference variables hold the objects/values of reference types in Java.
	3. Reference variable can also store null value.
	
B20>What is a Copy Constructor?
->A copy constructor is a member function that initializes an object using another object of the same class.

B21>What is this Pointer in Object oriented Programming Language ?
->In object-oriented programming, pointers to functions are used for binding methods, often using virtual method tables . A pointer is a simple, more concrete implementation of the more abstract reference data type.

I1> Define Constructor and Destructor?
->Constructor and Destructor are the special member functions of the class which are created by the C++ compiler or can be defined by the user. The constructor is used to initialize the object of the class while the destructor is called by the compiler when the object is destroyed.

I2> How to Load Classes in Object Oriented Programming ?
->We Can Load Classes by Creating It's Objects.

I3> How to Call Parent Constructor ?
->The constructor of the child class doesn’t automatically call the constructor of its parent class.
	Use parent::__construct (arguments) to call the parent constructor from the constructor in the child class.
	
I4> Are Parent Constructor Called Implicitly When Create An Object Of Class?
-> Parent constructors are not called implicitly if the child class defines a constructor
	In order to run a parent constructor, a call to parent::__construct() within the child constructor is required
	If the child does not define a constructor then it may be inherited from the parent class just like a normal class method (if it was not declared as private).

I5> What Happen, If Constructor Is Defined As Private Or Protected?
->The program cannot run since you have defined a constructor and it is private. Therefore, in your current code-
	there is no way to create objects of the class, making the class useless in a sense.

I7> Create Abstract class and method?
->#include<bits/stdc++.h>
	using namespace std;
	class parent
	{
    public:
    	virtual int sum()=0;
	};
	class child:public parent
	{
    	int a,b;
    	public:
    	child(int x, int y)
    {
        a=x;
        b=y;
    }
    int sum()
    {
        return a+b;
    }
	};
	int main()
	{
    	child c(3,4);
    	cout<<"sum = "<<c.sum();
    	return 0;
	}
	
I8> Define 3 types of visibility of data member & member function.
->#include <bits/stdc++.h>
using namespace std;
 
// Base class
// Class A will be inherited
class A {
public:
    int x;
 
protected:
    int y;
 
private:
    int z;
};
 
// Derived class
// Class B will inherit Class A
class B : public A {
};
 
// main function
int main()
{
    B b;
 
    // x is public
    // so its value will be printed
    cout << b.x << endl;
 
    // y is protected
    // so it will give visibility error
    cout << b.y << endl;
 
    // z is not accessible from B
    // so it will give visibility error
    cout << b.z << endl;
}

I9> Create a method which will never inherited ?
->class A {
  public :
          int a;
          int b;
};

class B : class A {
   public :
           int c;
};

I10> What is the difference between Abstract class and Interface?
->Abstract classes:1) Abstract class can have abstract and non-abstract methods.	
					2) Abstract class doesn't support multiple inheritance.	
					3) Abstract class can provide the implementation of interface.	
					4) The abstract keyword is used to declare abstract class.	
					5) An abstract class can be extended using keyword "extends".
	Interfaces : 1)Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
				 2)Interface supports multiple inheritance.
				 3)Interface can't provide the implementation of abstract class.
				 4)The interface keyword is used to declare interface.
				 5)	An interface can be implemented using keyword "implements".
				 
I11>Create parent class for car and child class for car_model and use car functionality in car_model class ?.
->#include<iostream>
	using namespace std;
	class Car
	{
		
	};
	class Car_bmw : public Car
	{
		public:
		string engine="2000 cc";
		int price=150000;
			
	};
	
I12> Override the parent’s properties and methods in the child class ?
->	
	// Base Class
class Parent {
	void show()
	{
		System.out.println("Parent's show()");
	}
}

// Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	void show()
	{
		System.out.println("Child's show()");
	}
}

// Driver class
class Main {
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}

I13> Prevent the child class from overriding the parent’s methods ?
->class Base {
public:
    bool someGuaranteedResult() { return true; }
};

class Child : public Base {
public:
    bool someGuaranteedResult() { return false; /* Haha I broke things! */ }
};

I15> Declare classes and methods as abstract ?
->class Shape
{
  public:
    virtual double area() = 0;
    virtual double perimeter() = 0;
};

I16> Can we have non abstract methods inside an abstract class? Explain With Examples?
->It is not possible. The Java compiler will refuse to compile a non-abstract class, which includes, or inherits, any method declared as abstract.

I17> How to create child classes from an abstract class?
->Child classes of abstract classes are formed with the help of the extends keyword, like any other child class. They are different in that they have to add the bodies to the abstract methods. The child classes that inherit from abstract classes must add bodies to the abstract methods.

I18> What are Magic Methods/Functions? List them in OOPS ?
->constructor(), destructor()

I19> How can we used Virtual Fuction write an examples in oops ?
->#include<iostream>
using namespace std;
  
class base {
public:
    virtual void print()
    {
        cout << "print base class\n";
    }
  
    void show()
    {
        cout << "show base class\n";
    }
};
  
class derived : public base {
public:
    void print()
    {
        cout << "print derived class\n";
    }
  
    void show()
    {
        cout << "show derived class\n";
    }
};
  
int main()
{
    base *bptr;
    derived d;
    bptr = &d;
  
    // Virtual function, binded at runtime
    bptr->print();
  
    // Non-virtual function, binded at compile time
    bptr->show();
    
    return 0;
}

I20> How can we Used various type of Constructor write an Examples in oops ?
->#include <iostream>
using namespace std;
 
class Sample
{
    int id;
    public:
    void init(int x)
    {
        id=x;   
    }   
    Sample(){}  //default constructor with empty body
     
    Sample(Sample &t)   //copy constructor
    {
        id=t.id;
    }
    void display()
    {
        cout<<endl<<"ID="<<id;
    }
};
int main()
{
    Sample obj1;
    obj1.init(10);
    obj1.display();
     
    Sample obj2(obj1); //or obj2=obj1;    copy constructor called
    obj2.display();
    return 0;
}

I21> Which Constructor have no Parameter write an Examples in oops ?
->#include <iostream>
using namespace std;
 
class construct {
public:
    int a, b;
 
    // Default Constructor
    construct()
    {
        a = 10;
        b = 20;
    }
};
 
int main()
{
    // Default constructor called automatically
    // when the object is created
    construct c;
    cout << "a: " << c.a << endl << "b: " << c.b;
    return 1;
}

I22> How to Secured Internal Data using Encapsulation Write a Example in oops 
->#include <iostream>
using namespace std;

class Adder {
   public:
      // constructor
      Adder(int i = 0) {
         total = i;
      }
      
      // interface to outside world
      void addNum(int number) {
         total += number;
      }
      
      // interface to outside world
      int getTotal() {
         return total;
      };
   
   private:
      // hidden data from outside world
      int total;
};

int main() {
   Adder a;
   
   a.addNum(10);
   a.addNum(20);
   a.addNum(30);

   cout << "Total " << a.getTotal() <<endl;
   return 0;
}

A1> Write a Programme to create a Class in OOPS ?
->class person
{
    char name[20];
    int id;
public:
    void getdetails(){}
};
  
int main()
{
   person
   return 0;
}

A2> Write a Programme to Create a Object in OOPS ?
->class person
{
    char name[20];
    int id;
public:
    void getdetails(){}
};
  
int main()
{
   person p1; // p1 is a object 
   return 0;
}

A3> Write a Programme to Create an Abstract Class In OOPS?
->#include<iostream>
using namespace std;
class Sample_Class {
int a = 5;
public:
virtual void sample_func() = 0;
void print_func() {
cout << a;
}
};
class Derived_Class : public Sample_Class {
public:
void sample_func() {
cout << "pure virtual function is implemented";
}
};
int main() {
Derived_Class d_object;
d_object.sample_func();
}

A4> Write a Programme to Create a Encapsulation in OOPS ?
->#include<iostream>
using namespace std;
 
class Encapsulation
{
    private:
        // data hidden from outside world
        int x;
         
    public:
        // function to set value of
        // variable x
        void set(int a)
        {
            x =a;
        }
         
        // function to return value of
        // variable x
        int get()
        {
            return x;
        }
};
 
// main function
int main()
{
    Encapsulation obj;
     
    obj.set(5);
     
    cout<<obj.get();
    return 0;
}

A5> How to Implement Access Modifier Write a Proggramme in OOPS ?
->#include<iostream>
using namespace std;
 
// class definition
class Circle
{
    public://access modifier
        double radius;
         
        double  compute_area()
        {
            return 3.14*radius*radius;
        }
     
};
 
// main function
int main()
{
    Circle obj;
     
    // accessing public datamember outside class
    obj.radius = 5.5;
     
    cout << "Radius is: " << obj.radius << "\n";
    cout << "Area is: " << obj.compute_area();
    return 0;
}

A6> Write a Proggramme of Copy Constructor in OOPS ?
->#include <iostream>
using namespace std;
  
class Point {
private:
    int x, y;
  
public:
    Point(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
  
    // Copy constructor
    Point(const Point& p1)
    {
        x = p1.x;
        y = p1.y;
    }
  
    int getX() { return x; }
    int getY() { return y; }
};
  
int main()
{
    Point p1(10, 15); // Normal constructor is called here
    Point p2 = p1; // Copy constructor is called here
  
    // Let us access values assigned by constructors
    cout << "p1.x = " << p1.getX()
         << ", p1.y = " << p1.getY();
    cout << "\np2.x = " << p2.getX()
         << ", p2.y = " << p2.getY();
    return 0;
}

A7> Declare and implement an interface and implement more than one 
	interface in the same class.
->public class RectanglePlus 
    implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }
    
    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect 
            = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;               
    }
}
	
A8> How to implement the polymorphism principle in OOPS ?
->#include <bits/stdc++.h>
 
using namespace std;
class Geeks {
public:
   
    // Function with 1 int parameter
    void func(int x)
    {
        cout << "value of x is " <<
                 x << endl;
    }
 
    // Function with same name but
    // 1 double parameter
    void func(double x)
    {
        cout << "value of x is " <<
                 x << endl;
    }
 
    // Function with same name and
    // 2 int parameters
    void func(int x, int y)
    {
        cout << "value of x and y is " <<
                 x << ", " << y << endl;
    }
};
 
// Driver code
int main()
{
    Geeks obj1;
 
    // Function being called depends
    // on the parameters passed
    // func() is called with int value
    obj1.func(7);
 
    // func() is called with double value
    obj1.func(9.132);
 
    // func() is called with 2 int values
    obj1.func(85, 64);
    return 0;
}

A9 Explain Scope resolution operator with example in OOPS ?.
->#include<iostream>
using namespace std;
 
int x; // Global x
 
int main()
{
int x = 10; // Local x
cout << "Value of global x is " << ::x;
cout << "\nValue of local x is " << x;
return 0;
}

A10> How to Access child class property to Parent class write an Programme in oops?
->// Java Program to Demonstrate that Non-method Members
// are Accessed according to Reference Type
// (Unlike methods that are accessed according
// to the referred object)

// Class 1
// Super class
class Parent {
	int value = 1000;

	// Constructor of super class
	Parent()
	{

		// Print statement
		System.out.println("Parent Constructor");
	}
}

// Class 2
// Sub class
class Child extends Parent {

	int value = 10;

	// Constructor of sub class
	Child()
	{

		// Print statement
		System.out.println("Child Constructor");
	}
}

// Class 3
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an object of sub class inside main()
		// method
		Child obj = new Child();

		// Printing the reference of child type
		System.out.println("Reference of Child Type :"
						+ obj.value);

		// Note that doing "Parent par = new Child()"
		// would produce same result
		Parent par = obj;

		// Par holding obj will access the value
		// variable of parent class

		// Printing the reference of parent type
		System.out.println("Reference of Parent Type : "
						+ par.value);
	}
}


A11> Write a Programme of how to define Interface In OOPS ?
->#include <iostream>
#include <string>
using namespace std;
  
// Interface(Abstract class 
// with pure virtual function)
class GFG 
{
  public:
    virtual string returnString() = 0;
};
  
class child : public GFG 
{
  public:
    string returnString() 
    { 
       return "GeeksforGeeks"; 
    }
};
  
// Driver code
int main()
{
    child childObj;
    GFG* ptr;
    ptr = &childObj;
    cout << ptr->returnString();
    return 0;
}

A12> Write a Programme of how to define a Constructor in OOPS ?
->// C++ program to define
// constructor outside the
// class
#include <iostream>
using namespace std;

class GeeksForGeeks {
public:
	int x, y;

	// Constructor declaration
	GeeksForGeeks(int, int);

	// Function to print values
	void show_x_y() {
	cout << x << " " << y << endl;
	}
};

// Constructor definition
GeeksForGeeks::GeeksForGeeks(int a, int b)
{
	x = a;
	y = b;
	cout << "Constructor called" << endl;
}

// Driver code
int main()
{
	GeeksForGeeks obj(2, 3);
	obj.show_x_y();
	return 0;
}

A13> How to define a default constructor write a Programme in OOPS ?
->// CPP program to demonstrate Default constructors
#include <iostream>
using namespace std;

class Base {
public:
	// compiler "declares" constructor
};

class A {
public:
	// User defined constructor
	A() { cout << "A Constructor" << endl; }

	// uninitialized
	int size;
};

class B : public A {
	// compiler defines default constructor of B, and
	// inserts stub to call A constructor

	// compiler won't initialize any data of A
};

class C : public A {
public:
	C()
	{
		// User defined default constructor of C
		// Compiler inserts stub to call A's constructor
		cout << "C Constructor" << endl;

		// compiler won't initialize any data of A
	}
};

class D {
public:
	D()
	{
		// User defined default constructor of D
		// a - constructor to be called, compiler inserts
		// stub to call A constructor
		cout << "D Constructor" << endl;

		// compiler won't initialize any data of 'a'
	}

private:
	A a;
};

// Driver Code
int main()
{
	Base base;

	B b;
	C c;
	D d;

	return 0;
}

				 

			