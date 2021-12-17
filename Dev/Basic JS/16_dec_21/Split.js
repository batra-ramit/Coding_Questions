let str = ["My Name is Sumeet Malik.I am a software developer.I beleive in Learning by Doing.I need Courage and Patience"];

let sstr = str.toString();

let sp = sstr.split(".");

console.log(sp);

// let result = sp.reduce(function (pv, cv, ci, oarr) {

//     let val = pv.split(" ");
    
// });

let result = sp.map(function (v) {
    let a = v.split(" ");
    a.reverse();
    let b = a.concat();
    console.log(b);
});

let ab=result.toString();
console.log(ab);