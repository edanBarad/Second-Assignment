package Ex1;
import java.util.Scanner;
/**
 * Intro2CS, Ex1.Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit", addAns, multAns;
        int base;
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.nextLine();
            if (!num1.equals("quit")) {         //If user didn't quit program
                if (!Ex1.isNumber(num1)){       //First check if input is in wrong format
                    System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                }
                else{
                    System.out.println("num1 = " + num1 + " is number: true, value: " + Ex1.number2Int(num1));  //Print valid number and its value in base 10
                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                    num2 = sc.nextLine();
                    if (!num2.equals("quit")){          //If user didn't quit program
                        if (!Ex1.isNumber(num2)){       //First check if input is in wrong format
                            System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                        }
                        else {
                            System.out.println("num2 = " + num2 + " is number: true, value: " + Ex1.number2Int(num2));//Print valid number and its value in base 10
                            System.out.println("Enter a base for output (a number between [2,16]): ");
                            base = sc.nextInt();
                            sc.nextLine();
                            addAns = Ex1.int2Number((Ex1.number2Int(num1) + Ex1.number2Int(num2)), base);
                            multAns = Ex1.int2Number((Ex1.number2Int(num1) * Ex1.number2Int(num2)), base);
                            System.out.println(num1 + " + " + num2 + " = " + addAns);
                            System.out.println(num1 + " * " + num2 + " = " + multAns);
                            String[] arr = {num1, num2, addAns, multAns};
                            System.out.print("Max number over [");
                            for (String s : arr){
                                //noinspection StringEquality
                                if (s == arr[arr.length-1]){
                                    System.out.print(s);
                                    break;
                                }
                                System.out.print(s + ", ");
                            }
                            System.out.println("] is: " + arr[Ex1.maxIndex(arr)]);
                        }
                    }
                }
            }
        }
        System.out.println("quiting now...");   //Quit program
        sc.close();                             //Close scanner
    }
}