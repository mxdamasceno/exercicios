package Vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println( " Entre com a Ideade: "  +  i);
            Scanner sc = new Scanner(System.in);
            idades[i] = sc.nextInt();
        }

    }
  }