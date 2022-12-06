# Print a birthday banner with a border

You will create a birthday banner, and then learn how to simplify that code using techniques for repeating and reusing code, and why that is a good thing.

### Create a starter birthday banner

Go to the following link `https://developer.android.com/training/kotlinplayground` and delete all the code that is already there afther that copy-paste the code below into the editor.

```
fun main() {
    println("=======================")
    println("Happy Birthday, Jhansi!")
    println("=======================")
}
```

Run your program to see a banner printed in the console.

### Create a function for printing the border

The code that you just pasted and ran is a function called `main()` that contains three print statements your Kotlin program always has to have a `main()` function. In addition, you can create and use functions of your own. Just like variables help avoid duplication work, functions can help you avoid writing the same code multiple times. Let's create and use a function for printing those borders.

In the editor the `main`  function, insert an empty line, just to give you some room to work. Create a function. Start with the `fun` keyword, followed by a name, `printBorder`, a pair of parentheses `()`, and a pair of curly braces `{}`.

```
fun printBorder() {}
```

Notice how the name of the function printBorder starts with a lower-case letter and a verb. Function names almost always start with a lowercase letter, and a verb, and the name should describe what the function does also that the second word inside the name starts with uppercase. This style is called "camel case", and makes names much easier to read.

Inside the main() function, copy the print statement for the border and paste it between the curly braces of the printBorder() function.

Your finished printBorder() function should look like this.

```
fun printBorder() {
    println("=======================")
}
```

To use or call, a function, use its name with parentheses. Notice that this is how you have been using println()! So to use the printBorder function, call printBorder()anywhere in your code that you need to.

In the main() function, replace the lines of code that print a border line using println() with calls to the printBorder() function. Your finished code should look like this.

```
fun main() {
    printBorder()
    println("Happy Birthday, Jhansi!")
    printBorder()
}

fun printBorder() {
    println("=======================")
}
```

### Repeat a border pattern

Looking at the border line, it's really the same symbol all over again. So, instead of saying:

"Print this string of 23 symbols"

you could say,

"Print this 1 symbol 23 times".

In code, you do this by using a repeat() statement.

In the printBorder() function, use a repeat() statement to print the equal sign 23 times and Instead of using println(), use print(), so that you do not jump to a new line after printing each "=" after done printing add a println() statement to print a newline.

Here is the code.

```
fun printBorder() {
    repeat(23) {
        print("=")
    }
    println()
}
```

The code in the main() function does not change, and your entire program should look like this.

```
fun main() {
    printBorder()
    println("Happy Birthday, Jhansi!")
    printBorder()
}

fun printBorder() {
    repeat(23) {
        print("=")
    }
    println()
}
```

Run your code. The output should be the same as before, but this time, you were able to create the border by specifying the "=" symbol only once!

### Use arguments to change the border 

You could define a separate function for each of these different symbols. However, there is a more efficient way to do this. You can reuse the function you already wrote and make it more flexible, so that it works for different kinds of symbols.

A cool thing about functions is that you can give them input using arguments. In main(), at the top, create a variable called border for the border pattern `val border = "%"`. This will hold text to repeat for the border.

Now, pass that `border` variable into both calls to the `printBorder()` function as an argument. You do this by placing border inside the parentheses `()`, just like when you supplied text for `println()` to print.

Your main() function should look like the code below.

```
fun main() {
    val border = "%"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}
```

The `printBorder()` function is going to take the value of this border as an input and figure out how to print out the full border.

Run your code.Your code does not execute, and instead, you see error icons next to your code, the message indicates where the error is, and gives you a hint as to what it might be. The important part is: `Too many arguments for public fun printBorder()`. You are calling the `printBorder()` function and passing a border as input. However, the `printBorder()` function definition does not accept any input at the moment.

Fix this error by adding an argument for the border to the `printBorder()` function definition the word String, which is a description of what kind, or type, of argument this is. 

A String is a piece of text made up of characters surrounded by quotes. You can think of it as beads lined up on a string to form a necklace, like, characters lined up to form words and text. Specifying that the argument has to be a String helps the system enforce that your argument is text, and not, for example, a number.

See the first line of code as shown below.

```
fun printBorder(border: String) {
    repeat(23) {
        print("=")
    }
    println()
}
```

Run your code. The printBorder() function now accepts a border String as input. And the code in main()calls printBorder(border) with border as the argument. Your code should run without errors.

Look at the output of your program in the Console and it still shows the same border as before? This is not the intended behavior! You tried to make a border with the "%" symbol, but the program is still printing a border with the "=" symbol. In the next steps, you will investigate why this is happening.

Change the printBorder() function to use the passed in border instead of printing the "=". This works exactly the same as if border was a variable that you defined inside the function!

```
fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}
```

Great job, you fixed the problem! Here is your finished code.

```
fun main() {
    val border = "%"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}
```

