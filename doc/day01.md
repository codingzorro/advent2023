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
