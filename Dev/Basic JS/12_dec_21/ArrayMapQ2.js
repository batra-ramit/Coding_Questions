let arr = [
    {
        gender: 'M',
        age: 24
    },
    {
        gender: 'F',
        age: 34
    },
    {
        gender: 'F',
        age: 28
    },
    {
        gender: 'M',
        age: 74
    },
    {
        gender: 'F',
        age: 31
    },
    {
        gender: 'M',
        age: 47
    },
    {
        gender: 'F',
        age: 26
    },
    {
        gender: 'M',
        age: 47
    },
    {
        gender: 'F',
        age: 47
    },
    {
        gender: 'F',
        age: 19
    },
    {
        gender: 'M',
        age: 20
    }
];



// Use the map function to produce the below output
// return an array with true and false for females between 20 and 30
// let us say xyz corp wants to hire females between age >= 20 and <= 30

// let output = arr.map(function (v, i, oarr) {
   
//     if (v.gender == 'F' && v.age >= 20 && v.age <= 30)
//         return true
//     else 
//         return false

// });

// console.log(output);

let sl2 = arr.map((v, i, oarr) => v.gender == 'F' && v.age >= 20 && v.age <= 30);
console.log(sl2);