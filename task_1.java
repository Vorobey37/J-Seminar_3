import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        /*
         * Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.
         */
        List <Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(20));
        }
        System.out.println(numbers);
        numbers.sort(null);
        System.out.println(numbers);

    }
}