 class y{
//     public static void main(String[]args){
//         int size=args.length;
//         System.out.println("no of elements"+size);
//         for (int i=0;i<size;i++){
//             System.out.print(args[i]);
//         }
//     }
// }
    // z(){
    //     System.out.print("fhgfds");
    // }
    // public static void main(String[]args){
    //     z o=new z();
    // }
    y(){
        System.out.println("non paramitrized");
    }
}
class z extends y{
    z(){
        System.out.println(" p");
    }
    public static void main(String[]args){
        z o=new z();

    }
}