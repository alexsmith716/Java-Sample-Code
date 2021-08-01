# Java Loops


### Instructions to compile Java source files from the command prompt

The `mkdir` command with the semicolon (;) operator will create the `bin` directory and then proceed to the `javac` command.

The `javac` command compiles Java source files (`.java`) into bytecode files (`.class`) and the `-d directory` option specifies where the compiler puts the generated `.class` files. If the source file is under a package, the compiler will create package structure in the destination directory. The directory, and any necessary subdirectories, will be created if they do not already exist.

1. Navigate into directory `Loops`
2. Enter command: `mkdir bin ; javac -d bin src/**/*.java`


### Instructions to run a Java application from the command prompt

The `java` command executes/launches a Java program/application.

Syntax for executing a specific `.class` file: `java -classpath bin [name of class file]`.

1. Navigate into directory `Loops`
2. Enter command: `java -classpath bin WhileLoop`


### Output

```
% java -classpath bin WhileLoop
1
2
3
4
5
```
```
% java -classpath bin WhileLoopExercise1Solution
1
2
3
4
5
6
7
8
9
10
```
```
% java -classpath bin WhileLoopExercise2Solution
100
98
96
94
92
90
88
86
84
82
80
78
76
74
72
70
68
66
64
62
60
58
56
54
52
50
48
46
44
42
40
38
36
34
32
30
28
26
24
22
20
18
16
14
12
10
8
6
4
2
0
-2
-4
-6
-8
-10
-12
-14
-16
-18
-20
-22
-24
-26
-28
-30
-32
-34
-36
-38
-40
-42
-44
-46
-48
-50
-52
-54
-56
-58
-60
-62
-64
-66
-68
-70
-72
-74
-76
-78
-80
-82
-84
-86
-88
-90
-92
-94
-96
-98
-100
```
```
% java -classpath bin DoWhileLoop
1+1=2
2+2=4
3+3=6
4+4=8
5+5=10
6+6=12
7+7=14
8+8=16
9+9=18
10+10=20
```
```
% java -classpath bin DoWhileLoopExercise1Solution
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
```
```
% java -classpath bin DoWhileLoopExercise2Solution
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z
```
```
% java -classpath bin ForLoopArraySolution
1
2
3
4
8
16
32
64
67
120
```
```
% java -classpath bin ReverseOrder
Seattle
Philadelphia
Orlando
New York
Los Angeles
Dallas
Charlotte
Atlanta
```
