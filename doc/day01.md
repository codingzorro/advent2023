# Day 1
This page shows how to approach a simple but conventional (i.e., "not
functional") program like the one described for [the first day of the Advent of
Code 2023](https://adventofcode.com/2023/day/1).

## Morning
These are the requirements in a nutshell:

* loop over the given set of lines
* for each line calculate the so-called calibration
* calculate the total sum of those calibrations

The calibration is a two-digit number "encrypted" in each line:

* a line looks like `a1b2c3d4e5f`
* extract all digits contained in the line: 1, 3 and 5 in this case
* take the first and the last one to get the calibration: 15 in this case

**Note:** We will start by implementing the calibration and only after that we
will implement the "main loop" to accumulate the sum of calibrations.

### Step 1: Write the tests
It is clear that we need at least two functions:
* `(decode "a1b2c3d4e5f")` shall return `[1 3 5]`
* `(to-int [1 3 5])` shall return `15`

The unit tests for these functions are tagged in this repository as
[morning-01-red](https://github.com/codingzorro/advent2023/tree/morning-01-red).
Note that they fail; i.e, they are "red" according to the TDD terminology.

### Step 2: Go from "green" to "red"
Tag [morning-01-green](https://github.com/codingzorro/advent2023/releases/tag/morning-01-green)
implements the functions needed to pass the existing tests

### Step 3: Go back to "red"
With the existing code, we can calculate the calibration of each line.  Now
we can start writing the "main program": take a list of lines and get the total
sum of the calibration of each line:

* we write the test
* we write a skeleton of the function meant to pass the test
* we verify that we are in a "red" phase again.

Tag [morning-01-red-again](https://github.com/codingzorro/advent2023/releases/tag/morning-01-red-again)
marks the repository's state after these steps have been implemented.

### Step 4: Implement the "loop" to go to "green" again
Tag [morning-01-green-again](https://github.com/codingzorro/advent2023/releases/tag/morning-01-green-again)
marks the state after implementing the loop using the `reduce` funcion.

### Step 5: Get the input data from a file
Now we are able to calculate the calibration using the text lines provided for
explanation purposes. However, to earn the first star we must calculate the
calibration for all lines stored in a file.  We will write a function called
`parse-aoc-file` (for "parse Advent of Code file") and - since it will be used
on several days - store it in a separate file called `utils.clj`.  Besides, we
will store the sample input given in the problem description as a file to test
`parse-aoc-file`.  The code which implement this has two tags: `0.2.0` and
`day01-morning`.

## Afternoon
The difference between morning and afternoon is the decoding function.

### Step 1: Parameterize the current `decode` function
No need to write a new unit test here.
