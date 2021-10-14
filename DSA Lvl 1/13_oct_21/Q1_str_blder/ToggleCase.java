import java.io.*;
import java.util.*;
import java.lang.*;

public class ToggleCase {

	public static String toggleCase(String str){
		StringBuilder sb=new StringBuilder(str);
	for(int i=0;i<sb.length();i++){
	    char ch=sb.charAt(i);
	    if(ch>='a' && ch <='z')
	    ch=Character.toUpperCase(ch);
	    else
	    ch=Character.toLowerCase(ch);
	    sb.setCharAt(i,ch);
	}
	String s=sb.toString();
	return s;
}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}