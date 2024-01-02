import java.util.*;
class vector_ex{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
       for(int i=0;i<=5;i++){
           v.addElement(i);
       }
        System.out.println("Vector elements: "+v);
       for(int i = 5; i>=0; i--){
           v.remove(i);
       }
        System.out.println("Vector elements after remove: "+v);
    }
}