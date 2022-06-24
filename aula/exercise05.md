function isPalindrome(str) {
  let arrayOfLetters = [...str];
  if (arrayOfLetters.length <= 1) return true
  return (arrayOfLetters.shift () === arrayOfLetters.pop()) && isPalindrome(arrayOfLetters);

}

console.log(isPalindrome('awesome')) //false
console.log(isPalindrome('foobar')) //false
console.log(isPalindrome('tacocat')) //true
console.log(isPalindrome('amanaplanacanalpanama')) //true
