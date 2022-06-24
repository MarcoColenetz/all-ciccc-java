function reverse(str) {
  let arrayOfLetters = [...str];
  if (arrayOfLetters.length === 1) return arrayOfLetters[0]
  return arrayOfLetters.pop() + reverse(arrayOfLetters);

}

console.log(reverse('awesome')) //➞ 'emosewa'
console.log(reverse('rithmschool')) //➞ 'loohcsmhtir'
