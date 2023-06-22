package baitap1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Tạo một danh sách đầu vào
        LinkedList<String> inputList = new LinkedList<>();
        inputList.add("Phần tử 1");
        inputList.add("Phần tử 2");
        inputList.add("Phần tử 3");
        inputList.add("Phần tử 4");
        inputList.add("Phần tử 5");

        // Tạo một Queue để lưu trữ danh sách đầu vào
        Queue<String> queue = new LinkedList<>(inputList);

        // In ra các phần tử trong Queue
        System.out.println("Các phần tử trong danh sách:");
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
