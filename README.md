# Nepstaff_June23
Training material

1. JDK should be installed in our system.

2. Compiler: 
		Source Code ------ Compilation -------> Program
	
   Interpreter | JVM:
		It will try to understand and execute the bytecode(.class) which is 
		generated by compiler to produce/generate the ouput.
		

## Class:

1. Class is an imaginary thing (blueprint) which describes the proprties and behaviour of an Object.
2. Class is a representation of similar kind of objects.
3. Class is an user defined data type.


### Syntax of the class:

<modifier> class <name> <extends> <implements>
     {
	   // body (members)
			|- Varibles
			|- Methods
			|- Constructors*
			|- Blocks
			|- Nested/Inner class
	 
	 }
	 
### Example:

public class Student {

	// instance variable
	String name;
	int rollNo;

	//static variable
	static String college;

	// Behavior
	void study() {
		System.out.println("I m styding");
	}
}
	 
## Object Creation:

	<ClassName> <refVar> =	new <ClassName>()
	
### Example:

        Student s1 = new Student();
		Student s2 = new Student();
		
		Student.college = "AMU"; // write
		
		System.out.print(Student.college); // read

##How to access members of a class:

1. <ClassName>.<member>
2. <ObjRef>.<memeber>

## Data Types:

Refer pic : 21 June

byte -> short -> int -> long -> float > double
char -> int


# Operators in Java:

## 1. Arithmetic operators:

a) +, -, *, /, %

		int a = 10;
		int b = 3;

		System.out.println(a + b); // 13
		System.out.println(a - b); // 7
		System.out.println(a * b); // 30
		System.out.println(a / b); // 3
		System.out.println(a % b); // 1
		
b) 		System.out.println(10 / 0); // ArithmeticException
		System.out.println(10.0 / 0); // Infinity
		System.out.println(-10 / 0.0); // Infinity
		System.out.println(0.0 / 0.0); // NaN

c)  a = a+b;  =>  a += b;
	a = a-b;  =>  a -= b;
	a = a*b;  =>  a *= b;
	a = a/b;  =>  a /= b;
	a = a%b;  =>  a %= b;
	
d)  MAX(int, <type1>, <type2>, ....)

     int a = 10;
	 int b = 3 ;
	 
	int x = a/b ;  // MAX(int, int, int)
	
	
     double a = 10;
	 long b = 3 ;
	 
	  double y = a/b ;  // MAX(int, double, long)
----------------------------------------------------------------------
## 2. Relational operators:

a) <, <=, >, >=

b) operands: Numeric
   result  : boolean
-----------------------------------------------------------------------
## 3. Equality operators:

a) ==, !=

b) operands: Any type
   result  : boolean
   
-----------------------------------------------------------------------
## 4. String concatenation operators ('+'):

In Java, the "+" operator and the concat() method are commonly used for string concatenation. Here's how you can use them:

"+" operator (plus operator): The "+" operator can be used to concatenate strings in Java. Here's an example:

java
Copy code
String str1 = "Hello";
String str2 = " world!";
String result = str1 + str2;
System.out.println(result); // Output: Hello world!
In the above example, the "+" operator is used to concatenate str1 and str2 together, resulting in the string "Hello world!".

concat() method: The concat() method is available in the String class in Java, and it concatenates the specified string to the end of the invoking string. Here's an example:

java
Copy code
String str1 = "Hello";
String str2 = " world!";
String result = str1.concat(str2);
System.out.println(result); // Output: Hello world!
In this example, the concat() method is called on str1 with str2 as the argument. It returns a new string that represents the concatenation of str1 and str2.

Both the "+" operator and the concat() method achieve the same result of concatenating strings in Java. You can choose whichever method is more convenient for your specific use case.





Regenerate response


## 5. Variable increment/decrement operator:

  a) ++ , --  (pre or post)
  
### Example:

 		int i = 10;

		//int j = ++i; // pre-increment

		 int j = i++; // post-increment

		System.out.println(i); // 11
		System.out.println(j); // 10

## 6. Boolean logical operator:
================================
a) &(AND), |(OR), ^(XOR), !(NOT)

b) Operands: <BooleanExpression>
    Result : boolean

#### AND truth table:
  
	true & true = true
	true & false = false
	false & true = false
	false & false = false

#### OR truth table:

	true | true = true
	true | false = true
	false | true = true
	false | false = false

