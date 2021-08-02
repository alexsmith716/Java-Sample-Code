# Java Methods


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Methods`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Methods`
2. Enter command: `java -classpath bin MethodDeclaration`


### Output

```
% java -classpath bin MethodDeclaration
Inside of the talk method
150
7.5
```
```
% java -classpath bin MethodExercise
23
```
```
% java -classpath bin ExampleOne
Hello
Hello
```
```
java -classpath bin MethodReturnTypesExampleCode
Hello
```
```
% java -classpath bin MethodReturnTypesExercise1
Math.PI: 3.141592653589793
```
```
% java -classpath bin MethodReturnTypesExercise2
letter: a
letter: b
letter: c
letter: d
letter: e
letter: f
letter: g
letter: h
letter: i
letter: j
letter: k
letter: l
letter: m
letter: n
letter: o
letter: p
letter: q
letter: r
letter: s
letter: t
letter: u
letter: v
letter: w
letter: x
letter: y
letter: z
```
```
% java -classpath bin MethodsWithParametersExampleCode
Hello Jessica
```
```
java -classpath bin MethodsWithParametersExercise1
square: 4.0
square: 16.0
square: 36.0
square: 64.0
```
```
% java -classpath bin MethodsWithParametersExercise2
findFirstWord: azzzzzzzzzzzzz
```













