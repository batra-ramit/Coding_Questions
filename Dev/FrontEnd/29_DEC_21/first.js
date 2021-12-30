


(function(){
    console.log("hi");
    let btn = document.querySelector("#myFirstButton");
    let h1 = document.querySelector("h1");
    btn.addEventListener("click", function () {
        h1.style.color = "green";
    });
    btn.addEventListener("mouseover", function () {
        h1.style.color = "blue";
    });
    btn.addEventListener("mouseout", function () {
        h1.style.color = "black";
    });
})()


