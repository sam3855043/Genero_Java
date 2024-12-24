package com.example.model;

public class Person {
      // 類別的屬性
      private String name;
      private int age;
  
      // 建構子，用來初始化物件
      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }
  
      // 顯示個人資訊的方法
      public void displayInfo() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
      }
  
      // getter 和 setter 方法
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public int getAge() {
          return age;
      }
  
      public void setAge(int age) {
          this.age = age;
      }
}
