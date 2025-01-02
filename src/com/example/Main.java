package com.example;
import com.example.model.Person; // 引入 Person 類別
public class Main {
    public static void main(String[] args) {
        // 創建 Person 類別的物件
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // 呼叫物件的方法來顯示資訊
        person1.displayInfo();
        person2.displayInfo();
    }
}
