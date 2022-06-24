// return true if the array is sorted either ascending or descending
// consider there are no duplicated numbers

// [] => true
// [42] => true
// [39,42] => true
// [42, 39] => true
// [1,2,3,4,5] => true
// [5,4,3,2,1] => true
// [1,5,2] => false

function sorted(array){
  let ascend = true
  let descend = true

  for (let i = 1; i < array.length; i++){
   if( array[i-1] > array[i]){
    ascend = false
   }
   if( array[i-1] < array[i]){
    descend = false
   }
  }
    return ascend || descend
}

console.log(sorted([]))
console.log(sorted([42]))
console.log(sorted([39,42]))
console.log(sorted([42, 39]))
console.log(sorted([1,2,3,4,5]))
console.log(sorted([5,4,3,2,1]))
console.log(sorted([1,5,2]))