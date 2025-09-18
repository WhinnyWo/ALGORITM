import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("1");
        list.add("b");
        list.add("2");
        list.add("c");
        list.add("3");
        
        List<String> list_1 = new ArrayList<>(); // буквы
        List<String> list_2 = new ArrayList<>(); // числа
        
        // Разделяем список на буквы и числа
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list_1.add(list.get(i)); // четные - буквы
            } else {
                list_2.add(list.get(i)); // нечетные - числа
            }
        }
        
        // Очищаем исходный список
        list.clear();
        
        // Выводим полученные списки
        System.out.println("Буквы: " + list_1);
        System.out.println();
        System.out.println("Числа: " + list_2);
    }
}