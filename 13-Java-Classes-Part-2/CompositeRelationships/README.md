# Java CompositeRelationships

Two classes can share a composite relationship with another. One class is the owner and the other exists on its own. For example, a `DogHouse` class has a composite relationship with a `Dog` class.


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `CompositeRelationships`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin package/[name of class file]`.

1. Navigate into directory `CompositeRelationships`
2. Enter command: `java -classpath bin DogHouse`


### Output

```
% java -classpath bin DogHouse
Woof!
This house belongs to: Ralph
```
