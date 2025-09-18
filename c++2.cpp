#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    vector<string> list = {"a", "1", "b", "2", "c", "3"};
    vector<string> list_1; // буквы
    vector<string> list_2; // числа
    
    // Разделяем список на буквы и числа
    for (int i = 0; i < list.size(); i++) {
        if (i % 2 == 0) {
            list_1.push_back(list[i]); // четные - буквы
        } else {
            list_2.push_back(list[i]); // нечетные - числа
        }
    }
    
    // Очищаем исходный список
    list.clear();
    
    // Выводим полученные списки
    cout << "Буквы: ";
    for (const auto& item : list_1) {
        cout << item << " ";
    }
    cout << endl << endl;
    
    cout << "Числа: ";
    for (const auto& item : list_2) {
        cout << item << " ";
    }
    cout << endl;
    
    return 0;
}