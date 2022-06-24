let input1 = [3,11, 7, 2, 9, 10]
let input2 = [-1,110, 1, 1, 0]

function sumArray(values){
    let sum = 0
    values.map((value) => sum = sum + value)
    return sum
}

console.log(sumArray(input1))
console.log(sumArray(input2))
