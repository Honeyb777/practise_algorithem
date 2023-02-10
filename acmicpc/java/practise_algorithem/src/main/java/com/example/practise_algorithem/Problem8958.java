package com.example.practise_algorithem;

import java.util.Scanner;

public class Problem8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pCnt = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < pCnt; i++) {
            String p = sc.nextLine();
            int total = 0;
            int max = 0;
            char[] charP = p.toCharArray();
            for (char c : charP) {
                max = c == 'O' ? max + 1 : 0;
                total += max;
            }
            if ((i < pCnt - 1)) {
                System.out.println(total);
            } else {
                System.out.print(total);
            }
        }
    }
}
