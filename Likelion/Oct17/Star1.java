package Likelion.Oct17;

/*
 *           i = 0 별이 1개
 * *         i = 0 별이 2개
 * * *       i = 0 별이 3개
 * * * *     i = 0 별이 4개
 */


import java.util.Scanner;

public class Star1 {
    public void nightSky(String n) {
        for (int i = 0; i < 4; i++) {
            // for문을 하나 더 쓰고
            // pintln 말고 print, printf 등을 써서 한줄로 출력
            for (int j = 0; j <=i ; j++) {
            System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Star1 star = new Star1();
        star.nightSky(str);
        }
    }
