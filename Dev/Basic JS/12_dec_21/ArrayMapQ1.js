let arr = ["Ramit Batra", "Akash Samal", "Rick Vats","Shivangi Dubey","Khushay Tiwari"];

let ans = arr.map(function (v, i, oarr) {
    
    let temp = v.split(" ");
    return temp[0].charAt(0) + "." + temp[1].charAt(0) + ".";
    
});

console.log(ans);