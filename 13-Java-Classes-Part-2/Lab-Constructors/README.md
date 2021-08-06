# Java Lab-Constructors

A constructor is a block of code that is executed when a class is instantiated. This block of code is executed once per object that is created. A constructor always have the same name as the class and can accept any number of parameters. By default, if you create a class and don't specify a constructor the compiler will generate one for you. The one generated is called the default no-arg constructor.


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Lab-Constructors`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `Lab-Constructors`
2. Enter command: `java -classpath bin Constructors`


### Output

```
% java -classpath bin Constructors
5839
Default constructor ran.
```
