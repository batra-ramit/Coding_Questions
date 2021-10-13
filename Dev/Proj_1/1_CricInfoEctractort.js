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

// node 1_CricInfoEctractort.js --excel=Worldcup.csv --dataFolder=data --source=https://www.espncricinfo.com/series/icc-cricket-world-cup-2019-1144415/match-results --dest=teams.json

let minimist = require("minimist");
let axios = require("axios");
let jsdom = require("jsdom");
let excel4node = require("excel4node");
let path = require("path");
let fs = require("fs");
let pdf = require("pdf-lib");

let args = minimist(process.argv);

let AxiosResponse = axios.get(args.source);

AxiosResponse.then(function (response) {
  let html = response.data;

  let dom = new jsdom.JSDOM(html);

  let document = dom.window.document;

  let MatchArr = [];

  let matchdivs = document.querySelectorAll("div.match-score-block");
  for (let i = 0; i < matchdivs.length; i++) {
    let matchdiv = matchdivs[i];

    let MatchJS0 = {
      t1: "",
      t2: "",
      t1_Score: "",
      t2_Score: "",
      Result: "",
    };

    let TeamNames = matchdiv.querySelectorAll("div.name-detail > p.name");
    MatchJS0.t1 = TeamNames[0].textContent;
    MatchJS0.t2 = TeamNames[1].textContent;

    let TeamScores = matchdiv.querySelectorAll("div.score-detail > span.score");
    if (TeamScores.length == 2) {
      MatchJS0.t1_Score = TeamScores[0].textContent;
      MatchJS0.t2_Score = TeamScores[1].textContent;
    } else if (TeamScores.length == 1) {
      MatchJS0.t1_Score = TeamScores[0].textContent;
      MatchJS0.t2_Score = "";
    } else {
      MatchJS0.t1_Score = "";
      MatchJS0.t2_Score = "";
    }

    let MatchResult = matchdiv.querySelector("div.status-text > span");
    MatchJS0.Result = MatchResult.textContent;

    MatchArr.push(MatchJS0);
  }

  let json = JSON.stringify(MatchArr);

  let Team = [];

  for (let i = 0; i < MatchArr.length; i++) {
    CreateTeams(Team, MatchArr[i].t1);
    CreateTeams(Team, MatchArr[i].t2);
  }

  for (let i = 0; i < MatchArr.length; i++) {
    AddMatchDetails(
      Team,
      MatchArr[i].t1,
      MatchArr[i].t2,
      MatchArr[i].t1_Score,
      MatchArr[i].t2_Score,
      MatchArr[i].Result
    );
    AddMatchDetails(
      Team,
      MatchArr[i].t2,
      MatchArr[i].t1,
      MatchArr[i].t1_Score,
      MatchArr[i].t2_Score,
      MatchArr[i].Result
    );
  }
  let Finjson = JSON.stringify(Team);
  fs.writeFileSync(args.dest, Finjson, "utf-8");

  prepareExcel(args.excel, Team);
  MakeFolderPdf(args.datafolder, Team);
});

function CreateTeams(team, teamname) {
  let t1idx = -1;
  for (let i = 0; i < team.length; i++) {
    if (team[i].name == teamname) {
      t1idx = i;
      break;
    }
  }

  if (t1idx == -1) {
    team.push({
      name: teamname,
      matches: [],
    });
  }
}

function AddMatchDetails(Team, t1name, t2name, t1score, t2score, result) {
  for (let i = 0; i < Team.length; i++) {
    if (Team[i].name == t1name) {
      Team[i].matches.push({
        vs: t2name,
        selfscore: t1score,
        oppscore: t2score,
        result: result,
      });
    }
  }
}

function prepareExcel(FileName, Team) {
  let wb = new excel4node.Workbook();

  for (let i = 0; i < Team.length; i++) {
    let sheet = wb.addWorksheet(Team[i].name);
    sheet.cell(1, 1).string("Vs");
    sheet.cell(1, 2).string("Self Score");
    sheet.cell(1, 3).string("Opp Score");
    sheet.cell(1, 4).string("Result");
    for (let j = 0; j < Team[i].matches.length; j++) {
      sheet.cell(2 + j, 1).string(Team[i].matches[j].vs);
      sheet.cell(2 + j, 2).string(Team[i].matches[j].selfscore);
      sheet.cell(2 + j, 3).string(Team[i].matches[j].oppscore);
      sheet.cell(2 + j, 4).string(Team[i].matches[j].result);
    }
  }
  wb.write(FileName);
}

function MakeFolderPdf(RootFolder, Team) {
  
  
}