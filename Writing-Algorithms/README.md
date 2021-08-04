# Java Writing-Algorithms


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Writing-Algorithms`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Writing-Algorithms`
2. Enter command: `java -classpath bin WritingAlgorithmsSearchAlgorithmsCodeActivity`


### Output

```
% java -classpath bin WritingAlgorithmsSearchAlgorithmsCodeActivity
-1
```
```
% java -classpath bin WritingAlgorithmsSearchAlgorithmsExercise1
-1
```
```
% java -classpath bin WritingAlgorithmsSearchAlgorithmsExercise2
findLetterIndexFromMiddle > data.length: 25
findLetterIndexFromMiddle > data.length/2: 12
findLetterIndexFromMiddle > firstHalf.length: 12
findLetterIndexFromMiddle > secondHalf.length: 13
the index of letter 'k': 10
```
```
% java -classpath bin WritingAlgorithmsSearchAlgorithmsCodeActivity
-1
```
```
% java -classpath bin WritingAlgorithmsRecursiveMethodsCodeActivity
factorial > num: 5
factorial > num: 4
factorial > num: 3
factorial > num: 2
factorial > num: 1
factorial ? num == 1: 1
w.factorial(input): 120
```
```
% java -classpath bin WritingAlgorithmsRecursiveMethodsExercise1
h
g
f
e
d
c
b
a
```
```
java -classpath bin WritingAlgorithmsRecursiveMethodsExercise2
binarySearch > target: 7
binarySearch > maxRange: 29
binarySearch > midpoint: 14
copyArray > min-max: 0-14
binarySearch > target: 7
binarySearch > maxRange: 14
binarySearch > midpoint: 7
w.binarySearch(input): 7
```
