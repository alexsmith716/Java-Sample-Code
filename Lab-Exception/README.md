# Java Lab-Exception


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Lab-Exception`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin examples/[name of class file]`.

1. Navigate into directory `Lab-Exception`
2. Enter command: `java -classpath bin com.alex.exceptions.Simulation`


### Output

```
% java -classpath bin com.alex.exceptions.Simulation
Type in a number and press Enter...
4242
You've typed: 4242
com.alex.exceptions.EvenNumberException: You cannot input an even number.
  at com.alex.exceptions.Simulation.getInput(Simulation.java:26)
  at com.alex.exceptions.Simulation.main(Simulation.java:9)
```
