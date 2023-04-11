
// Задача 3
// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1
// +
// 2
// ответ:
// 3
// +
// 4
// ответ:
// 7
// +
// 2
// ответ:
// 9
// 1
// Ответ 8
// Отмена -> 9
// Отмена -> 7
// Отмена -> 3
// +
// 2
// Ответ 5
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Deque<Double> dq = new ArrayDeque<Double>();
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        dq.push(number);
        boolean check = true;
        while (check) {
            double number_1 = dq.getFirst();
            String symbol = input.next();
            if (symbol.equals("Cancel")) {
                dq.removeFirst();
                System.out.println(dq.getFirst());
            } else {
                if (symbol.equals("Stop"))
                    check = false;
                else {
                    String number_2 = input.next();
                    if (number_2.equals("Cancel")) {
                        dq.removeFirst();
                        System.out.println(dq.getFirst());
                    } else {
                        if (number_2.equals("Stop"))
                            check = false;
                        else {
                            int number2 = Integer.parseInt(number_2.trim());
                            if (symbol.equals("+"))
                                dq.push(number_1 + number2);
                            if (symbol.equals("-"))
                                dq.push(number_1 - number2);
                            if (symbol.equals("/"))
                                dq.push(number_1 / number2);
                            if (symbol.equals("*"))
                                dq.push(number_1 * number2);
                            System.out.printf("Ответ:\n%s\n", dq.getFirst());
                        }
                    }
                }
            }
        }
        input.close();
    }
}
