import java.util.*;

public class str_reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String rev="";
        for(int i=S.length()-1;i>=0;i--){
            rev=rev+S.charAt(i);
        }
        if(S.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
            
        }

    }




