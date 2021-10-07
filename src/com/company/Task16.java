package com.company;
import java.util.Scanner;
public class Task16 {
    public void Count(){
        System.out.println("Task 16:");
        int a = -1, max = -1, counter = 1;
        Scanner scanner = new Scanner(System.in);
        while (a != 0 ){
            a = scanner.nextInt();
            if (a!=0) {
                if (a > max) {
                    max = a;
                    counter = 1;
                } else if (a == max) {
                    counter++;
                }
            }
        }
        System.out.println("Number of numbers equal to max: "+counter);
    }
}
