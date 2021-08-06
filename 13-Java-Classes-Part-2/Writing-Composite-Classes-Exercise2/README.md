# Java Writing-Composite-Classes-Exercise2

A class can declare another as an instance variable and this creates a composite relationship between the two.


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Writing-Composite-Classes-Exercise2`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `Writing-Composite-Classes-Exercise2`
2. Enter command: `java -classpath bin Simulation`


### Output

```
% java -classpath bin Simulation
Your Current location: Reston
Your last 24 hours:
0:00 25.0 degrees
1:00 70.0 degrees
2:00 21.0 degrees
3:00 24.0 degrees
4:00 84.0 degrees
5:00 89.0 degrees
6:00 63.0 degrees
7:00 90.0 degrees
8:00 107.0 degrees
9:00 69.0 degrees
10:00 64.0 degrees
11:00 47.0 degrees
12:00 20.0 degrees
13:00 87.0 degrees
14:00 90.0 degrees
15:00 20.0 degrees
16:00 112.0 degrees
17:00 90.0 degrees
18:00 28.0 degrees
19:00 107.0 degrees
20:00 80.0 degrees
21:00 4.0 degrees
22:00 41.0 degrees
23:00 37.0 degrees
```
