// the purpose of this project is to extract information of 2019 Cricket WorldCup using Javascript and external libraries
//  from cricinfo and present that in the form of excel and pdf scorecards
// the real purpose is to learn how to extract information and get experience with js
// A very good reason to ever make a project is to have good fun

// npm init -y
// npm install minimist
// npm install axios
// npm install jsdom
// npm install excel4node
// npm install pdf-lib

// node 1_CricinfoExtracter.js --excel=Worldcup.csv --dataFolder=data --source=https://www.espncricinfo.com/series/icc-cricket-world-cup-2019-1144415/match-results 

let minimist = require("minimist");
let axios = require("axios");
let jsdom = require("jsdom");
let excel4node = require("excel4node");
let path = require("path");
let fs = require("fs");
let pdf=require("pdf-lib");

let args = minimist(process.argv);

let AxiosResponse = axios.get(args.source);
AxiosResponse.then(function (response) {


    let html = response.data;
    let dom = new jsdom.JSDOM(html);
    let document = dom.window.document;

    let MatchArr = [];

    let matchdivs = document.querySelectorAll("div.match-score-block");
    for (let i = 0; i < matchdivs.length; i++){
        
        let matchdiv = matchdivs[i];

        let MatchJS0 = {
            t1: "",
            t2: "",
            t1_Score: "",
            t2_Score: "",
            Result: ""
        };

        let TeamNames=document.querySelectorAll("div.name-detail > p.name")
        MatchJS0.t1 = TeamNames[0].textcontent;
        MatchJS0.t2 = TeamNames[1].textContent;




    }











})







