# Java Keywords


### Instructions to compile Java source files from the command prompt

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`).

1. Navigate into directory `06-Keywords`
2. Enter command: `javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin examples/[name of class file]`.

1. Navigate into directory `06-Keywords`
2. Enter command: `java -classpath bin examples/AbstractExample`


### Output

```
% java -classpath bin examples/AbstractExample
The animal munches on some food
The dog walks around
The dog looks cute to get food
```
```
% java -classpath bin examples/StaticExample
instanceA counter: 1
instanceA number: 1
instanceB counter: 2
instanceB number: 1
```
