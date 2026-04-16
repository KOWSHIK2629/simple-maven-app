package com.example;
public class App {
 public static void main(String[] args) {
 System.out.println("Hello, Maven World!");
 int a = 10;
 int b = 20;
 int sum = add(a, b);
 System.out.println("Sum of " + a + " and " + b + " is: " + sum);
 }
 public static int add(int x, int y) {
 return x + y;
 }
}
