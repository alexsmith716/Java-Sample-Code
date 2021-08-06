# Java Method-Overloading

An instance variable is associated with an instance of a class. Although it is declared on the class template, the values are not present until an object is created.

Instance variables are accessible by any method in that same class, whereas a local variable is only available in its scope.

### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Method-Overloading`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Method-Overloading`
2. Enter command: `java -classpath bin ExampleOne`


### Output

```
% java -classpath bin ExampleOne
22
Alpha
```
```
% java -classpath bin CodeActivityMethodOverloading
original print method.
second print method
second third
```