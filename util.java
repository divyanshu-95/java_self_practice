import java.util.*;
class uti implements Comparable<uti>{
    
         int id;
         String name;
         int salary;
         uti(int id,String name,int salary){
            this.id=id;
            this.name=name;
            this.salary=salary;

        }
        public int compareTo(uti st){
            int var=name.compareTo(st.name);
            if(var==0)
                return 0;
            else if(var>0)
                return 1;
            else
                return -1;
            
            
        }
      
}
class util  {
    public static void main(String[]args){
        ArrayList<uti> a=new ArrayList<uti>();
        a.add(new uti(1,"srk",8));
        a.add(new uti(3,"ayush",200));
        a.add(new uti(5,"palak",15));
        Collections.sort(a);
        for(uti st:a){
            System.out.println(st.name  + "\t\t"   + st.id + "\t\t" + st.salary);
        }
        // System.out.println(a);
        
    }
}
