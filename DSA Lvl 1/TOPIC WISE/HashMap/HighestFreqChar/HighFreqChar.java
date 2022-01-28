
    import java.io.*;
    import java.util.*;
    
    public class HighFreqChar {
    
        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
           HashMap<String,Integer> map=new HashMap<>();
    Integer max=0;
    String maxchar="";
           for(int i=0;i<str.length();i++){
               String ch=str.substring(i,i+1);
               if(map.containsKey(ch)==true){
                   Integer val=map.get(ch);
                   val++;
                   map.put(ch,val);
                   if(val>max)
                   {max=val;
                   maxchar=ch;
                   }
               }else{
                   map.put(ch,1);
               }
           }
           System.out.println(maxchar);
        }
    
    }



    https://nados.io/feed/9fe73ff9-b57d-4bea-9135-dd0598642b03

    https://nados.io/feed/06376c83-4259-4b23-90b4-b795fb50b149