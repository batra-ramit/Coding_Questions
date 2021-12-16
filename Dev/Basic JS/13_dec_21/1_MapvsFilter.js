let arr = [11, 16, 18, 17, 23, 42, 11, 37];

let mres = arr.map(v => v % 2 == 1);
let fres = arr.filter(v => v % 2 == 1);

console.log(mres);
console.log(fres);