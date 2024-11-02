package az.edu.turing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 7;

        int a = number1 + number2;
        int b = number1 - number2;
        int c = number1 / number2;
        int d = number1 * number2;
        int e = number1 % number2;
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
        int x = ++y;
        System.out.println(" y = " + y + ", x = " + y);


        int f = 12;
        int g = --f;
        System.out.println(" f = " + f + ", g = " + g);


        int k = 15;
        k += 8;
        System.out.println(" k = " + k);


        int s = 24;
        s -= 11;
        System.out.println(" s = " + s);


        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result = "";


        if (value % 3 == 0)
            System.out.println("Eded 3-e tam bolunur");
        else if (value % 3 == 1) {
            System.out.println("Eded 3-e tam bolunur ve qaliq 1-dir");
        } else {
            System.out.println("Eded 3-e tam bolunur ve qaliq 2-dir");
        }

        scan = new Scanner(System.in);
        int valuer = scan.nextInt();
        String resule = " ";

        switch (value) {
            case 0:
                result = " Eded 3-e tam bolunur";
                break;
            case 1:
                result = " Eded 3-e tam boilunmur ve qaliq 1 qalir";
                break;
            case 2:
                result = " Eded 3-e  tam bolunmur ve qaliq 2 qalir";
                break;
            default:
                result = " Eded 3-e tam bolunur ve qaliq " + value % 3 + "dir";


                class LooApp {

                    public static void main(String[] args) {


                        int i = 0;

                        for (; i <= 10; ){

                            System.out.println(i);
                        }
                        System.out.println(i);
                        System.out.println(i++);
                        System.out.println(i);



        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: \t");
        int number = scan.nextInt();
        System.out.println("Number is: " + number);
        System.out.print("Cutdurse true, tekdirse false: \t");
                System.out.print(number % 2 == 0 && true || false);


        int f = 7;
        int e = ++f;
        System.out.println( "f = " + f +", e = " + e);




        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int Number = scanner.nextInt();

        if(number == 0) {
            System.out.println("Daxil edilen eded 0-dir" );
        } else {
            if (number % 2 == 0) {
                System.out.println("Daxil edilen eded cutdur." );
            }else{
                System.out.println("Daxil edilen ede tekdir.");


        if(number > 0) {
            System.out.println("Daxil edilen eded pozitivdir.") ;
        }else{
            System.out.println("Daxil edilen eded neqativdir.");
            }
        }


        Scanner Scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin(1-12):");
        int month = scanner.nextInt();

        String season = "";
        String monthName = "";

        switch(month) {
            case 1:
                monthName = " Yanvar";
                season = "Qis";
                break;
            case 2:
                monthName = "Fevral";
                season = "Qis";
                break;
            case 3:
                monthName = "Mart";
                season = "Yaz";
                break;
            case 4:
                monthName = "Aprel";
                season = "Yaz";
                break;
            case 5:
                monthName = "May";
                season = "Yaz";
                break;
            case 6:
                monthName = "Iyun";
                season = "Yay";
                break;
            case 7:
                monthName = "Iyul";
                season = "Yay";
                break;
            case 8:
                monthName = "Avqust";
                season = "Yay";
                break;
            case 9:
                monthName = "Sentyabr";
                season = "Payiz";
                break;
            case 10:
                monthName = "Oktyabr";
                season = "Payiz";
                break;
            case 11:
                monthName = "Noyabr";
                season = "Payiz";
                break;
            case 12:
                monthName = "Dekabr";
                season = "Qis";
                break;
            default:
                System.out.println("Daxil edilen eded 1-12 araliginda olmalidir" );
                return;




            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " " );
            }

            System.out.println();

            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " " );
            }


            }
        }



            }

        }

                    }
                }

        }








