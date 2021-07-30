# Java Exceptions


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `08-Exceptions`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin examples/[name of class file]`.

1. Navigate into directory `08-Exceptions`
2. Enter command: `java -classpath bin examples/CheckedExceptionExample`


### Output

```
% java -classpath bin examples/CheckedExceptionExample
Encountered FileNotFoundException, now printStackTrace!
java.io.FileNotFoundException: DoesNotExistX.txt (No such file or directory)
  at java.io.FileInputStream.open0(Native Method)
  at java.io.FileInputStream.open(FileInputStream.java:195)
  at java.io.FileInputStream.<init>(FileInputStream.java:138)
  at java.io.FileInputStream.<init>(FileInputStream.java:93)
  at examples.CheckedExceptionExample.openFile(CheckedExceptionExample.java:9)
  at examples.CheckedExceptionExample.main(CheckedExceptionExample.java:15)
The application's Try - Catch block statement has executed!
```
```
% java -classpath bin examples/ExceptionTest
Caught an arithmetic exception!
java.lang.ArithmeticException: / by zero
  at examples.ExceptionTest.main(ExceptionTest.java:8)
This is the optional "finally" block.
The code has continued on, as normal!
```
