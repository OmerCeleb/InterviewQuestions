import java.time.LocalDateTime;

public class Faktoryel {
    public static void main(String[] args) {
        Long baslangic=System.currentTimeMillis();
        System.out.println("5!= "+faktoryelhesapla(5L));
        System.out.println("7!= "+faktoryelhesapla(7L));
        System.out.println("15!= "+faktoryelhesapla(15L));

        System.out.println("7!= "+faktoryelRecursiveHesapla(7L));
        System.out.println("15!= "+faktoryelRecursiveHesapla(15L));
      ;System.out.println("5!= "+faktoryelRecursiveHesapla(5L));

    }private  static long faktoryelhesapla(Long sayi){
        long snc=1L;
if (sayi==0)return 1L;
        for (int i=1;i<=sayi;i++){
            snc=snc*i;
        }
        return snc;
    }private static long faktoryelRecursiveHesapla(Long sayi){
        //F(5)=5*F(4)
if (sayi==0|| sayi==1){return  1L;}return sayi*faktoryelRecursiveHesapla(sayi-1);
    }
}
