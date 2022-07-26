public class Islemler {
    static int sayi1=5;
    int sayi2=8;

    public static void hesapmakinesi(){
        Islemler islem=new Islemler();
        System.out.println("Hesap Makinesi");
        System.out.println("Sayi1 : "+sayi1);
        System.out.println("Sayi2 : "+islem.sayi2);

    }

    public static void sehirTahminOyunu(String oyuncu,String tahmin){
        System.out.println("Sehir tahmin oyunu"+oyuncu+tahmin);
    }
}


