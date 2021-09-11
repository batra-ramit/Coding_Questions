import java.util.*;

public class ContestQ1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

 String s1=scn.next();
 String s2=scn.next();
 String s3=scn.next();
 String s4=scn.next();
int val1=0,val2=0;
int t1h=Integer.parseInt(s1);
int t1m=Integer.parseInt(s2);
int t2h=Integer.parseInt(s3);
int t2m=Integer.parseInt(s4);
int dha=t1h-t2h;
if(dha<0)
dha=-dha;
int dhb=24-t1h+t2h;
int dhc=t1h-0+(24-t2h);
val1=dha;
if(dhb<val1 || dhc<val1)
{
    if(dhc<dhb)
    val1=dhc;
    else
    val1=dhb;
}

int dma=t1m-t2m;
if(dma<0)
dma=-dma;
int dmb=60-t1m+t2m;
int dmc=t1m-0+(60-t2m);
val2=dma;
if(dmb<val2 || dmc<val2)
{
    if(dmc<dmb)
    val2=dmc;
    else
    val2=dmb;
}
System.out.println(val1+val2);


}}