package baitap9;

import java.util.Scanner;
import java.util.Stack;


public class ReverseInt {
    public static void main(String[] args) {
        System.out.println("nhập một mảng số :");
        Integer number = new Scanner(System.in).nextInt();
        String str = number.toString();
        String strReverse = "";
        Stack<Character> listChar =  new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            listChar.push(str.charAt(i));
        }
        while (!listChar.empty()){
            strReverse  += listChar.pop();
        }
        System.out.println("mảng đảo ngược là : ");
        int reverseNumber =Integer.parseInt(strReverse);
        System.out.println(reverseNumber);
    }
}