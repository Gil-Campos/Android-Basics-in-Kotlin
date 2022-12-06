# Create a birthday message in Kotlin

### Set up your starter code

1. In your browser open, `https://developer.android.com/training/kotlinplayground`.

2. Inside the `fun main()` function, replace the `"Hello, world!"` text with `"Happy Birthday, Rover!"`.

3. Below that, still inside the curly braces, add two more lines to print: `"You are already 5!"` and `"5 is the very best age to celebrate!"`.

Your finished code should look like this.

`fun main() {`

    println("Happy Birthday, Rover!")
    println("You are already 5!")
    println("5 is the very best age to celebrate!")

`}`

4. Run your code.

5. Verify that the output pane shows **Happy Birthday, Rover!** and below that, **You are already 5!** and **5 is the very best age to celebrate!**

### Add a birtday cake

1. In your code, between the two `println()` statements for `Happy Birthday` and `You are already 5`, add the following lines of print statements, as shown below. This creates a cake. The last `println()` statement has no text between the quotes, which prints an empty line.

```
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
```

To help others understand your code, you can add a comment before you print the cake. If you run your code, the output won't look any different, because comments are just information for you and other developers, not commands for the system. An inline comment starts with // followed by text, as shown below.

2. Add a comment before you print the cake `// Let's print a cake!.` and `// This prints an empty line.`

Your code should look like the code below.

```
fun main() {
    println("Happy Birthday, Rover!")
    
    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    
    // This prints an empty line.
    println("")

    println("You are already 5!")
    println("5 is the very best age to celebrate!")
}
```

3. Run your code, and the output should look like below.

```
Happy Birthday, Rover!
   ,,,,,   
   |||||   
 =========
@@@@@@@@@@@
{~@~@~@~@~}
@@@@@@@@@@@

You are already 5!
5 is the very best age to celebrate!
```

Now that we can print a happy birthday message and a cake we need to put a name and age if not this would be half finished so go to "create-use-variables" file.

