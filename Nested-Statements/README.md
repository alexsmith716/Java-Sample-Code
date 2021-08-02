# Java Nested-Statements


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Nested-Statements`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Nested-Statements`
2. Enter command: `java -classpath bin NestedConditionalWaterSystem`


### Output

```
% java -classpath bin NestedConditionalWaterSystem
The water output should be 45
```
```
% java -classpath bin NestedLoopNameGenerator
Adam Adamson
Adam Bond
Adam Brown
Adam Johnson
Adam Gallagher
Adam Smith
Adam Thompson
Adam Perez
Adam Snow
Adam Tran
Alexis Adamson
Alexis Bond
Alexis Brown
Alexis Johnson
Alexis Gallagher
Alexis Smith
Alexis Thompson
Alexis Perez
Alexis Snow
Alexis Tran
Dennis Adamson
Dennis Bond
Dennis Brown
Dennis Johnson
Dennis Gallagher
Dennis Smith
Dennis Thompson
Dennis Perez
Dennis Snow
Dennis Tran
Jose Adamson
Jose Bond
Jose Brown
Jose Johnson
Jose Gallagher
Jose Smith
Jose Thompson
Jose Perez
Jose Snow
Jose Tran
Jessica Adamson
Jessica Bond
Jessica Brown
Jessica Johnson
Jessica Gallagher
Jessica Smith
Jessica Thompson
Jessica Perez
Jessica Snow
Jessica Tran
Meghan Adamson
Meghan Bond
Meghan Brown
Meghan Johnson
Meghan Gallagher
Meghan Smith
Meghan Thompson
Meghan Perez
Meghan Snow
Meghan Tran
Memphis Adamson
Memphis Bond
Memphis Brown
Memphis Johnson
Memphis Gallagher
Memphis Smith
Memphis Thompson
Memphis Perez
Memphis Snow
Memphis Tran
Nicky Adamson
Nicky Bond
Nicky Brown
Nicky Johnson
Nicky Gallagher
Nicky Smith
Nicky Thompson
Nicky Perez
Nicky Snow
Nicky Tran
Sarah Adamson
Sarah Bond
Sarah Brown
Sarah Johnson
Sarah Gallagher
Sarah Smith
Sarah Thompson
Sarah Perez
Sarah Snow
Sarah Tran
William Adamson
William Bond
William Brown
William Johnson
William Gallagher
William Smith
William Thompson
William Perez
William Snow
William Tran
```