#### XOR truth table:

	true ^ true = false
	true ^ false = true
	false ^ true = true
	false ^ false = false
	
c) &&(AND), ||(OR)

		int x = 15;

		boolean b1 = (6 > x) & (x < 20); // false & true => false
		
		boolean b2 = (6 > x) && (x < 20); // false && (Not Evaluated) => false
		
		System.out.println(b1);
		System.out.println(b2);
		
## 7. Ternary operator:
================================
 (BoolExpr) ? <expr1> : <expr2>
              (true)     (false)
			  
    int a = 20;
	int b = 15;

	int max = a > b ? a : b;
		
	System.out.println("MAX is : " + max);
	
--------------------------------------------------------------

Control Flow:
-------------
a) if(<boolExpr>)
    {
		// body
	}
	
b) if(<boolExpr>)
    {
		// body
	}
	else
	{
		//body
	}
	
c) if(<boolExpr>)
    {
		// body
	}
    else if(<boolExpr>)
    {
		// body
	}
	else if(<boolExpr>)
    {
		// body
	}	
	else
	{
		//body
	}
	
d) Switch Case:
------------------
  switch(<expr>)
  {
	case <label>: 
		-----
		-----
		-----
	case <label>: 
		-----
		-----
		-----  

	case <label>: 
		-----
		-----
		-----
	default: 
		-----
		-----
		-----
  }
 
Loops:
-------
a) for loop
b) while loop
c) do-while loop
d) forEach/enhanced for loop

For Loop:
-------------
  for(<initialization> ; <condition> ; <updation>)
  {
	// body
  }
  
Example:
--------
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

While Loop:
-------------
  <initialization>
    ---
	---
  while(<condition>)
  {
	// body
	 <updation>
  }
  
Example:
--------
		int i = 1; // <initialization>
		while (i <= 20) // <condition>
		{
			System.out.println(i);
			i++; // <updation>
		}

Do-While Loop:
-------------
  <initialization>
    ---
	---
   do
   {
	
	// body
	 <updation>
   }   
  while(<condition>);
  
  
Example:
--------
		int i = 1; // <initialization>
		while (i <= 20) // <condition>
		{
			System.out.println(i);
			i++; // <updation>
		}
		
ForEach Loop:
-------------
  for(<type>  <var> : <ArrayOrCollection>)
  {
	// body
  }
  
Example:
--------
	?????
	
------------------------------------------------------------------
# Arrays in Java:

a) Array is a collection of similar type of elements.
b) Arrays are objects in Java.
c) Elements can be accessed through index starting with zero.
d) For an invalid index, it will throw an exception(ArrayIndexOutofBoundsException)
e) Each array have an extra field named 'length' which contains the size of the array.
f) Arrays are fixed in size.

## Array Creation

	a) <type>[] <var> = new <type>[<size>];
	
			int[] arr = new int[5];

				arr[0] = 3;
				arr[1] = 5;
				arr[2] = 7;
				arr[3] = 9;
				arr[4] = 11;
				
	b) <type>[] <var> = {<values>};
	 
	 		int[] brr = { 3, 5, 7, 9, 11 };
			
# 24-June-2023:

## Methods in Java:

### Syntax:

 <modifier> <returnType> <name> (<parameterList>) <throws>
	{
	  // body
	}

### Example
	 void sayHello()
	 {
		System.out.println("Hello");
	 }


##### In Python:

 class Student
 {
		// method
		def sayHello()
		{
			print("Hello")
		}
			
 }

// fumction
def sayBye()
		{
			print("Bye")
		}

# 27-JUN-2023
### How to get Values from an array

	a) for(int i =0; i < arr.length; i++)
			{
				// body
			}
	
	b)  for(int x : arr)
		{
			//body
		}
		
## Method Overloading(Commpile-time | static | early polymorphism)
	Within a class, we can have two or more methods having same name but different parameter list,
	is call overloaded methods and this phenomina is called method overloading.

    If names are same:
		a) Number of parameters
		b) Data types of parameters
		c) Order of parameters
		
	If everything is same means duplicate methods. -> Compiler Time Error

## Constructor
	a) Constructors are the special members of a class 
		which is used to construct initial state of an object.
	b) Name of the constructor is same as of its class.
	c) Only access modifiers are allowed.(public | protected | private)
	d) Its similar to the method but does not return any value.
	e) Constructor can be called using 'new' operator while object creation.
	f) We have default constructor(with no parameter) as well as parametrized constructor,
			so constructor can be overloaded.

