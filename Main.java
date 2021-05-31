import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        System.out.println("------------- Menghitung Bangun Ruang Tabung -------------");
        System.out.println("               Input dalam satuan centimeter           ");

        double jari;
        double tinggi;
        double volume;
        double ls;
        double lp;
        double la;
        double ln;

        System.out.println("----------------------------------------------------------");


        Scanner r = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        jari = r.nextFloat();

        Scanner t = new Scanner(System.in);
        System.out.print("Masukkan tinggi : ");
        tinggi = t.nextFloat();


        System.out.println("----------------------------------------------------------");
        System.out.println("           Hasil Perhitungan Bangun Ruang Tabung             ");
        System.out.println(" ");

        lp = 2 * Math.PI * jari * (jari + tinggi);

        System.out.println("Luas Permukaan Tabung = 2 * PI * r * ( r + t ) = " + Math.ceil(lp) + " cm");

        System.out.println(" ");

        ls = 2 * Math.PI * jari * tinggi ;

        System.out.println("Luas Selimut Tabung = 2 * PI * r * t = " + Math.ceil(ls) + " cm");

        System.out.println(" ");

        la = Math.PI * jari * jari;

        System.out.println("Luas Alas Tabung = PI * r * r = " + Math.ceil(la) + " cm");

        System.out.println(" ");

        ln = la + ls ;

        System.out.println("Luas Tanpa Tutup Tabung = Luas Selimut + Luas Alas = " + Math.ceil(ln) + " cm");

        System.out.println(" ");

        volume = Math.PI * jari * jari * tinggi ;

        System.out.println("Volume Tabung = PI * r * r * t = " + Math.ceil(volume) + " cm");

        System.out.println(" ");


        System.out.println("Thank You....");
        System.out.println(" ");
       

    }

}
