function factorialRecursive(n) {
  if (n == 0) {
      return 1;
  }
      return n * factorialRecursive(n - 1);
}

console.log(factorialRecursive(2));
console.log(factorialRecursive(5));
console.log(factorialRecursive(9));


// 5! = 5 * 4 * 3 * 2 * 1 = 120