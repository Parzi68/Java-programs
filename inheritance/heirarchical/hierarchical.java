import java.io.*;
class a{
    int a = 5, b=10;
    public void print(){
        System.out.println("Inside a: "+ (a+b));
    }
}
class b extends a{
    public void print(){
        System.out.println("Inside b: "+(a-b));//taking the value from class a
    }
}
class c extends a{
    public void print(){
        System.out.println("Inside c: "+ (a*b)); //taking the value from class a
    }
}
public class hierarchical {
    public static void main(String[] args){
        a a = new a();
        b b = new b();
        c c = new c();
        a.print();
        b.print();
        c.print();
        //performing different operations from the same variables and getting different results as the value of the variables is reused
    }
}