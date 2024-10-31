package az.edu.turing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 7;

       int a=number1 + number2;
       int b=number1 - number2;
       int c=number1 / number2;
       int d=number1 * number2;
       int e=number1 % number2;
//       int f=number1 // number2;///       /       }

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);



Scanner scan = new Scanner(System.in);
System.out.print("Enter a number: \t");
int number = scan.nextInt();
System.out.println("Number is: " + number);
//System.out.print("Cutdurse true, tekdirse false: \t");//
        //System.out.print( number % 2 == 0 && true || false);//8


int y = 7;
int x= ++y;
System.out.println(" y = " + y +  ", x = " + y);


int f = 12;
int g = --f;
System.out.println(" f = " + f +  ", g = " + g);


int k = 15;
k += 8;
System.out.println(" k = " + k);


int s = 24;
s -= 11;
System.out.println(" s = " + s);

}
}






