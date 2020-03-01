import java.util.Scanner;

import static java.lang.Math.*;
public class Odev {
    public static void main(String[] args) {
        System.out.println("Uygulamaya hoşgeldiniz! Aşağıdaki gireceğiniz sayı miktarına göre girdiğiniz sayıların 1. 2. 3. ve 4. kuvvetleri hesaplanacaktır!");
        System.out.println("Lütfen bir sayi giriniz!");
        Scanner kullanıcınınsayi = new Scanner(System.in);
        float sayi = kullanıcınınsayi.nextInt();
        for (int i =1; i <= sayi; i++) {
                System.out.print("n^1 \n");
                System.out.println(Math.pow((double) (i), 1));
                System.out.print("n^2 \n");
                System.out.println(Math.pow((double) (i), 2));
                System.out.print("n^3 \n");
                System.out.println(Math.pow((double) (i), 3));
                System.out.print("n^4 \n");
                System.out.println(Math.pow((double) (i), 4));
        }
    }
}
