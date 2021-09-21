## Problem Statement

Program can model a line based on points consisting of (x, y) coordinates using the cartesian system and program can calculate its length.

## Pre-requisites:
The project needs these dependencies:
1) JDK 15.0.2
2) JUnit 5

## Instruction:
### How To Build
```
./gradlew build
```

### How To Test
```
./gradlew test
```

### How to Use the Line Model
```
int x1 = 1;
int y1 = 2;
int x2 = 3;
int y2 = 4;

double length = line.length(x1, y1, x2, y2);
