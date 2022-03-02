import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
   int a=0;
   int b=5;
   printID(a,b);
  }

  static void  printID(int a,int b){
    if(a>b)
    return;

    System.out.println(a);
    printID(a+1,b);
    System.out.println(a);
  }
}
