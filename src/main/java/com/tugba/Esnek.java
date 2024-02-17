package com.tugba;

public class Esnek {
    private static int[] sayilar;
    private static int tumSayilar=0;
    public static void main(String[] args) {
        sayiEkle(1);
        sayiEkle(2);
        sayiEkle(4);
        sayiEkle(5);
        sayiEkle(7);
        sayiEkle(3);
        sayiEkle(8);
        print();
        remove(1);
        arayaEkleme(2,44);


    }
    public static void sayiEkle(int sayi) {
        tumSayilar++;
        if (tumSayilar == 1)
        {
            sayilar = new int[1];
            sayilar[0] = sayi;
        } else
        {
            int[] geciciDizi = new int[tumSayilar];
            for (int i = 0; i <sayilar.length; i++)
            {
                geciciDizi[i] = sayilar[i];
            }
            geciciDizi[tumSayilar-1] = sayi;
            sayilar = geciciDizi;
        }
    }
    public static void remove(int index) {
        tumSayilar--;
        int flag = 0;
      int[] geciciDizi = new int[tumSayilar];
        for (int i = 0; i < sayilar.length; i++) {
            if (i == i) {
                flag++;
                continue;
            }
            geciciDizi[i - flag] = sayilar[i];
        }
        sayilar=geciciDizi;
    }
    public static void arayaEkleme(int index,int eklenenSayi){
        tumSayilar++;
        int sayac=0;
        int [] geciciDizi=new int[tumSayilar];
        for (int i=0; i<tumSayilar;i++){
            if (i==index){
                geciciDizi[i]=eklenenSayi;
                sayac++;
            } else if (i<index) {
                geciciDizi[i]=sayilar[i];

            }else
                geciciDizi[i]=sayilar[i+sayac];
        }
        sayilar=geciciDizi;
    }

    public static void print(){
        for (int i=0; i<tumSayilar; i++)
        {
            System.out.println(sayilar[i]);
        }
    }
}
