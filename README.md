# refactoring-exercises

## Long method

- Add spaces
- `Extract method` [DIFF](https://github.com/augustovictor/refactoring-exercises/commit/bc6b1cf6fc4c4cf907486a8f0f667caba62990b0?diff=split);
    - Name the value to be returned as `result`;
- Reduce local variables and parameters:
    - To reduce local variables use `Replace temp with query` [DIFF](https://github.com/augustovictor/refactoring-exercises/commit/48b2fc463b6a8cee661c5fa703ada45910eb24c3);
    - To reduce parameters use `Introduce parameter object`[DIFF](https://github.com/augustovictor/refactoring-exercises/commit/c1d1f5d7fa935e8616bcb7ad4feb3ef6f65f3e90) or `Preserve whole object`[DIFF](https://github.com/augustovictor/refactoring-exercises/commit/0694104807438d26c2302c97866018d91260db32);
- If the previous steps did not work as expected use `Replace method with method object`;
- Conditionals and loops;
    - Simplify conditionals with `Decompose conditionals`;
    - Simplify loops with `Extract method`;