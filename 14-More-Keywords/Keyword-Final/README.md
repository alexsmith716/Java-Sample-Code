# Java Keyword-Final

The keyword final can be applied to variables, methods and classes. 

When applied on a variable, that variable’s value cannot be changed. For primitives this is straightforward, for reference types, this means you cannot reassign the variable to another reference. 

When applied on a method, that method cannot be overridden in subclasses. 

When applied on a class, that class cannot be subclassed. 


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Keyword-Final`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `Keyword-Final`
2. Enter command: `java -classpath bin Tesla`


### Output

```
% java -classpath bin Tesla
Inside constructor > this.someVar: 50
Inside main method > t.someVar: 50
```
