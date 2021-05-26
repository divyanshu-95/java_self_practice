import java.util.*;
public class CircularQueueExample{
    int ar[];
    int front;
    int rear;
     CircularQueueExample(){
         ar=new int[5];
         front=-1;
         rear=-1;
         
     }
     void insert(){
         if((front==0 && rear==4) || (rear ==front-1)){
             System.out.println("queue full");
         }else{
             System.out.println("Enter element-:");
             Scanner sc=new Scanner(System.in);
             int var=sc.nextInt();
            if(front==-1){
                front=0;
            }if(rear<4){
                rear=rear+1;
                ar[rear]=var;
            }else if(rear==4 && front!=0){
                rear=0;
                ar[rear]=var;
            }
             System.out.println("element inserted");
         }
     }
     void delete(){
         if(front==-1){
             System.out.println("queue empty");
         }else{
            if(front==rear){
                System.out.println("deleted..."+ar[front]);
                front=-1;
                rear=-1;
            }else if(front<rear){
                System.out.println("deleted.."+ar[front]);
                front++;
            }else if(rear<front && front==4){
                System.out.println("deleted.."+ar[front]);
                front=0;
            }else if(rear<front && front<4){
                System.out.println("deleted..."+ar[front]);
                front ++;
                
            }
         }
     }
     void traverse(){
         if(front ==-1){
             System.out.println("queue empty");
         }else{
             if(rear<front){
                 for(int i=front;i<=4;i++){
                     System.out.println("  "+ar[i]);
                 }
                 for(int i=0;i<=rear;i++){
                     System.out.println("  "+ar[i]);
                 }
                 
             }else if(front<rear){
                 for(int i=front;i<=rear;i++){
                     System.out.println("  "+ar[i]);
                 }
             }
         }
     }
     void peek(){
         if(front==-1){
             System.out.println("empty");
         }else{
             System.out.println("last element-: "+ar[rear]);
         }
     }
     void pole(){
         if(front==-1){
             System.out.println("queue empty");
         }else{
             System.out.println("first element-: "+ar[front]);
         }
     }
     
   
    public static void main(String[]args){
         CircularQueueExample obj=new  CircularQueueExample();
        
        while(true){
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for display");
            System.out.println("press 4 for exit");
            System.out.println("press 5 for peek");
            System.out.println("press 6 for pole");

            
            System.out.println("Enter your choice-:");
            Scanner choice=new Scanner(System.in);
            int n=choice.nextInt();
            
            switch(n){
                   case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.peek();
                    break;
                case 6:
                    obj.pole();
                    break;
                
                default:
                    System.out.println("wrong choice");
            }
            
        }
        
    }
}