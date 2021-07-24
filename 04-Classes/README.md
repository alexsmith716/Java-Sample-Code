# Java Classes


### Instructions to compile Java source files from the command prompt

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`).

1. Navigate into directory `04-Classes`
2. Enter command: `javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin examples/[name of class file]`.

1. Navigate into directory `04-Classes`
2. Enter command: `java -classpath bin examples/RobotTester`


### Output

```
% java -classpath bin examples/RobotTester
The robot moves a distance of 1 units.
```
