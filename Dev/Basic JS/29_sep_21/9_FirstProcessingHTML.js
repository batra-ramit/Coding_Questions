let minimist = require("minimist");
let jsdom = require("jsdom");
let fs = require("fs");

// node 9_FirstProcessingHTML.js --source=download.html
let args = minimist(process.argv);
fs.readFile(args.source,"utf-8",function(err,html) {
    let dom = new jsdom.JSDOM(html);
    let document = dom.window.document;
    let descs = document.querySelectorAll("div.match-info > div.description");
    for(let i = 0; i < descs.length; i++){
        console.log(descs[i].textContent);
    }
}
)