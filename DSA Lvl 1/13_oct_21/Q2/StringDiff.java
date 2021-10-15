

    import java.io.*;
    import java.util.*;
    public class StringDiff {



	public static String solution(String str){
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<str.length();i++){
	       char ch=str.charAt(i);
	      
	       if(i==str.length()-1)
	       sb.append(ch);
	       else{
	        char ch1=str.charAt(i+1);
	       sb.append(ch);
	       sb.append(ch1-ch);
	   }
	    }
	
String s=sb.toString();
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
    

