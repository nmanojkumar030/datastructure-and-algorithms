# CLAUDE.md

## Project

Java DSA practice repo. Problems are organised into three top-level categories under `src/main/java/`:

- `datastructures/` — implementations of core data structures (linked list, stack, queue, tree, trie)
- `algorithms/` — algorithm implementations (currently just sorting)
- `pattern/` — LeetCode-style problems grouped by algorithmic pattern (sliding window, two pointers, BFS, DFS, etc.)
- `practice/` — standalone problems grouped by topic (arrays, strings, math, frequency)

Tests mirror the same package structure under `src/test/java/`.

## Build & Test

```bash
mvn compile       # compile only
mvn test          # run all tests
```

## Known Pre-existing Failures

`pattern.arrays.twopointers.PairWithTargetSumTest` has 4 failing tests due to bugs in the implementation, not the test setup. Do not treat these as regressions.

## Conventions

- Each problem is a self-contained class; no shared utilities across packages
- Test class names match source class names with a `Test` suffix
- Package name must match directory path (standard Java convention)
- New problems go into the most specific matching package — prefer `pattern/<pattern-name>/` for pattern-based problems, `practice/<topic>/` for everything else
