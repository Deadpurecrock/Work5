package com.company;
import java.util.Scanner;
public class Task2 {
    public void Go(){
        System.out.println("Task 17:");
        int a = -1, max = -1;
        Scanner scanner = new Scanner(System.in);
        while (a != 0) {
            a = scanner.nextInt();
            if (a != 0) {
                if (a > max) {
                    max = a;
                }
            }
        }
        System.out.println("Max number is: " + max);
    }
}
