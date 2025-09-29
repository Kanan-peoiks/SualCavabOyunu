import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Oyuna xosh geldiniz,zehmet olmasa adinizi daxil edin: ");
        String ad= scan.nextLine();
        String [][] suallar =
                {
                        {"Azərbaycanın paytaxtı hansıdır?", "C", "A) Bakı B) Gəncə C) Sumqayıt"},
                        {"Azərbaycanın ən böyük gölü hansıdır?", "C", "A) Sərsəng B) Xəzər C) Göygöl"},
                        {"Azərbaycanın milli musiqi aləti hansıdır?", "A", "A) Tar B) Piano C) Nərə"},
                        {"Azərbaycanın ən yüksək dağ zirvəsi hansıdır?", "B", "A) Tufandağ B) Bazardüzü C) Şahdağ"},
                        {"Azərbaycanda ən uzun müddətli hökm sürmüş Türk dövləti hansıdır?", "C", "A) Səfəvilər B) Əfşarlar C) Şirvanşahlar"}
                };
        int sualIndeksi = 0;
        int duzgunsay=0;
        int sehvsay = 0;
        boolean answeredCorrected;

        while (sualIndeksi < suallar.length){
//1
            do{
            System.out.println("1. Sual: " + suallar[0][0]);
            for (int j = 2; j < suallar[0].length; j++) {
                System.out.println(suallar[0][j]);
            }
            System.out.print("Cavab: ");
            String cavab = scan.nextLine().trim().toUpperCase();
            String dogru = suallar[0][1].trim().toUpperCase();
            if (cavab.equals(dogru)) {
                System.out.println("Doğru!");
                sualIndeksi+=1;
                answeredCorrected; // deyer ver cavab= true vvhile sehvdirse davam et, truedursa dayansin
                duzgunsay+=1;
            } else {
                System.out.println("Səhv!");
                sehvsay+=1;
            }
            cavab="";
//2
            System.out.println("2. Sual: " + suallar[1][0]);
            for (int j = 2; j < suallar[1].length; j++) {
            System.out.println(suallar[1][j]);
            }
            System.out.print("Cavab: ");
            cavab = scan.nextLine().trim().toUpperCase();
            dogru = suallar[1][1].trim().toUpperCase();
            if (cavab.equals(dogru)) {
                System.out.println("Doğru!");
                sualIndeksi+=1;
                duzgunsay+=1;
            } else {
                System.out.println("Səhv!");
                sehvsay+=1;
            }
            cavab="";
//3
            System.out.println("3. Sual: " + suallar[2][0]);
            for (int j = 2; j < suallar[2].length; j++) {
            System.out.println(suallar[2][j]);
            }
            System.out.print("Cavab: ");
            cavab = scan.nextLine().trim().toUpperCase();
            dogru = suallar[2][1].trim().toUpperCase();
            if (cavab.equals(dogru)) {
                System.out.println("Doğru!");
                sualIndeksi+=1;
                duzgunsay+=1;
            } else {
                System.out.println("Səhv!");
                sehvsay+=1;
            }
            cavab="";
//4
            System.out.println("4. Sual: " + suallar[3][0]);
            for (int j = 2; j < suallar[3].length; j++) {
            System.out.println(suallar[3][j]);
            }
            System.out.print("Cavab: ");
            cavab = scan.nextLine().trim().toUpperCase();
            dogru = suallar[3][1].trim().toUpperCase();
            if (cavab.equals(dogru)) {
                System.out.println("Doğru!");
                sualIndeksi+=1;
                duzgunsay+=1;
            } else {
                System.out.println("Səhv!");
                sehvsay+=1;
            }
            cavab="";
//5
            System.out.println("5. Sual: " + suallar[4][0]);
            for (int j = 2; j < suallar[4].length; j++) {
            System.out.println(suallar[4][j]);
            }
            System.out.print("Cavab: ");
            cavab = scan.nextLine().trim().toUpperCase();
            dogru = suallar[4][1].trim().toUpperCase();
            if (cavab.equals(dogru)) {
                System.out.println("Doğru!");
                sualIndeksi+=1;
                duzgunsay+=1;
            } else {
                System.out.println("Səhv!");
                sehvsay+=1;
            }
            cavab="";}
            while (!answeredCorrected);
        }
        System.out.println("Təbrik edirik! Bütün sualları tamamladınız.");
        System.out.println("Duzgun: " + duzgunsay+ " Sehv: "+ sehvsay);


        scan.close();
    }
}