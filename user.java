import java.util.*;
class ce extends Exception{
    ce(){
        System.out.println("under 18..");
    }
}
class user extends ce{
    public static void main(String[]args){
        try{
            Scanner s=new Scanner(System.in);
            int age=s.nextInt();
            if(age>=18){
                System.out.println("done");
            }else{
                throw new ce();
            }
        }catch(Exception e){
            //System.out.println("error-:"+e);
        }
        finally{
            System.out.println("next come");
        }
    }
}