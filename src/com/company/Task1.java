package com.company;
import java.util.Scanner;
public class Task1 {
    public void Execute(){
        System.out.println("Task 1:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<i; j++)
                System.out.print(i+" ");
        }
    }
}