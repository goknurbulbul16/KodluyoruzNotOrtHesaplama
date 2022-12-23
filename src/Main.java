
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat,fizik,muzik,kimya,tarih,turkce;

        System.out.print("matematik notu: ");
        mat = input.nextInt();
        System.out.print("tarih notu: ");
        tarih = input.nextInt();
        System.out.print("fizik notu: ");
        fizik = input.nextInt();
        System.out.print("muzik notu: ");
        muzik = input.nextInt();
        System.out.print("kimya notu: ");
        kimya = input.nextInt();
        System.out.print("turkce notu: ");
        turkce = input.nextInt();


        int toplam = (muzik+tarih+turkce+mat+kimya+fizik);
        float ort = toplam / 5;
        System.out.println();
        String a = (ort < 60) ? "Dersten Kaldınız." : "Dersten Geçtiniz";
        System.out.print("Ortalamanız: "+ort+" "+a);
    }
}