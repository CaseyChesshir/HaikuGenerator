# HaikuGenerator
This is a program to generate Haikus based on @Alexandstein's Python implementation.

========
HaikuGenerator.java
========
Prints out three lines of a Haiku.
The first line has words adding up to five total syllables. 
The second line up to seven.
And the third line with five again.

========
Word.java
========
A Word object is a basic tuple with a string data attribute and an integer representing the number of syllables in that word. 
This may be extended to accept a "part of speech" attribute. This will allow for more understandable haikus.

========
Usage:
========
Compile and run with:

$javac HaikuGenerator.java Word.java

$java HaikuGenerator < dictionary.txt > output.txt


master build status:
[![Build Status](https://travis-ci.org/CaseyChesshir/HaikuGenerator.png?branch=master)](https://travis-ci.org/CaseyChesshir/HaikuGenerator)

develop build status:
[![Build Status](https://travis-ci.org/CaseyChesshir/HaikuGenerator.png?branch=develop)](https://travis-ci.org/CaseyChesshir/HaikuGenerator)
