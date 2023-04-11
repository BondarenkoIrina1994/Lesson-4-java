//  Задача 1
//  Пусть дан LinkedList с несколькими элементами. 
//  Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < random.nextInt(1, 10); i++) {
            list.add(random.nextInt(-10, 10));
        }
        System.out.printf("Исходный список:\n%s\n", list);
        System.out.printf("Перевернутый список:\n%s", reverseLinkedList(list));

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }
}
