# My Second Java Project: Swing Login System - Concepts Learned

This project involved building a graphical user interface (GUI) for a simple login system using Java Swing. It expanded upon foundational concepts by introducing GUI programming, event handling, and better data organization.

## Core Concepts Applied:

* **Object-Oriented Programming (OOP):**
    * **Multiple Classes:** Designed the application using several classes (`Main`, `IDandPasswords`, `LoginPage`, `WelcomePage`), each with a specific responsibility.
    * **Constructors:** Used constructors in each class to initialize objects and set up their initial state (e.g., populating credentials, setting up the GUI).
    * **Encapsulation:** Stored login credentials within the `IDandPasswords` class and controlled access using a `protected` getter method.
    * **Object Interaction:** Created instances of classes (`new LoginPage(...)`, `new WelcomePage(...)`) and passed data (like the login info HashMap or the userID) between them.

* **Data Structures:**
    * **`HashMap`:** Utilized `java.util.HashMap` to efficiently store and retrieve key-value pairs (username and password credentials). Used methods like `put`, `containsKey`, and `get`.

* **Java Swing (GUI Programming):**
    * **Frames & Components:** Created windows using `JFrame` and added various components like `JLabel`, `JButton`, `JTextField`, and `JPasswordField` to build the user interface.
    * **Component Configuration:** Customized components by setting their position and size (`setBounds`), text (`setText`), font (`java.awt.Font`), colors (`java.awt.Color`), and focus properties (`setFocusable`).
    * **Layout Management:** Used absolute positioning (`setLayout(null)`) to place components manually via coordinates. *(Note: While functional for simple UIs, more complex GUIs often use Layout Managers like BorderLayout, FlowLayout, GridLayout, etc.)*
    * **Frame Setup:** Configured the main window's size (`setSize`), close operation (`setDefaultCloseOperation`), and visibility (`setVisible`).
    * **Window Management:** Closed the login window (`frame.dispose()`) upon successful login before opening the welcome window.

* **Event Handling (`java.awt.event.*`):**
    * **Interfaces:** Implemented the `ActionListener` interface in the `LoginPage` class to handle user actions.
    * **Event Listener Registration:** Registered the `LoginPage` instance as a listener for button click events using `addActionListener(this)`.
    * **Event Processing:** Implemented the `actionPerformed(ActionEvent e)` method to define the logic that runs when buttons are clicked.
    * **Event Source Detection:** Used `e.getSource()` within `actionPerformed` to determine which button (`loginButton` or `resetButton`) triggered the event.

* **Control Flow:**
    * Used `if`/`else if`/`else` statements extensively within `actionPerformed` to implement the login logic (checking username, checking password, handling incorrect attempts).

* **Key Java Features:**
    * **Packages:** Organized classes into a package (`myProjects.src.login_system`).
    * **Access Modifiers:** Used `public` and `protected` to control access.
    * **Method Overriding:** Used the `@Override` annotation for the `actionPerformed` method implementation.
    * **String Handling:** Retrieved user input using `userIDField.getText()` and handled password input using `userPasswordField.getPassword()` (converting the `char[]` to a `String`).

This project provided valuable experience in GUI development, event-driven programming, and managing application state across multiple interacting objects, building significantly on console-based application development.