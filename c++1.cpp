#include <iostream>
#include <string>
using namespace std;

int main() {
    string str_1 = "AaBbCcDdEeFfGg";
    string uppercase_str = "";
    string lowercase_str = "";
    
    // Получаем заглавные буквы (четные: 0, 2, 4, 6)
    for (int i = 0; i < str_1.length(); i += 2) {
        uppercase_str += str_1[i];
    }
    
    // Получаем строчные буквы (нечетные: 1, 3, 5, 7)
    for (int i = 1; i < str_1.length(); i += 2) {
        lowercase_str += str_1[i];
    }
    
    // Выводим результаты
    cout << "Заглавные буквы: " << uppercase_str << endl;
    cout << "Строчные буквы: " << lowercase_str << endl;
    
    return 0;
}