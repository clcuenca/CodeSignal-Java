# Codesignal - Java

## Description

Collection of various Codesignal problems written in Java.

## Categories in Progress

* **Intro**

## Structure

This repository aims to keep each category & sub categories in their own directory to reflect the structure of Codesignal's problem sets; e.g. Intro -> The Journey Begins -> *problem*. Each problem will compile & able to be ran on the command line as well as, include a makefile & input.txt file to display the results. Each program is designed to consume the included input file.

## Program Execution

The following command is used to execute each of the programs:

```bash
java -jar <program name>.jar < input.txt
```

Additionally, a 'run' command is included with each makefile.

## Program Compilation

Each program has been compiled with the following command (included in the corresponding makefile):

```~$ javac <program name>.java```

At the time of writing, the compilation & execution of each of the programs has been done with Cygwin.

## Setup

The compilation & execution of each program requires a Java JDK. After installation add the Java compiler to the PATH variable like:

```bash
export PATH=$PATH:"/cygdrive/C/Program Files/Java/<jdk version>/bin/"
```

Compilation & execution has been tested with Cygwin 