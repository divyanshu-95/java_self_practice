import java.util.Scanner;
class Str{
    public static void main(String[]args)
    {
         Scanner s=new Scanner(System.in);
        //System.out.println(" ");
        String s1=s.next();
        String s2=s1.toLowerCase();
        
        String s3=s2.replaceAll("[aeiou]","");
    for(int i=0; i<s3.length(); i++){
            
            System.out.print("."+s3.charAt(i));
        }   
        

    }
}