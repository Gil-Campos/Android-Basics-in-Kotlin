# Modify your program

### Change the Hello World code

Let's change the program to make it do something a little different.

1. Change the `"Hello, world!"` text to say `"Happy Birthday!"`.

2. Run your program by clicking the blue or green run button at the top right.

3. At the bottom, you should now see `Happy Birthday!` printed, as shown below.

    `Happy Birthday!`

At this point you might not know or even understand how this works and that's ok... let me expain it to you.

### How does it work?

This seems like a lot of code just to print something!

Well, if you wanted to a friend to write "Hello, world!" on a piece of paper, there is a lot of implied information. If you just tell them, "Write ‘Hello world!' on this piece of paper", they are going to make assumptions about the information you left out.

The computer does not make these assumptions, so you have to give precise instructions that include every step.

Just like the English language has structure, so does a programming language. If you've ever learned another language, you know the challenge of learning the grammar, the spelling, perhaps a new alphabet of symbols, and the vocabulary. Learning to program has similar challenges, but fortunately, it is less complex and a lot more logical than learning, for example English.

### Understand the parts of the program

Now take a look at the code. Each piece of this program serves a specific purpose, and you need all the pieces in order to be able to run the program. Let's disect all we have done:

- `fun` : stands for function. A function is a section of a program that performs a specific task.

- `fun main` : is the name of this function. Functions have names, so they can be distinguished from each other. This function is called main, because it is the first, or main, function that is called when you run the program. Every Kotlin program needs a function named main.

- `fun main()` : Inside the parentheses, you can put information for the function to use. This input to the function is called "arguments" or args for short. You will learn more about arguments later.

- `fun main() {}` : Notice the pair of curly braces {} after the parentheses. Inside a function is code that accomplishes a task. These curly braces surround those lines of code.

The smallest Kotlin program.

`fun main() {`

    println("Happy Birthday!")

`}`

Congratulations, you have run and changed your first Kotlin program!