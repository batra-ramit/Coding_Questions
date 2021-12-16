let arr = [5, 83, 24, 67, 71, 12, 24, 7];

// let sqr = arr.map((v) => v * v);
// console.log(sqr);

let res = arr.filter((v) => v * v <= 1000).map((v) => v * v * v);

let res2 = arr.map((v) => v * v * v).filter((v)=> v < 10000);
console.log(res2);