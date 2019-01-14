# refactoring-exercises

## Long method

- `Extract method`;
- Reduce local variables and parameters:
    - To reduce local variables use `Replace temp with query`;
    - To reduce parameters use `Introduce parameter object` or `Preserve whole object`;
- If the previous steps did not work as expected use `Replace method with method object`;
- Conditionals and loops;
    - Simplify conditionals with `Decompose conditionals`;
    - Simplify loops with `Extract method`;