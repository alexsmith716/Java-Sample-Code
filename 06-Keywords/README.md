# Java Keywords


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `06-Keywords`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


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
