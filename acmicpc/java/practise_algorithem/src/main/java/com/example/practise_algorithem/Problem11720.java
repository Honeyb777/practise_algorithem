package com.example.practise_algorithem;

import java.util.Scanner;

public class Problem11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCnt = scanner.nextInt();
        String number = scanner.next();
        char[] charNumber = number.toCharArray();
        int sumNumber = 0;
        for (int i = 0; i < numberCnt; i++) sumNumber += charNumber[i] - '0';
        System.out.print(sumNumber);
    }
}
