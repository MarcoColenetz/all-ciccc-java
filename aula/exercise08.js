function always3Spaces(i,j){
  if (i*j < 10) return i*j + ' '
  return i*j
}

for (let i = 0; i <=10; i++){
  let line = ''
  for(let j = 0; j <=10; j++){
    if (i === 0 && j === 0) {
      line = line + 'x   '
    }
    if(i === 0 && j !== 0){
      line = line + ' [' + j + '] '
    }
    if(i !== 0 && j === 0){
      if(i !== 10){
        line = line + '[' + i + ']   '
      } else{
        line = line + '[' + i + ']  '
      }
    }
    if(i !== 0 && j !== 0){
        line = line + '' + always3Spaces(i,j)  + '   '
    }
  }
  console.log(line)
}