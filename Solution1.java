import java.util.Scanner;
import java.util.*;
class Solution1{
    public static void main(String[]args){
        HashSet<Character> h=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            h.add(str.charAt(i));

        }
        System.out.print(h.size());
    }
}