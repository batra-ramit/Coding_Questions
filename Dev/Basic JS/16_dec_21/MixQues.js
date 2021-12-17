let str = "My name is Sumeet Malik. I am a software developer. I believe in learning by doing. I need courage and patience.";

"Malik Sumeet is name My. developer software a am I. doing by learning in believe I. patience and courage need I.";

// without for loops you have to do it.

let res1 = str.split(".");
console.log(res1);

let res2 = res1.filter(s => s.length > 0);
console.log(res2);

let res3 = res2.map(s => s.trim());
console.log(res3);

let res4 = res3.map(s => s.split(" "));
console.log(res4);

res4.map(a => a.reverse()); // it is more relevant to use foreach
console.log(res4);

let res5 = res4.map(a => a.join(" "));
console.log(res5);

let res6 = res5.map(s => s + ".");
console.log(res6);

let res7 = res6.reduce(function(pv, cv){
    return pv + " " + cv;
})

console.log(res7);

// let res = str.split(".").filter(s => s.length > 0).map(s => s.trim().split(" ").reverse().join(" ") + ".").reduce(function(pv, cv){
//     return pv + " " + cv;
// });

// console.log(res);