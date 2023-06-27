#!/bin/bash

# Compile the Java file
"$1" "$2"

# Shift the first two arguments away
shift 2

# Run the Java program with the remaining arguments
"$@"
