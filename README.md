# NameManage

## Description

**NameManage** is a simple Java application that takes three names as input from the user using a graphical interface (`JOptionPane`).
It processes each name and generates a formatted string based on specific substring rules, then displays the result in uppercase.

---

## How It Works

1. The program prompts the user to enter:

   * First name
   * Second name
   * Third name

2. For each name:

   * It extracts:

     * The second character
     * The last two characters
   * Then formats it like:

     ```
     X.YZ
     ```

3. Finally:

   * Combines the three processed names using underscores (`_`)
   * Converts everything to uppercase
   * Displays the result in a dialog box

---

## Example

### Input:

```
First name: Julian
Second name: Andres
Third name: Lopez
```

### Output:

```
U.AN_N.ES_O.EZ
```

---

## Technologies Used

* Java
* Swing (`JOptionPane` for GUI input/output)

---

## How to Run

1. Make sure you have Java installed:

   ```
   java -version
   ```

2. Compile the program:

   ```
   javac NameManage.java
   ```

3. Run the program:

   ```
   java NameManage
   ```

---

## Important Notes

* The program assumes that each name has at least 3 characters.
* If invalid input is provided (e.g., very short strings or canceling input), the program:

  * Shows an error message
  * Restarts itself

---

## Possible Improvements

* Validate input length before processing
* Handle null values when the user cancels input
* Improve error messages (currently says "Please, enter right numbers")
* Replace recursion (`main(args)`) with a loop for better practice

---

## License

This project is for educational purposes and is free to use and modify.

---

## Author

Julian Restrepo
