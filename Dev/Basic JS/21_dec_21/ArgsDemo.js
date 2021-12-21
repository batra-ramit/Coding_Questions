function fn(param1, param2) {
    console.log("output ", param1, " ", param2);
}
fn("hello", "hi");
fn("he");
fn();
fn("hello", "hi", "bye");


function fn1(param1,param2) {
    console.log(arguments);
    console.log("output ", param1, " ", param2);
}

// Arguments is the default array created by default 
// in javasript which takes the parameter values passed
// when the function is called.

fn1("hello", "hi");
fn1("he");
fn1();
fn1("hello", "hi", "bye");