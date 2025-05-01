# My First Java Project: Console Banking App - Concepts Learned

This project served as practical application for many fundamental Java concepts. It simulates basic banking operations like checking balance, depositing, and withdrawing funds through a console menu.

## Core Java Concepts Applied:

- **Class Definition:** Used a `public class Main` to structure the entire application.
- **`main` Method:** Implemented the standard `public static void main(String[] args)` entry point where program execution begins.
- **Variable Declaration & Types:** Declared and used variables of different primitive types (`double` for balance/amount, `int` for choice, `boolean` for loop control) to manage program state.
- **`Scanner` for User Input:** Imported and utilized `java.util.Scanner` to read user input from the console (menu choices via `nextInt()`, monetary amounts via `nextDouble()`).
- **Console Output:** Employed `System.out.println()` and `System.out.print()` to display menus, prompts, and messages to the user. Used `System.out.printf()` for formatted output (displaying the balance as currency).
- **`while` Loop:** Implemented a `while` loop controlled by a `boolean` flag (`isRunning`) to repeatedly display the menu and process user actions until they chose to exit.
- **`switch` Statement (Enhanced):** Used the modern `case ... ->` syntax for `switch` statements to handle the user's menu choice cleanly and direct program flow without needing `break` statements for non-fallthrough behavior. Included a `default` case for invalid selections.
- **`if-else if-else` Statements:** Applied conditional logic within the `deposit` and `withdraw` methods to validate user input (e.g., preventing negative amounts) and business rules (e.g., checking for sufficient funds before withdrawal).
- **Methods:**
  - Defined separate `static` methods (`showBalance`, `deposit`, `withdraw`) to break down the program into logical, reusable units.
  - Passed data between methods using **parameters** (e.g., `double balance`).
  - Used different **return types** (`void`, `double`) to either perform an action or return a calculated value back to the caller.
  - Used the `return` keyword to send values back or exit a method early (e.g., on validation failure).
- **`static` Keyword:** Utilized `static` for the helper methods and the `Scanner` object, as required when calling/using them directly from the `static main` method.
- **Basic Operators:** Made use of arithmetic (`+`, `-`), assignment (`=`), and comparison (`>`, `<`) operators.
- **Object Creation:** Created an instance of the `Scanner` class using the `new` keyword (`new Scanner(System.in)`).
- **Resource Management:** Included `scanner.close()` at the end to properly close the `Scanner` and release associated system resources.

This project provided hands-on experience combining these core concepts to build a functional console application.
