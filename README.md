# Attendance Calculator

A simple Java Swing application to help students calculate their attendance percentage and determine whether they need to attend more classes or can afford to miss some while maintaining their desired attendance rate.

## Features

- Calculates current attendance percentage.
- Checks if you can afford to miss more classes based on a target attendance percentage.
- Provides the number of classes to attend to meet the desired percentage if you fall below it.

## How to Use

1. **Enter Attended Classes**: Input the number of classes you have attended.
2. **Enter Total Classes**: Input the total number of classes held.
3. **Enter Desired Percentage**: Input your desired attendance percentage.
4. **Click Calculate**: The app will display:
   - The number of classes you can miss while meeting the target attendance.
   - The number of classes you need to attend to reach the desired attendance if below the target.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Ramann2/java-project
   cd attendance-calculator
   ```
2. Compile the Java file:
   ```bash
   javac AttendanceCalculator.java
   ```
3. Run the application:
   ```bash
   java AttendanceCalculator
   ```

Alternatively, you can run the JAR file:
   ```bash
   java -jar AttendanceCalculator.jar
   ```

## Project Structure

- **AttendanceCalculator.java**: Main source code file.
- **AttendanceCalculator.jar**: Compiled JAR file (optional for users who prefer direct execution).

## Example

Example inputs:
- Attended Classes: `30`
- Total Classes: `40`
- Desired Percentage: `75`

Output:
- If the current attendance is above the desired percentage, the app will display the number of classes you can miss.
- If the current attendance is below the desired percentage, the app will display the number of classes you need to attend to meet the target.
