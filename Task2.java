// Задача 2
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < random.nextInt(1, 10); i++) {
            list.add(random.nextInt(-10, 10));
        }
        System.out.printf("Метод, помещающий элемент в конец очереди:\n%s\n", enqueue(list));
        System.out.printf("Метод, возвращающий первый элемент из очереди и удаляющий его:\n%s\nНовый список:\n%s\n", dequeue(list),list);
        System.out.printf("Метод, возвращающий первый элемент из очереди, не удаляя:\n%s\nСписок:\n%s", first(list),list);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите элемент, который хотите добавить: ");
        int element = input.nextInt();
        list.addLast(element);
        return list;
    }
    public static Integer dequeue(LinkedList<Integer> list) {
        int first=list.getFirst();
        list.removeFirst();
        return first;
    }
    public static Integer first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}