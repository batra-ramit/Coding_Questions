import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    
    int max=sc.nextInt();
int i=1;
    while(i!=max){

int temp[]=new int[n];
for(int j=0;j<n;j++){
   
double val=arr[j]/i;
// System.out.print(val+" ");
temp[j]=(int)Math.ceil(val);
}

int sum=0;

for(int j=0;j<n;j++){
sum=sum+temp[j];
}
if(sum<=max){
System.out.print(sum);
break;
}
else {
    i++;
}

    }
    
    
    }
}