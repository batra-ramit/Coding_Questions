
let arr=[
    {name:"A",age:24,gender:"M"},
    {name:"B",age:25,gender:"F"},
    {name:"C",age:26,gender:"M"},
    {name:"D",age:27,gender:"F"}
];
    
let ans = arr.filter((v, i, oarr) => v.gender == 'F').map((v, i, oarr) => v.age);
console.log(ans);