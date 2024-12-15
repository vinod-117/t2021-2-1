# t2021-2-1

## Problem 1: Calculator Using a Class
- A simple calculator class that supports the following operations: 
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Inputs:
  - `a` (double): First number
  - `b` (double): Second number
  - `operation` (string): Type of operation to perform
- Example usage is provided in the script.

---

## Problem 2: Generate Series of Odd Numbers
- This function generates a series of odd numbers up to a given input `a`.
- Input: Single integer `a`
- Output: A list of odd numbers (1, 3, 5, ...) up to `a`.
- Examples:
  - Input: `a = 4`
  - Output: `[1, 3, 5, 7]`

---

## Problem 3: Generate Series of Odd Numbers (Odd Indices Only)
- This function generates odd numbers based on odd indices up to the input `a`.
- Input: Single integer `a`
- Output: A list of odd numbers (1, 3, 5, ...) considering only odd indices.
- Examples:
  - Input: `a = 5`
  - Output: `[1, 3, 5, 7, 9]`
  - Input: `a = 4`
  - Output: `[1, 3, 5]`

---

## Problem 4: Count Multiples in a List
- This function calculates the count of numbers in a list that are multiples of integers from 1 to 9.
- Input: A list of integers.
- Output: A dictionary where keys are numbers from 1 to 9, and values are counts of their multiples in the list.
- Example:
  - Input: `[1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]`
  - Output: `{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9:1}
