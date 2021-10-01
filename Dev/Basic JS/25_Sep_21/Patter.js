let n = process.argv;
let num = parseInt(n[2]);

for (let i = 0;i < num; i++) {
    let line="";
  for (let j = 0;j < i; j++){
line = line+"*\t";
  }
  console.log(line);
}

