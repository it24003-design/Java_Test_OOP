# Custom Random Number Generator (PRNG) - Assignment#9

## Overview
This project implements a custom pseudo-random number generator (PRNG) in Java 
using static methods and method overloading. It can generate integers, doubles, floats, 
and mixed random numbers.

## Mathematical Model
Seed update formula:

s(n+1) = (a × s(n) + c + (s << 7)) XOR (s >>> 9)

Where:
- `a`, `c` are constants
- `<<`, `>>>` are bitwise shifts
- XOR adds non-linearity
- Absolute value ensures positive numbers

Normalization:
Random = |s| mod m

## Features
- Static methods for all number types
- Method overloading
- Generates int, double, float, mixed numbers
- Access methods using ClassName.MethodName()

## Usage Example
```java
int x = CustomPRNG.randomInt(100);
double y = CustomPRNG.randomDouble();
float z = CustomPRNG.randomFloat();
double mixed = CustomPRNG.randomMixed(5, 20);
