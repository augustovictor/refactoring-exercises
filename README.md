# refactoring-exercises

## Long method

- `Extract method` [DIFF](https://github.com/augustovictor/refactoring-exercises/commit/bc6b1cf6fc4c4cf907486a8f0f667caba62990b0?diff=split);
    - Name the value to be returned as `result`;
- Reduce local variables and parameters:
    - To reduce local variables use `Replace temp with query`;
    - To reduce parameters use `Introduce parameter object` or `Preserve whole object`;
- If the previous steps did not work as expected use `Replace method with method object`;
- Conditionals and loops;
    - Simplify conditionals with `Decompose conditionals`;
    - Simplify loops with `Extract method`;