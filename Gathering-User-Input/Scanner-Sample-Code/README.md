# Java Scanner-Sample-Code


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Scanner-Sample-Code`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Scanner-Sample-Code`
2. Enter command: `java -classpath bin ExampleOne`


### Output

```
% java -classpath bin ExampleOne
Type some text and hit Enter: Some text stuff here...
Result: Some text stuff here...
```
```
% java -classpath bin ExampleTwo
1,2,3,5,7,9
```
