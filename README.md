# Second-Assignment
Ex1 Project
Overview
This project contains methods for converting and validating numbers in different bases, ranging from base 2 to base 16.

Classes:

Ex1:

This class has methods to:

number2Int: Convert a number string in different bases to a decimal (integer).

isNumber: Check if a string is a valid number in various bases.

getBase: Get the base of a number string.

int2Number: Convert a decimal number to a string in any given base.

equals: Compare two number strings to see if they have the same value.

maxIndex: Find the index of the largest number in an array.

Ex1Main:

This class interacts with the user:

Takes user input for two numbers and bases.

Validates the input.

Converts and displays numbers in various bases.

Performs addition and multiplication of the two numbers.

Finds the maximum number in an array.

Ex1Test
This class contains tests to ensure the Ex1 methods work correctly.
java Ex1.Ex1Main
Run the Tests:

sh
javac -cp .:junit-platform-console-standalone-1.8.1.jar Ex1/*.java
java -jar junit-platform-console-standalone-1.8.1.jar --class-path . --scan-class-path
