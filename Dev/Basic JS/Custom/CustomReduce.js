Array.prototype.myReduce = function(cb, iv){
    let oarr = this;
    let pv;

    if(iv == undefined){
        pv = oarr[0];
        for(let i = 1; i < oarr.length; i++){
            let cv = oarr[i];
            pv = cb(pv, cv, i, oarr);
        }
    } else {
        pv = iv;
        for(let i = 0; i < oarr.length; i++){
            let cv = oarr[i];
            pv = cb(pv, cv, i, oarr);
        }
    }

    return pv;
}