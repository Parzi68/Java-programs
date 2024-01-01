import java.util.*;
class parent{
    int a = 10 ,b = 10;
    public void add(){
        System.out.println("Addition from parent: "+(a+b));
    }
}
class child extends parent{
    int c=5;
    public void display(){
        System.out.println("Addition from child: "+(a+b+c));
    }
}
public class single_level{
    public static void main(String[] args){
        parent ad = new parent();
        child add = new child();
        ad.add();
        add.display();
    }
}