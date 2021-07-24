# Java Strings


### Instructions to compile Java source files from the command prompt

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`).

1. Navigate into directory `03-Strings`
2. Enter command: `javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin examples/[name of class file]`.

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
```
```
% java -classpath bin examples/StringTest   
String A: Hello
String B: Hello
stringA and stringB do NOT point to the same object!
```
