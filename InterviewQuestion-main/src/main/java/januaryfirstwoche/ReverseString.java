package januaryfirstwoche;

import java.util.Arrays;
import java.util.Scanner;

//How do you reverse a string in Java?
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bitte Schreiben einen Streing");
        String str=scan.nextLine();
        System.out.println(str);
        reverseString(str);


    }static void reverseString(String str){

        String[] str1=str.split("");

   for (int i=str1.length-1;i>=0;i--){
       System.out.print(str1[i]);
   }

    }
}
