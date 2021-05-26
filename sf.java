import java.util.*;
class power
{
        static int divyanshu(){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            
            if( num == 0)
            {
                return 1;
            }
            else
            {    
                return(num*divyanshu(num,divyanshu-1));
            }

        }
    
       public static void main(String[]args)
        {
            
            power obj = new power();
        }
}

