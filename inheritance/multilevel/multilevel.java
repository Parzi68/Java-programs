import java.io.*;
class a{
    int a = 10, b = 10;
    public void print(){
        System.out.println("Inside a: "+ (a+b));
    }
}
class b extends a{
    int c = 9;
    public void print(){
        System.out.println("Inside b: "+ (a+b+c));
    }
}
class c extends b{
    int d = 4;
    public void print(){
        System.out.println("Inside c: "+ (a+b+c-d));
    }
}
public class multilevel {
    public static void main(String[] args){
        a a = new a();
        b b = new b();
        c c = new c();
        a.print();
        b.print();
        c.print();
    }
}