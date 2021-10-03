let minimist = require("minimist");
let fs = require("fs");

let args = minimist(process.argv);
// node 10_FirstWritingJSON.js --dest=teams.json
let teams = [
    {
        team: "India",
        rank: 1,
        matches: [
            {
                vs: "Australia",
                result: "Win"
            },
            {
                vs: "England",
                result: "Win"
            }
        ]
    },
    {
        team: "Australia",
        rank: 2,
        matches: [
            {
                vs: "India",
                result: "Loss"
            },
            {
                vs: "England",
                result: "Win"
            }
        ]
    },
    {
        team: "England",
        rank: 3,
        matches: [
            {
                vs: "Australia",
                result: "Loss"
            },
            {
                vs: "India",
                result: "Loss"
            }
        ]
    }
];

let json = JSON.stringify(teams);
fs.writeFileSync(args.dest, json, "utf-8");