# Java Keyword-Static

Static makes a variable accessible directly by the class type and not via a reference to an object.

Static determines whether a method or variable belongs to the class as a whole or to only an instance.


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Keyword-Static`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `Keyword-Static`
2. Enter command: `java -classpath bin ExampleOne`


### Output

```
% java -classpath bin ExampleOne
Wake Up
1
1
2
```
