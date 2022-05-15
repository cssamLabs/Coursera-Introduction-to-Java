# Coursera-Introduction-to-Java
 
### Week-1

## Introduction

### Benefits
Write Once Run Anywhere
Object-Orientation
Familiar C/C++ based syntax
Rich Libraries
Security
Internationalization
Performance
Its Free
A community process for expanding Java

#### Write Once Run Anywhere (WORA)
A java application is hosted o a JVM
The code is complied into bytecode which is architecture-neutral
Developers write code for the Java platform rather than a specific platform
The byte codes are executed by the JVM and translated into native machine code by JRE.

Javacode ——>JVM —>compiled to  —>bytecode

bytecode —-> JVM —> execute 

Bytecode instructions —> JRE ——> translated to native machine code

JRE : Bytecode Verifier + Class Loader + JIT
JIT- Just In Time compiler 
￼


#### Library Standards

Java Community Process (JCP): specification of the API


#### Java Database Connectivity
java.sql - standard java 
javax.sql - JavaEE distribution
JDBC-driver - database-neutral interaction with a relational database

￼

#### Security
Bytecode Verifier checks for security violations in compiled byte codes before it is executed by the JRE.
Java programs run with client-specified security settings that give them specified degrees of access to local resources.

#### Internationalization

Java uses 16-bit Unicode standard
localization concept

#### Performance

JDK1.0 20 times slower
OpenJDK18 is faster as native


#### Editions

#### Java Product Suite

Java Standard Edition (SE)
Language
JVM
Core libraries
JRE
JDK
java
java
javadoc
jdb

#### Java Enteprise Edition (EE)
Application Server Framework for handling web components
Business logic side
Servlets
JSP
EJB
JMS
+
Standard Edition

Defines a set of standard APIs for multi-tier enterprise scale applications
Designed to work with conjunction with an application servers as Websphere

Java EE API
JDBC Core API
RMI-IIOP API
JNDI API
JDBC Extensions 2.0
EJB
Servlet API
JSP
JMS - async messaging
JTZ - Java Transaction API
JavaMail - SMTP
JAF - Java Activation Framework
JAXP - Java API for XML Parsing
JCA - Java Connector Architecture
JAAS - Java Authentication and Authorization Service



Java Micro-Edition (ME)
Hardly seen by developers
Blu-Ray players



### Installation

Download Latest version
OpenJDK

JVM types
HostSpot - SUN
OpenJ9 - IBM



## Week-2

## Java Language Fundamentals

### Structure of Java files

Java code must be in a class
stand-alone program needs to include in main method
instructions in the main method will run when execute the program
Case sensitive 


Java Naming Conventions
Names are used to denote classes, objects, attributes and methods
A name is a sequence of letters and number and _
Names may not start with a number
Java names are case sensitive
Class names utilize Camel cases
For others starts with lower case
Constants are all uppercase

Java Reserved words

abstract	if	throws	instance	catch	strictfp	float
default	private	break	return	false	volatile	new
goto *	throw	else	true	interface	class	switch
package	bolean	import	case	static	finally	continue
this	double	public	extends	void	native	for
assert	implements	transient	int	char	super	null
do	protected	byte	short	final	while	synchronized
		enum	try	long	const *	


package
private
protected
public


Non-Object Data in Java


### Primitive Data Types

Primitives are simply variables to hold data
Java provides several primitives data types: byte, short, int, long, float, double, boolean, char

Integer Types
bytes
short
int
long:  with L suffix

Real Number Types
float
double -  real number literals default to double
NaN
declare float with F

Creating Primitives
To create a primitive, simply state its type and name separated by a space and followed by a semi-colon

int x, y, z;
boolean isStarted, isEnded;

can declare primitives anywhere in your code
visibility is local to where it is declared.

naming convention: low Camel Case
for finals: all upper case with underscore ( Snake case)

Initialize Primitive
if not assign a value to a primitive, java automatically uses default value.

Range of Primitive Types
Type	Default	Size (bit)	Min Value	Max Value
boolean	false	1		
char	\u0000	16	\u0000	\uFFFF
byte	0	8	-128	127
short	0	16	-32768	32767
int	0	32	-2147483648	2147483647
long	0	64		
float	0.0	32		
double	0.0	64		
				


Wrapper Classes

int	Integer
long	Long
boolean	Boolean
	
	
### Week-3

## Flow of Control


### Java Operators

Perform mathematical and logical operations

Assignment Operator:  =
Mathematical operators: + - * / %
Unary increment or decrement: ++  - -
Relational Operators: < == > <= >= !=
Logical operators: && || !
Logical and Bitwise operators: & | ~ ^ << >> >>>
Dot Operator: . access class member

More Assignment operators:
x op= y  is    x = x op y
+=, -=, *=, /=, %=
<<=, >>=, >>>=, &=, |=, ^=

Conditional Tenaray Operator: ?:

^ : XOR



Branching

IF Statements

ELSE Statements

Nested IFs

Ternary:
(x > y) > m:n;

SWITCH
based on comparison 
can use string value since Java7


Looping

while

while(count++ < n){
}
first compare count to n
then count increment

do while


for 

multi initialize for

for(i=0; j=2; i<10; i++, j+=3) {
// i increments by 1
// j by 3
}

//java5
for-each loop
loop over iterabels
for(type name : collection) {
// invoke methods of name
}
for(dataType item : array) {
    ...
}


break

continue

types




 


 









