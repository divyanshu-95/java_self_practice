import java.util.*;
class strbui{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String sc=s.next();
        StringBuilder sb=new StringBuilder(sc);
        sb.reverse();
        System.out.print(sb);
    }
}