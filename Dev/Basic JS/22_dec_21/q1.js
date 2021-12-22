function outer() {
    var arr = [];
    for (var i = 0; i < 3; i++){
        arr.push(function () {
            console.log(i);
        })
    }
    return arr;

}

var arr = outer();
arr[0]();
                                                                                                                                                                                                                                                                                     
arr[1]();

arr[2]();