----------------------------------------------------------------------
## 30-June-2023:

## Access Modifiers
	a) public
	b) protected
	c) private
	d) default
	
  private -> defaut -> protected -> public
  
### public
		Accessible from anywhere.

### protected
		Accessible with in the package i.e. package must be same.
		It can be accessible outside the package by using inheritance.
		
### default
		Accessible with in the package i.e. package must be same.
		
### private
		Accessible only within the same class.
		
--------------------------------------------------------------------
# Inheritance
	a) It is a way of Code-Reusability.
	b) Java supports single inheritance using classes.
	c) A class can use extends keyword to mention its parent class.
	d) If a class does'nt mentioned, its parent class thats means its inherit Object class.
		java.lang.Object class is a root class in Java.
	

### Examples

	class A extends Object
	{
		//Body
	}
------------------------
    class B extends A
	{
		//body
	}
	
## Field Hiding
	this -> this keyword is used to access same/current class members
	super -> super keyword is used to access parent class members

## Constructor Chaning:
	this() -> this call is used to involk anothe constructor of the same class
	super() -> this call is used to involk parent class constructor
  
------------------------------------------
04-July-2023
=============
## Abstract method and class

	1. A method without body is declared as abstract method with prefixed abstract
	2. If a class have one or more abstract method(s), it should be declared as abstract class.
	3. We cannot create object of abstract class but only extends.


# Interfaces in Java

	1. Interface is an user defined data type.
	2. Its supports multiple inheritance.

### Syntax of the interface:

<modifier> interface <name> <extends> 
     {
	   // body (members)
			|- Constants
			|- abstract methods
	 
	 }
### Example
	
	public interface Foo
	{
		int x = 10;
		
		void greet();
	}
	
----------------------------
### Important 
    a) A class inherits another class using extends keyword
    a) A class inherits another interface using implements keyword
    a) An interface inherits another interface using extends keyword
    a) An interface cannot inherits another class. It is not possible in Java.
	
class A
{}
-------------
class B
{}
-------------
interface I
{}
-------------
iterface J
{}

-------------------------
class Test1 extends A implements I, J
{}

-----------------------------------------------
5 July 2023:
-------------

## final keyword

	1. final class cannot be inherited.
	2. final variable cannot reassign.
	3. final method cannot be overridden.

-----------------------------------------
6 July 2023:

## Exception Handling:

	a) Syntax Error (compile time errors)
	b) Exceptions (Runtime errors)
	
For Exception handling:
	a) try-catch-finally
	b) throw and throws

### try-catch-finally:

  try
  {
	// Risky code
  }
  catch(Exception e)
  { // Conditionally execute(if try have any exception)
	// handling code
  }
  finally
  { 
	// always execute
	// cleanup code
  }
  
### Types of Exception
	
	a) Unchecked Exception
	b) Checked Exception
	
#### Unchecked Exception
	 1. Object of Error, RuntimeException and their sub-classes are called unchecked exceptions.
	 2. Compiler won't check for these exceptions. It will be ignoned by compiler during compilation.
	 
#### Checked Exception
	 1. All other types of exception categorized as checked exception.
	 2. Compiler will check for checked exceptions, If it is, compiler wont't compile the code
	 and force developer to handle it by using eiher TRY-CATCH or THROWS keyword.
	 

#### throw keyword
	
	 1) It is used to throw an exception programmatically.
	 
----------------------------------------------------
)7-July-2023

# Fundamental classes

## java.lang.Object class
		-> Its a root class.
		1) int hashCode()
		2) String toString()
		3) boolean equals(Object)
		4) Object clone() throws CloneNotSupportedException
		5) Class getClass()
		6) void finalize()
		---Multi-threading---
		7) void wait()
		8) void notify()
        9) void notifyAll()
		
### int hashCode()
		-> Return a hash code value for this object which can be used in the hashed collections(HashSet, HashMap etc.)

### String toString()
		-> Returns a string representation of the object.
		
### boolean equals(Object)
		-> To check object equality.

### Object clone() throws CloneNotSupportedException

### Class getClass()

### void finalize()	

---------------------------------------------------
8 July 2023

## java.lang.String class
		-> String object represents the character sequence.
		-> It is immutable/non changble.
			
			String s1 = "Abc123#@ papa";

For methods see the code: 