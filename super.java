class uper{
    SM(){
        System.out.println("base....nonp");
    SM(int a){
        System.out.println("base..par");
    }
    
}
class h extends super{
    Oracle(){
        super(a);
    
        System.out.println("derived...para");
    
    }
    public static void main(String[]args){
        Orcale o=new Oracle(10);

    }
    

}