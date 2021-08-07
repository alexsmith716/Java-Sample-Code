# Java Lab-StaticInstance

The keyword this is used to refer to the current object. 

It is very useful to avoid ambiguity within methods that have variables with the same name as instance variables. 


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Lab-StaticInstance`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `Lab-StaticInstance`
2. Enter command: `java -classpath bin Test`


### Output

```
% java -classpath bin Test
1
1
1
2
object a instanceCount: 15
object a2 instanceCount: 1
class A staticCount: 2494
```
