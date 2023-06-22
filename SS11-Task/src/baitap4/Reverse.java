package baitap4;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng từ: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới sau khi nhập số lượng từ

        Stack<String> stack = new Stack<>();

        // Nhập từng từ và lưu vào stack
        for (int i = 0; i < count; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            stack.push(word);
        }

        System.out.println("Các từ theo thứ tự đảo ngược:");
        // In ra các từ từ stack theo thứ tự đảo ngược
        while (!stack.isEmpty()) {
            String word = stack.pop();
            System.out.println(word);
        }

        scanner.close();
    }
}
