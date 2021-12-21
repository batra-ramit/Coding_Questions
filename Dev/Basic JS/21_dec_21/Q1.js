function f() {
    console.log(arguments);
}

function f(a, b) {
    return a + b;
}

console.log(f(2, 3, 4, 5));

function f(a, b, c, d) {
    return a + b + c + d;
}

console.log(f(2, 3, 4, 5));