Array.prototype.myMap = function (cb) {
    let res = [];

    for (let i = 0; i < this.length; i++) {
        let val = this[i];
        let rv = cb(val, i, this);
        res.push(rv);
    }
    
    return res;
}

let arr = [2, 5, 9, 8, 15, 11, 6];
let sqarr = arr.myMap(function(v, i, oarr){
    console.log(v + "@" + i + "=[" + oarr + "]");
    return v * v;
});

console.log(sqarr);