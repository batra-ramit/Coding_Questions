let arr = [
    {name: "A", age: 14, gender: "M"}, 
    {name: "B", age: 34, gender: "M"}, 
    {name: "C", age: 24, gender: "F"}, 
    {name: "D", age: 44, gender: "F"}, 
    {name: "E", age: 44, gender: "M"}, 
    {name: "I", age: 28, gender: "F"}, 
    {name: "G", age: 36, gender: "M"}, 
    {name: "H", age: 47, gender: "F"}
]

//ques3: sum of squares of ages of all valid candidates = hw
let res = arr.filter(v => v.gender == 'F' && v.age >= 20 && v.age <= 30).map(v => v.age * v.age).
reduce(function(pv, cv, ci, oarr){
    return pv + cv;
}, 0);
console.log(res);