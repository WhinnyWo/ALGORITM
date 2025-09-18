public class Main {
    public static void main(String[] args) {
        String str_1 = "AaBbCcDdEeFfGg";
        StringBuilder upcaseStr = new StringBuilder();
        StringBuilder lowcaseStr = new StringBuilder();
        
        // Получаем заглавные буквы (четные: 0, 2, 4, 6)
        for (int i = 0; i < str_1.length(); i += 2) {
            uppcaseStr.append(str_1.charAt(i));
        }
        
        // Получаем строчные буквы (нечетные: 1, 3, 5, 7)
        for (int i = 1; i < str_1.length(); i += 2) {
            lowcaseStr.append(str_1.charAt(i));
        }
        
        // Выводим результаты
        System.out.println("Заглавные буквы: " + upcaseStr.toString());
        System.out.println("Строчные буквы: " + lowcaseStr.toString());
    }
}