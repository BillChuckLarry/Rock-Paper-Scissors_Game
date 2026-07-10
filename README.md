# Java Rock, Paper, Scissors Game

A console-based implementation of the classic **Rock, Paper, Scissors** game written in Java. The player competes against the computer, which generates a random move each round. The program determines the winner based on the traditional game rules.

---

## Features

* Play against a computer opponent
* Random computer move generation
* User input validation
* Determines the winner based on standard Rock, Paper, Scissors rules
* Displays game results in the console
* Beginner-friendly implementation using core Java concepts

---

## Technologies

* **Language:** Java
* **IDE:** Eclipse (or any Java IDE)
* **Libraries:**

  * `java.util.Scanner`
  * `java.util.Random`

---

## Concepts Demonstrated

* Console input using the `Scanner` class
* Random number generation with the `Random` class
* Conditional logic using `if-else` statements
* Boolean expressions
* User input validation
* Program control flow

---

## How the Game Works

1. The player selects one of the following options:

   * `0` = Rock
   * `1` = Paper
   * `2` = Scissors
2. The computer randomly selects one of the three options.
3. The program compares both choices.
4. The result is displayed:

   * Win
   * Lose
   * Tie

---

## Game Rules

* Rock defeats Scissors
* Scissors defeats Paper
* Paper defeats Rock
* Matching choices result in a tie

---

## Example Output

```text id="z1n8yi"
Enter your choice
0 = Rock, 1 = Paper, 2 = Scissors

0

Computer chose: 2

You win the game! Congratulations on winning RPS
```

---

## Project Structure

```text id="f0jhtb"
day4/
└── RockPaperScissorGame.java
```

---

## Future Enhancements

* Fix the input validation to correctly accept values **0–2**.
* Display the names of the choices (Rock, Paper, or Scissors) instead of only numbers.
* Allow players to play multiple rounds without restarting the application.
* Keep score across multiple rounds.
* Add a "Best of 3" or "Best of 5" game mode.
* Refactor the game logic into reusable methods for improved readability and maintainability.
* Replace numeric input with text input (Rock, Paper, or Scissors).
* Create a graphical user interface (GUI) using JavaFX or Swing.

---

## Skills Demonstrated

* Java fundamentals
* Console application development
* Random number generation
* Conditional programming
* User input validation
* Decision-making algorithms
* Problem solving

---

## Author

**William Lawrence**

This project was created as part of my Java programming portfolio to demonstrate proficiency with console applications, random number generation, conditional logic, and user interaction using core Java.
