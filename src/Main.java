import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        String [][] suallar =
                {
                        {"Azərbaycanın paytaxtı hansıdır?", "C", "A) Bakı B) Gəncə C) Sumqayıt"},
                        {"Azərbaycanın ən böyük gölü hansıdır?", "C", "A) Sərsəng B) Xəzər C) Göygöl"},
                        {"Azərbaycanın milli musiqi aləti hansıdır?", "A", "A) Tar B) Piano C) Nərə"},
                        {"Azərbaycanın ən yüksək dağ zirvəsi hansıdır?", "B", "A) Tufandağ B) Bazardüzü C) Şahdağ"},
                        {"Azərbaycanda ən uzun müddətli hökm sürmüş Türk dövləti hansıdır?", "C", "A) Səfəvilər B) Əfşarlar C) Şirvanşahlar"}
                };
        int duzgunSay=0;
        int sehvSay = 0;


        for (int i =0; i<suallar.length; i++) {
            //int sualIndeksi = 0;
            boolean answeredCorrected = false;
            String dogru = suallar[i][1].trim().toUpperCase();
            do {
                System.out.println((i + 1) + ". Sual: " + suallar[i][0]);
                for (int j = 2; j < suallar[i].length; j++) {
                    System.out.println(suallar[i][j]);
                }
                System.out.print("Cavab (A/B/C): ");
                String cavab = scan.nextLine().trim().toUpperCase();

                if (!(cavab.equals("A") || cavab.equals("B") || cavab.equals("C"))) {
                    System.out.println("Zəhmət olmasa yalnız A, B və ya C daxil edin.");
                    continue; // do-while davam etsin
                }


                if (cavab.equals(dogru)) {
                    System.out.println("Doğru!");
                    duzgunSay++;
                    answeredCorrected = true; // sualdan çıx
                } else {
                    System.out.println("Səhv! Yenidən cəhd edin.");
                    sehvSay++;
                }
            } while (!answeredCorrected);
        }

        System.out.println("Təbrik edirik! Bütün sualları tamamladınız.");
        System.out.println("Duzgun: " + duzgunSay+ " Sehv: "+ sehvSay);


        scan.close();
    }
}