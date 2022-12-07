# Create a cake with the layers and candles

Here is a picture of the cake you will be baking:

```
 ,,,,,,,,,,,,,,,,,,,,,,,,
 ||||||||||||||||||||||||
==========================
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
```
And here are the instructions:

1. Reset your code in the editor to the `Hello, world!` program.
2. You can remove the argument to `main()`, because you won't be using it.
3. In `main()`, create a variable `age` and set it to 24.
4. In `main()`, create a second variable `layers` and set it to 5.
5. In `main()`, call a function `printCakeCandles()` and pass in the `age`. This will leave you with an error, because you have not created that function yet.
6. Samewise, call a function `printCakeTop()` and also pass in the `age`.
7. Finally, call a function `printCakeBottom()` and pass in the `age` and also the number of `layers`.
8. To get rid of the errors, comment out the three function calls by adding `//` at the beginning of each line, as shown below. This technique allows you to draft your code without triggering errors.
9. Run your program, and it should have no errors and do nothing.

Your `main()` function should look like the code below.

```
fun main() {
    val age = 24
    val layers = 5
    // printCakeCandles(age)
    // printCakeTop(age)
    // printCakeBottom(age, layers)
}
```

### Create printCakeTop()

The `printCakeTop()` function to print the top of the cake, a line of equal signs, is almost the same as the `printBorder()` function you created earlier.

1. Below the `main()` function, add a blank line, and then create a function, `printCakeTop()` that takes one argument, `age`, of type `Int`.
2. Inside, use a `repeat()` statement to print one equal sign `age` times plus 2. The extra two equals signs are so that the candles won't fall off the side of the cake.
3. At the end, when the `repeat()` is done, print an empty line.
4. In `main()`, remove the two `//` symbols from the beginning of the line of code for `printCakeTop()`, because the function now exists.

Here is your finished function.

```
fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}
```

Run your code to see the top of the cake.

### Create printCakeCandles()

Each candle is made up of two symbols: a comma (,) for the flame, and a vertical line (|) for the candle body.

To accomplish this in one function, put two `repeat()` statements, one for the flames and one for the bodies, into your function.

1. Below the `main()` function and the `printCakeTop()` function, create a new function, `printCakeCandles()` that takes one argument, `age`, of type `Int`.
2. Inside, use a `repeat()` statement to print one comma , for the flame.
3. Repeat this `age` times.
4. At the end, print an empty line.
5. Add a print statement to print one space for insetting the candles.
6. Below, repeat the steps to create a second `repeat()` statement to print the candle bodies with a vertical line |.
7. At the end, print a new line, using `println()`.
8. In `main()`, remove the two `//` symbols from the beginning of the line of code for `printCakeCandles()`.

Here is your finished function.

```
fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }    
    println() // Print an empty line   
 
    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}
```

### Create printCakeBottom()

In this function, you are drawing a cake bottom that is as wide as `age + 2`, and you draw it for a height of a given number of layers.

```
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
```
This means your function needs two arguments, one for the width (`age`) and one for the height (`layers`).

To print the bottom of the cake, you first repeat the ‘at' @ symbol `age + 2 times` to print one layer. Then, you repeat printing one layer `layers` times.

#### Draw the at symbol age+2 times to create a layer

Below the existing functions, create a function `printCakeBottom()` with two arguments, `age` and `layers`, both of type `Int`.

Inside the function, use a `repeat()` statement to print one layer of ‘at' @ symbols `age + 2` times. Finish by printing an empty line, as shown below.

```
fun printCakeBottom(age: Int, layers: Int) {
    repeat(age + 2) {
        print("@")
    }
    println()
}
```

In main(), remove the two `//` symbols from the beginning of the line of code for `printCakeBottom(age, layers)`.

#### Nested repeat() statements

This is something neat you can do with repeat() statements. You can put one repeat() statement inside another repeat() statement. So you could create a repeat() statement within a repeat() statement to print the symbol a certain number of times for a certain number of layers.

Put a second `repeat()` statement around all of the code inside the function. Repeat this loop `layers` times.

In `main()`, remove only the two `//` from the line of code for `printCakeBottom()`.

Solution for `printCakeBottom()`.

```
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}
```

Congratulations! You've just finished a pretty complex program with several functions and a nested `repeat` statement. And your cake will always have the right number of candles!

The final output of your program should be:

```
 ,,,,,,,,,,,,,,,,,,,,,,,,
 ||||||||||||||||||||||||
==========================
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
```

To get a summary of all the content of this section go to the file named "summary" part.
