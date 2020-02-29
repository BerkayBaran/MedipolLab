import java.util.Scanner;

import static java.lang.Math.*;
public class Odev {
    public static void main(String[] args) {
        System.out.println("Uygulamaya hoşgeldiniz! Aşağıdaki gireceğiniz sayı miktarına göre girdiğiniz sayıların 1. 2. 3. ve 4. kuvvetleri hesaplanacaktır!");
        System.out.println("Lütfen bir sayi giriniz!");
        Scanner kullanıcınınsayi = new Scanner(System.in);
        int sayi = kullanıcınınsayi.nextInt();
        int islemsayisi=0;
        for (int i =0; i <= sayi; i++) {
            if(islemsayisi<sayi){
                islemsayisi++;
                System.out.print("n \n");
                System.out.println(Math.pow((int) (islemsayisi), 1));
                System.out.print("n^2 \n");
                System.out.println(Math.pow((int) (islemsayisi), 2));
                System.out.print("n^3 \n");
                System.out.println(Math.pow((int) (islemsayisi), 3));
                System.out.print("n^4 \n");
                System.out.println(Math.pow((int) (islemsayisi), 4));
            }

        }



    }
}
