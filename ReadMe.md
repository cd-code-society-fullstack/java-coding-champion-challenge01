## Problem 01

Your task is to write a function that accepts a string `s` as input and returns a boolean value indicating whether the given string can form a palindrome by removing at most one character from it.

A palindrome is a word, number, phrase, or sequence of characters that reads the same backward as forward. This includes ignoring spaces, punctuation, and capitalization.

### Example

**Example 1:**

```
Input: s = "aba"
Output: true
```

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "aba" )

In this example, the input string "aba" is already a palindrome as it reads the same from both ends. So, no character deletion is necessary.

**Example 2:**

```
Input: s = "abca"
Output: true
```

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "abca" )

In this example, by deleting the character 'c', the string "abca" becomes "aba", which is a palindrome.

**Example 3:**

```
Input: s = "abc"
Output: false
```

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "abc" )

In this example, it is impossible to make string "abc" a palindrome by removing at most one character.

### Constraints

- The length of the string `s` is at least 1 and at most 10^5.
- String `s` only contains lowercase English letters.

This problem tests the ability to manipulate strings and understand the properties of palindromes. It requires creating a strategy to find which character, if any, should be removed to create a palindrome.

## Submit

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01)

```
racecar // true
abccba  // true
abccbx // true
abcdcbax // true
abcde  // false
abcda  // true
""     // true
a    // true
ab   // true
abc  // false
```

# Problem 02

## Longest Word Length

Given a string `s` that consists of words and spaces, return the length of the **longest** word in the string. A word is a maximal substring consisting of non-space characters only.

 
**Example 1:**

Input: s = "Hello World from AI"
Output: 5
Explanation: The longest word is either "Hello" or "World" with length 5.

{Try it}(sh .guides/runner.sh javac Problem02.java java -cp . Problem02 "Hello World from AI")

**Example 2:**

Input: s = "   fly me   to   the outer space  "
Output: 5
Explanation: The longest word is "outer" with length 5.

{Try it}(sh .guides/runner.sh javac Problem02.java java -cp . Problem02 "   fly me   to   the outer space  ")

**Example 3:**

Input: s = "exploratory data analysis"
Output: 11
Explanation: The longest word is "exploratory" with length 11. 

{Try it}(sh .guides/runner.sh javac Problem02.java java -cp . Problem02 "exploratory data analysis")

## Solution 

{Try it}(sh .guides/runner.sh javac Problem02.java java -cp . Problem02)

"Hello World from AI"// Output: 5
"   fly me   to   the outer space  " // Output: 5
"exploratory data analysis"  // Output: 11
"The quick brown fox jumps over the lazy dog" // Output: 5
"Pack my box with five dozen liquor jugs" // Output: 5
"How can you tell if a vampire has a cold"  // Output: 6
"") // Output: 0
"single" // Output: 6

# Problem 03

# Are Sentences Anagrams

## Problem

You are given two sentences, `s` and `t`. Your task is to determine if `t` is an anagram of `s`, but this time you're dealing with sentences, not just words. 

An anagram is a word or phrase that is formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

For this problem, ignore spaces and punctuation when determining if one sentence is an anagram of the other, and consider all letters to be lower-case. In other words, `s` and `t` are anagrams if the letters in `s` can be rearranged to form `t` (or vice versa), regardless of spaces and punctuation.

Write a function `areSentencesAnagrams(s, t)` that takes the sentences `s` and `t` as its parameters. It should return `true` if `t` is an anagram of `s`, and `false` otherwise.

The length of both `s` and `t` is at least 1 and at most 5 * 10^4. Both sentences will only consist of lower-case English letters, spaces, and punctuation marks.

## Examples

1. 
   **Input**
    ```js
    areSentencesAnagrams("listen", "silent")
    ```
    **Output**
    ```js
    true
    ```
    **Explanation**: By rearranging the letters of "listen", you can form "silent".

    {Try it}(sh .guides/runner2.sh javac Problem03.java java -cp . Problem03 "listen" "silent")

2. 
    **Input**
    ```js
    areSentencesAnagrams("The Morse Code", "Here come dots")
    ```
    **Output**
    ```js
    true
    ```
    **Explanation**: By rearranging the letters of "The Morse Code", you can form "Here come dots".

    {Try it}(sh .guides/runner2.sh javac Problem03.java java -cp . Problem03 "The Morse Code", "Here come dots")
3. 
    **Input**
    ```js
    areSentencesAnagrams("Hello, world", "Howdy, partner")
    ```
    **Output**
    ```js
    false
    ```
    **Explanation**: No matter how you rearrange the letters of "Hello, world", you can't form "Howdy, partner".

    {Try it}(sh .guides/runner2.sh javac Problem03.java java -cp . Problem03 "Hello, world" "Howdy, partner")

    ## Submit

    node .guides/secure/03-testRunner.js

"I am Lord Voldemort" "Tom Marvolo Riddle"  true
"Dormitory" "Dirty room"  true
"Astronomer" "Moon starer" true
"The public art galleries" "Large picture halls, I bet" false
"One good turn deserves another" "Do rogues endorse that? No, never!"  false

# Problem 04

## Parentheses and Operators Check
Given a string `s` containing digits (0-9), multiplication operators ('*'), division operators ('/'), and parentheses ('(', ')'), check if the string is a valid arithmetic expression.

A string is a valid arithmetic expression if:
- Parentheses are properly matched and nested. That is, every opening parenthesis '(' has a corresponding closing parenthesis ')', and parentheses are properly nested.
- There are no two operators in a row. That is, an operator '*' or '/' must always be surrounded by numbers or parentheses. There should not be two operators without a number or a pair of parentheses between them.

### Example 1:
Input: s = "(3*2)/(4*5)" Output: true

{Try it}(sh .guides/runner2.sh javac Problem04.java java -cp . Problem04 "(3*2)/(4*5)")

### Example 2:
Input: s = "3*2/4*5" Output: true

{Try it}(sh .guides/runner2.sh javac Problem04.java java -cp . Problem04 "3*2/4*5")

### Example 3:
Input: s = "3**2" Output: false

{Try it}(sh .guides/runner2.sh javac Problem04.java java -cp . Problem04 "3**2")

### Example 4:
Input: s = "3*(2/(4*5)" Output: false

{Try it}(sh .guides/runner2.sh javac Problem04.java java -cp . Problem04 "3*(2/(4*5)")

### Constraints:
- 1 <= s.length <= 10^4
- `s` consists of digits, '*', '/', '(', and ')' only.