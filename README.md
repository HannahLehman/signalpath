

# Hannah Lehman's Application to SignalPath, LLC.
## Platform Engineering Code Assessment
### 1. Language ranks, according to production usage:
  * C# => 1
  * Node.js => 1
  * Angular => 1
  * Ruby => 1
  * React => 1
  * JQuery => 3
  * Python => 3
  * PHP => 3
  * Scala => 4
  * Clojure => 4
  * Haskell => 4
  * Golang => 4
  * Perl => 4
  * Java => 4
  * Chef => 4

### 2. Hexadecimal string to base64 Converter:
I chose to complete this exercise using the [Commander](https://pusher.com/tutorials/node-command-line-app) node package that allows for easy command line execution of simple methods. The raw solution can be found in the [./hex_converter/src/commands.js](https://github.com/HannahLehman/signalpath/blob/master/hex_converter/src/commands.js#L2) file. Steps to run this are as follows:

    // Dependencies: node.js
    cd signalpath/hex_converter
    npm install
    node src/index.js convert [yourHexValue] // -> base64 result!


### 3. Python -> Scala Recursion Exercise
After exercise #2, I got a little command-line crazed. So I decided to approach this problem similarly. After spending some time reading about, practicing, and understanding the basics of Scala, I opted to use [Scala sbt](https://docs.scala-lang.org/getting-started-sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html) to run and compile my code.

My raw solution for this problem can be found in the [Main.scala](https://github.com/HannahLehman/signalpath/blob/master/specialMath/yay_recursion/src/main/scala/Main.scala) file. First things first: this is admittedly only a partial solution. Approaching the problem iteratively, I found that I was able to convert the code into scala, up until a point. More specifically, the solution provided is missing the second layer of recursion... everything up to and including:

    return n + specialMath(n-1) // Missing: + specialMath(n-2)

To run:

    // Dependencies: jdk, sbt
    # sbt

Edit [this method](https://github.com/HannahLehman/signalpath/blob/master/specialMath/yay_recursion/src/main/scala/Main.scala#L21) to take the arguments you wish to test:
ex: specialMath(INT) // INT = someInteger

    # ~run

Code will compile, and you will see your answer in the console.

#### Other things I tried.
This is by no means an exhaustive list! It also does not account for the following methods:
* Spelling it out (longhand)
* Phoning a friend ("friend" == Google)
* Everything in reverse.
* Pacing
* Cake, popcorn, doggo pets

    // solution to: x + iterator(x - 1)
`iterator(x - 1, result1 + x)`


    // solution to: iterator(n - 1) + iterator(n - 2)
`else iterator(n - 1, next, (next + previous))`


    // Does specialMath(7) -> 78 mean I'm super close?
`def iterator(x: Int, result1: Int, result2: Int): Int =`
     `if (x == 0) 0`
      `else if (x == 1) result1`
      `else iterator(x - 1, result1 + result2, result1 + x)`
    `println(iterator(7, 0, 1))`
