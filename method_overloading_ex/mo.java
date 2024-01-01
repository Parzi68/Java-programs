package method_overloading_ex;
//program to add 2 or 3 numbers using method overloading
import java.io.*;
class mo{
    //method to add two integers
    public int add(int num1, int num2){
        return num1 + num2;
    }
    //method to add three integers
    public int add(int num1, int num2, int num3){
        return num1 + num2+num3;
    }
    //method to add two float numbers
    public double add(double num1,double num2){
        return num1+num2;
    }
    public static void main(String[] args){
        mo mo = new mo();

        int result1= mo.add(15,20);
        System.out.println(result1);

        int result2 = mo.add(4,9,2);
        System.out.println(result2);

        double result3 = mo.add(2.5 , 3.2);
        System.out.println(result3);

    }
}