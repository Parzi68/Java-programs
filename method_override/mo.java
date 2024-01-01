package method_override;

class a{
    public void print() {
        System.out.println("In parent class");
    }
}

class b extends a{
    public void print(){
        System.out.println("In child class");
    }
}

public class mo {
    public static void main(String[] args){
        b display = new b();
        display.print();
    }
}