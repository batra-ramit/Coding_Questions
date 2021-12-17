// Easy searching = indexOf, lastIndexOf, includes
// Complex searching = find, findIndex
// Complex searching and all filtered values = filter

// 
let arr = [10, 20, 30, 40, 50, 60, 60, 50, 40, 30, 20, 10];

let ioRes = arr.indexOf(30); // firstIndex or -1
let lioRes = arr.lastIndexOf(30); // last index or -1
let iRes = arr.includes(30); // true or false

// give me the first value above 50
let fRes = arr.find(function(v, i, oarr){
    return v > 50;
})

// give me index of first value above 50
let fiRes = arr.findIndex(function(v, i, oarr){
    return v > 50;
})

// give me all values above 50
let fltrRes = arr.filter(function(v, i, oarr){
    return v > 50;
})

console.log(ioRes);
console.log(lioRes);
console.log(iRes);
console.log(fRes);
console.log(fiRes);
console.log(fltrRes);