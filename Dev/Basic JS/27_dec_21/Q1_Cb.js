// Array.prototype.processStrings = function(sscb,lscb,criteria) {
//     let oarr = this;
//     for (let i = 0; i < oarr.length; i++){
//         let str = oarr[i];
//         if (str.length > criteria)
//             lscb(str);
//         else
//             sscb(str);
//     }
//     return this;
// }

// let arr = [
//     "My name is Sumeet Malik. I am a teacher. I teach programming.",
//     "India won in Australia. England won't.",
//     "India has gone to SA. India started well. But it rains.",
//     "Lorem ipsum dolor. ipsum dolor lorem.",
// ];

// arr.processStrings(handleShortString, handleLongString, 40);


handleLongString("My name is Sumeet Malik. I am a teacher. I teach programming.");

function handleShortString(str) {
    
    let res1 = str.split(".");
    let res2 = res1.map(s => s.trim());
    let res3 = res2.filter(s => s.length > 0);
    let res4 = res3.map(s => s.split(" "));
    let res5 = res4.map(s => s.reverse());
    let res6 = res5.map(a => a.join(" "));
    let res7 = res6.join(". ");
    console.log(res7+".");


}

function handleLongString(str) {
    
}