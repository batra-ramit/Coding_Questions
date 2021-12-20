Array.prototype.myFlat = function(td){
    let oarr = this;
    let res = [];

    customFlat(oarr, td, res);

    return res;
}
function customFlat(node, td, res) {
    if(Array.isArray(node)){
        if(td > 0){
            for(let i = 0; i < node.length; i++){
                customFlat(node[i], td - 1, res);
            }
        } else {
            for(let i = 0; i < node.length; i++){
                res.push(node[i]);
            }
        }
    } else {
        res.push(node);
    }
}