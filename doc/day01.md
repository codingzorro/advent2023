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

### Write the tests
It is clear that we need at least two functions:
* `(decode "a1b2c3d4e5f")` shall return `[1 3 5]`
* `(to-int [1 3 5])` shall return `15`

The unit tests for these functions are tagged in this repository as
[morning-01-red](https://github.com/codingzorro/advent2023/tree/morning-01-red).
Note that they fail; i.e, they are "red" according to the TDD terminology.
