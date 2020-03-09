import java.util.Scanner;
public class KucuktenBuyuge {
    public static void main(String[] args) {
        System.out.println("Bu programda yazdığınız sayılar küçükten büyüğe ya da büyükten küçüğe doğru sıralanacaktır.");
        int[] SiralananSayilar = new int[5];
        int i = 0;
        int kullanıcıcevap = 0;
        System.out.println("Küçükten büyüğe için 1, Büyükten küçüğe için 2 yaziniz : ");
        Scanner cevap = new Scanner(System.in);
        kullanıcıcevap = cevap.nextInt();
        if (kullanıcıcevap == 1) {
            for (i = 0; i < 5; i++) {
                System.out.print("Lütfen bir tam sayi giriniz: ");
                Scanner sayi = new Scanner(System.in);
                SiralananSayilar[i] = sayi.nextInt();
            }
            for (i = 0; i < SiralananSayilar.length; i++) {
                for (int a = 1; a < SiralananSayilar.length; a++) {
                    if (SiralananSayilar[a] < SiralananSayilar[a - 1]) {
                        int Deger = SiralananSayilar[a];
                        SiralananSayilar[a] = SiralananSayilar[a - 1];
                        SiralananSayilar[a - 1] = Deger;
                    }
                }
            }
            for (i = 0; i < SiralananSayilar.length; i++) {
                System.out.print(i + 1 + ".Sayi :" + SiralananSayilar[i] + " | ");
            }
        }
        else if(kullanıcıcevap==2){
            for (i = 0; i < 5; i++) {
                System.out.print("Lütfen bir tam sayi giriniz: ");
                Scanner ikincisayi = new Scanner(System.in);
                SiralananSayilar[i] = ikincisayi.nextInt();
            }
            for (i = 0; i < SiralananSayilar.length; i++) {
                for (int b = 1; b < SiralananSayilar.length; b++) {
                    if (SiralananSayilar[b - 1] < SiralananSayilar[b]) {
                        int Deger = SiralananSayilar[b];
                        SiralananSayilar[b] = SiralananSayilar[b - 1];
                        SiralananSayilar[b - 1] = Deger;
                    }
                }
            }
            for (i = 0; i < SiralananSayilar.length; i++) {
                System.out.print(i + 1 + ".Sayi :" + SiralananSayilar[i] + " | ");
            }
        }
        else {
            System.out.print("Hatali Giriş yaptiniz");
        }
    }
}

