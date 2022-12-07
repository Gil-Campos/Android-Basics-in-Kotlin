# Create and use variables

### Store Rover's age in a variable

1. If you have been following the code so far, notice how you are repeating the same age number twice.

Instead of repeating this number, you could store it in one place, as a variable. It's like putting your number into a box and giving it a name. Then you can use this variable name any time you need the value. And, if the age changes, you only have to change your program in one place. By changing the variable, the correct value for the age is printed everywhere the variable is used.

2. In your program, as the first line of code inside the `main()` function, add the following code to create a variable `val age = 5`.

This line means:

- `val` is a special word used by Kotlin, called a keyword, indicating that what follows is the name of a variable.

- `age` is the name of the variable.

- `=` makes the value of age (on its left) be the same as the value on its right. In math, a single equal sign is used to assert that the values on each side are the same.

```
IMPORTANT: A variable declared using the val keyword can only be set once. You cannot change its value later in the program.

You can declare a changeable variable with the var keyword, which you will do in a later.
```

To use a variable inside a print statement, you need to surround it with some symbols that tell the system that what comes next is not text, but a variable. Instead of printing text, the system needs to print the value of the variable. You do this by putting your variable inside curly braces preceded by a dollar sign, like in the example below.

`${variable}`

In your code, replace the number 5 in both print statements with the age variable as shown below.

`println("You are already ${age}!")`

`println("${age} is the very best age to celebrate!")`

Run your code, and both messages should show the same age.

### Put text into a variable

You can not only put numbers into variables, but also text.

1. Below the variable for age, add a variable called name for the name of the birthday person and set its value to "Rover".

2. Replace the name Rover in the birthday message with the variable.

And you can have more than one variable in a print statement.

3. Add Rover to the age message, using the name variable.

Your completed code should look similar to this.

```
fun main() {
    
    val age = 5 * 365
    val name = "Rover"
    
    println("Happy Birthday, ${name}!")
    
    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    
    // This prints an empty line.
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}
```
Congratulations! You can now create messages with text, graphics created from symbols, use variables to store numbers and text, and print text using variables.

To go to the next section please open "print-birthday-banner" there you will learn to simplify code using techniques for repeating and reusing code.

