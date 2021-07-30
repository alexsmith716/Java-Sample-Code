# Java Strings


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `03-Strings`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `03-Strings`
2. Enter command: `java -classpath bin examples/StringMethods`


### Output

```
% java -classpath bin examples/StringMethods
String.length():          5
String.toUpperCase():     HELLO
String.toLowerCase():     hello
String.indexOf('e'):      1
String.lastIndexOf('l'):  3
String.chatAt(4):         o

string1.equals(string2):            false
string1.equalsIgnoreCase(string2):  true
This is a new String
this is a new string
i
true
true
 is a new string
```
```
% java -classpath bin examples/StringTest   
String A: Hello
String B: Hello
stringA and stringB do NOT point to the same object!
```
```
% java -classpath bin examples/StringConcatenation
Hello World
The value of l: 203
true is true
5 is the sum of x and y
```
