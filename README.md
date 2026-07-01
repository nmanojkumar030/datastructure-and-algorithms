# Data Structures and Algorithms

A Java practice repository covering core data structure implementations, algorithm patterns, and standalone problem-solving exercises.

## Project Structure

```
src/main/java/
├── datastructures/         # Core data structure implementations
│   ├── linkedlist/         # Singly linked list with insert/remove operations
│   ├── stack/              # Stack via array and linked list
│   ├── queue/              # Queue operations
│   ├── tree/               # Binary tree with in-order traversal
│   └── trie/               # Trie insert and search
│
├── algorithms/
│   └── sorting/            # Bubble sort (standard and optimised)
│
├── pattern/                # Problems organised by algorithmic pattern
│   ├── arrays/
│   │   ├── slidingwindow/  # Fixed and variable window problems
│   │   ├── twopointers/    # Two-pointer and three-sum problems
│   │   └── sorting/        # Sort-based array problems
│   ├── binarySearch/       # Order-agnostic search, floor/ceiling, bitonic array
│   ├── breadthfirstsearch/ # Level-order, zigzag, reverse level traversal
│   ├── cyclicsort/         # Missing/duplicate number variants
│   ├── depthfirstsearch/   # Path sum, all paths, sequence check
│   ├── fastandslowpointer/ # Cycle detection, middle of list, happy number
│   ├── kwaymerge/          # Merge K sorted lists
│   ├── magicallookups/     # HashMap-based lookup problems
│   ├── mergeintervals/     # Merge, insert, intersect intervals
│   ├── priorityqueues/     # K largest/smallest, top-K frequent, two heaps
│   ├── recognizingpatterns/# Dynamic programming pattern recognition
│   ├── reverselinkedlist/  # Reverse full list, sub-list, every K elements
│   ├── strings/            # String manipulation (reverse vowels, etc.)
│   └── subsets/            # Subset generation
│
└── practice/               # Standalone problems by topic
    ├── arrays/             # Second smallest, middle element, next greatest, frequency
    ├── strings/            # Anagram detection/grouping, palindrome, first non-repeating char
    ├── math/               # FizzBuzz, number reverse, trailing zeros, student average
    └── frequency/          # Most frequent IP address
```

## Getting Started

**Prerequisites:** Java 11+, Maven 3.x

```bash
# Build
mvn compile

# Run all tests
mvn test
```

## Tech Stack

- Java 11
- JUnit 5
- Maven
