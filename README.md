# Second-Assignment
Ex1 Project
Overview
This project provides functionality for converting and validating numbers in different bases, ranging from base 2 to base 16. It includes methods for base conversion, checking number formats, and unit tests to ensure correctness.

Classes
1. Ex1
This class contains methods for number conversion, validation, and comparison.

Methods:
public static int number2Int(String num): Converts a given string representation of a number in various bases to its decimal (int) representation.

public static boolean isNumber(String a): Checks if a given string is in a valid number format for bases ranging from 2 to 16.

public static int getBase(String a): Retrieves the base of the number represented in the string.

public static String int2Number(int num, int base): Converts a given decimal number to its string representation in a specified base.

public static boolean equals(String n1, String n2): Compares two numbers (given as strings) and checks if they have the same value.

public static int maxIndex(String[] arr): Finds the index of the largest number (in value) within an array of number strings.

2. Ex1Main
This class serves as the main entry point for user interaction. It uses the Scanner class to take user input, perform operations using the methods in Ex1, and display results.

Features:
Prompts the user to enter numbers and a base.

Validates the input format.

Converts and displays numbers in various bases.

Performs addition and multiplication of the entered numbers and displays the results in the specified base.

Determines the maximum number in a given array of number strings.

3. Ex1Test
This class contains JUnit tests for the methods in the Ex1 class to ensure their correctness.

Test Methods:
computeNumberTest(): Tests the conversion between different bases.

isBasisNumberTest(): Tests the validation of number formats in various bases.

int2NumberTest(): Tests the conversion of decimal numbers to their string representation in different bases.

maxIndexTest(): Tests the functionality to find the maximum number in an array.

getBaseTest(): Tests the retrieval of the base from a number string.

Usage
Clone the Repository:

sh
git clone <repository-url>
cd <repository-directory>
Compile and Run the Main Program:

sh
javac Ex1/*.java
java Ex1.Ex1Main
Run the JUnit Tests: Make sure you have JUnit 5 set up in your development environment.

sh
javac -cp .:junit-platform-console-standalone-1.8.1.jar Ex1/*.java
java -jar junit-platform-console-standalone-1.8.1.jar --class-path . --scan-class-path
Notes
Ensure your development environment is set up for Java with JDK installed.

Handle invalid inputs gracefully to prevent runtime errors.

Extend the test cases in Ex1Test to cover more scenarios and edge cases.
