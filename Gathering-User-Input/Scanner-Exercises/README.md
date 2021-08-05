# Java Scanner-Exercises


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Scanner-Exercises`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Scanner-Exercises`
2. Enter command: `java -classpath bin Exercise1`


### Output

```
% java -classpath bin Exercise1
Please type in a line and hit Enter.
Instructions to run a Java application from the command prompt
The number of vowels: 18
```
```
% java -classpath bin Exercise2
Please type in one of the following:
* 1 - Move Right
* 2 - Move Left
* 3 - Move Up
* 4 - Move Down
* q - exit program
1
Moving Right
2
Moving Left
3
Moving Up
4
Moving Down
5
Try again. Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]
q
Moving Left
Exiting program...
```
