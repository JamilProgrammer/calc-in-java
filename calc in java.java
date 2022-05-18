//This pgm/- is about calc in fn/- as same as...

import java.util.*;
public class first{

int a,b;

    int Addition(int a,int b){
        Scanner ob=new Scanner(System.in);
        int Total;
        System.out.println("Enter the value B:");
        b=ob.nextInt();
        Total=a+b;
        return Total;
    }

    int Subtraction(int a,int b){
        Scanner ob=new Scanner(System.in);
        int Total;
        System.out.println("Enter the value B:");
        b=ob.nextInt();
        Total=a-b;
        return Total;
    }

    int Multiplication(int a,int b){
        Scanner ob=new Scanner(System.in);
        int Total;
        System.out.println("Enter the value B:");
        b=ob.nextInt();
        Total=a*b;
        return Total;
    }

    int Division(int a,int b){
        Scanner ob=new Scanner(System.in);
        int Total;
        System.out.println("Enter the value B:");
        b=ob.nextInt();
        Total=a/b;
        return Total;
    }

    int Modulo(int a,int b){
        Scanner ob=new Scanner(System.in);
        int Total;
        System.out.println("Enter the value B:");
        b=ob.nextInt();
        Total=a%b;
        return Total;
    }



    static String print="Hi,Mr.Pink_The_Pink_Lover";    

    public static void main(String args[]){

        first o=new first();

        System.out.println("Enter the value A:");
        Scanner obj=new Scanner(System.in);
        o.a=obj.nextInt();
        
        
        char operator;
        System.out.println("Enter any one of the operator(+,-,*,/,%):");
        operator=obj.next().charAt(0);

        
        switch(operator){
            case '+':
                System.out.println(o.Addition(o.a,o.b));
                break;
            case '-':
                System.out.println(o.Subtraction(o.a,o.b));
                break;
            case '*':
                System.out.println(o.Multiplication(o.a,o.b));
                break;
            case '/':
                System.out.println(o.Division(o.a,o.b));
                break;
            case '%':
                System.out.println(o.Modulo(o.a,o.b));
                break;
            default:
                System.out.println("Enter the valid operator...");
        }
        
    }
}