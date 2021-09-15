import java.util.*;
public class MaxNum{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=get3digno(n, 1);
int b=get3digno(n, 2);
int c=get3digno(n, 3);
int d=get3digno(n, 4);
// System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
int max=a;
if(b>max)
max=b;
if(c>max)
max=c;
if(d>max)
max=d;
System.out.println(max);
}
static int get3digno(int n,int pos){
int sum=0,mul=1;
    for(int i=1;i<=4;i++){
        int rem=n%10;
        n=n/10;
        if(i==pos)
        continue;
sum=sum+mul*rem;
mul=mul*10;

    }
    return sum;
}
}