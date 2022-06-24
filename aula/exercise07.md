function prime(num) {
  for(let i = 2, s = Math.sqrt(num); i <= s; i++)
      if(num % i === 0) return false;
  return num > 1;
}

function countPrimes(n){
  let primeNumber = 0
  for(let i = 0; i <= n; i++){
    if(prime(i)){
      primeNumber = primeNumber + 1
    }
  }
  return primeNumber
}

console.log(countPrimes(100))
