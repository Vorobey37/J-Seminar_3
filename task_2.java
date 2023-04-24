import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        /*
         * Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
String[] planets = {“”, “”...}
Задание состоит из двух блоков
Задание №2.2 (если выполнено первое задание)
Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.
         */
        String []planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Нептун", "Плутон"};
        //System.out.println(Arrays.toString(planets));
        ArrayList <String> listPlanets = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < planets.length; i++) {
            listPlanets.add(planets[rand.nextInt(planets.length)]);
        }
        System.out.println(listPlanets);
        listPlanets.sort(null);
        System.out.println(listPlanets);
        int listPlanetsLength = listPlanets.size();
        //System.out.println(listPlanetsLength);
        int count = 1;
        for (int i = 1; i < listPlanetsLength; i++) {
            if (!listPlanets.get(i).equals(listPlanets.get(i-1)))
            {
                System.out.println(listPlanets.get(i-1) + " " + count);
                count = 1;
                
            }
            else
            {
                count++;

            }
        }
        System.out.println(listPlanets.get(listPlanetsLength-1) + " " + count);

    }
}
