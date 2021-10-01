let n = process.argv;
let num=parseInt(n[2]);
let temp=-1;
for (let i=2;i*i<num;i++)
{
   if(num%i==0)
   temp=1;
    
}
if(temp==-1)
console.log("Prime");
else
console.log("Not prime");