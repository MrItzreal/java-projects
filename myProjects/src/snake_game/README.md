# My Third Java Project: Swing Snake Game - Concepts Learned

This project involved creating a classic Snake game using Java's Swing library for the GUI and AWT for graphics and events. It required combining object-oriented principles with graphics rendering, event handling, and game loop management.

## Core Concepts Applied:

- **Object-Oriented Programming (OOP):**

  - **Class Structure:** Created a `GamePanel` class extending `JPanel` (inheritance) to serve as the main game area.
  - **Interfaces:** Implemented `ActionListener` to handle game loop updates triggered by the Timer.
  - **Method Overriding:** Overrode methods like `paintComponent` (from `JComponent`) for custom drawing and `actionPerformed` (from `ActionListener`) for game ticks.
  - **Constructors:** Used the `GamePanel` constructor to initialize game state, set up panel properties, and start the game.
  - **Inner Classes:** Utilized an inner class (`MyKeyAdapter`) extending `KeyAdapter` to handle keyboard input cleanly within the scope of the `GamePanel`.
  - **Encapsulation:** Managed game state (snake position, score, direction, running status, etc.) using instance variables within the `GamePanel` class.

- **Java Swing & AWT (GUI, Graphics, Events):**

  - **`JPanel`:** Used as the primary component to draw the game onto.
  - **Custom Painting:** Performed custom graphics rendering by overriding the `paintComponent(Graphics g)` method. Remembered to call `super.paintComponent(g)`.
  - **`Graphics` API:** Used the `Graphics` object (`g`) passed to `paintComponent` to:
    - Draw shapes (`fillRect`, `fillOval`, `drawLine`).
    - Set drawing colors (`setColor`, `new Color(...)`).
    - Set fonts (`setFont`, `new Font(...)`).
    - Draw text (`drawString`).
  - **`FontMetrics`:** Used to calculate the dimensions of text strings for accurate positioning (like centering the score and "Game Over" message).
  - **`Color`, `Dimension`, `Font`:** Used AWT classes to manage visual aspects.
  - **`repaint()`:** Called this method (likely within `actionPerformed`) to request that the `JPanel` be redrawn, triggering a call to `paintComponent`.
  - **`Timer`:** Used `javax.swing.Timer` to create a periodic event trigger, forming the main game loop.
  - **Event Handling:** Implemented `ActionListener` for timer events and used `KeyAdapter`/`KeyEvent` for keyboard input.
  - **Focus Management:** Used `setFocusable(true)` to allow the `JPanel` to receive keyboard input.

- **Game Logic & Structure:**

  - **Game Loop:** Created using `Timer` and `actionPerformed`, updating game state and repainting on each "tick".
  - **State Management:** Used boolean flags (`running`) and other variables (`direction`, `bodyParts`, `applesEaten`) to control the flow and state of the game.
  - **Arrays for Coordinates:** Used `int[] x` and `int[] y` arrays to store and manage the coordinates of the snake's segments.
  - **Movement Logic:** Implemented the snake's movement by shifting array elements and updating the head's position based on the `direction` variable (using a `switch`).
  - **Collision Detection:** Implemented logic (`checkCollisions`) to detect collisions between the snake's head and its body or the screen boundaries.
  - **Scoring & Pickups:** Managed apple placement (`newApple` using `Random`) and detection (`checkApple`), incrementing the score and snake length.
  - **Game Over State:** Handled the transition to and display of the "Game Over" screen.

- **Core Java Features:**
  - **Constants:** Defined game parameters (screen dimensions, unit size, delay) using `static final int`.
  - **`Random`:** Used `java.util.Random` for random number generation (apple placement, random snake colors).
  - **Control Flow:** Extensive use of `if`/`else`, `for` loops, and `switch` statements to control game logic.
  - **Arrays:** Fundamental data structure used for the snake's body.

This project represents a significant step into more dynamic and interactive application development, combining GUI rendering, event handling, and state management to create a complete game.

# Creating Objects (Instances) in Java

In Java, you create objects (instances) from a class blueprint using the `new` keyword followed by a call to the class's constructor. There are a couple of common ways to do this:

## 1. Creating and Assigning to a Variable

This is the most common way to create an object when you need to interact with it later.

- **How:** Use `new ClassName()` and assign the result (a reference to the new object in memory) to a variable of the class type.
- **Syntax:** `ClassName variableName = new ClassName();`
- **Example:**
  ```java
  GameFrame myGameFrame = new GameFrame();
  GamePanel mainPanel = new GamePanel();
  ```
- **Purpose:** By assigning the new object to `myGameFrame`, you can now use this variable name to call methods on that specific `GameFrame` object, pass it to other methods, access its public fields, etc., later in your code.

## 2. Creating Without Assigning to a Variable ("Anonymous" Instance)

You can also create an object without assigning it to a named variable.

- **How:** Simply use `new ClassName()`.
- **Syntax:** `new ClassName();`
- **Example:**
  ```java
  new GameFrame();
  new GamePanel();
  ```
- **Purpose:** This is useful when the **act of creating the object itself (specifically, running its constructor)** performs the entire action you need, and you don't require a reference to that specific instance afterwards from the current scope.
- **Important Note:** While this _does_ create a new object and runs its constructor just like the first method, you **don't have a named variable** to easily refer back to _that specific instance_ later in your code from where you created it. It becomes an "anonymous" object reference at that point. The constructor might have done something useful (like making a window visible or starting a process), but you can't easily call more methods on _that specific instance_ using a variable name after its creation line. Use this method only when you don't plan to reuse or reference that particular instance via a variable.

**In Summary:** Both methods create a new object instance and run its constructor. Assigning the instance to a variable (`ClassName variableName = new ClassName();`) is necessary if you need to interact with that specific object later using `variableName`. Creating it without assignment (`new ClassName();`) is sufficient if the constructor's execution is the only interaction required from the creation point.
