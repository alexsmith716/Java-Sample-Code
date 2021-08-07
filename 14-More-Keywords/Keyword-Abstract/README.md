# Java Keyword-Abstract

Use the keyword abstract to define an abstract method or class. If a class has at least one abstract method, then the entire class must be declared abstract. 

Use abstraction to provide a basis of functionality that a subclass can inherit and just implement the details that were originally defined as abstract. 


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Keyword-Abstract`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `Keyword-Abstract`
2. Enter command: `java -classpath bin Trumpet`


### Output

```
% java -classpath bin Trumpet
Brumm brumm
```
