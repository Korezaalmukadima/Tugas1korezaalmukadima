import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        int number;

        System.out.println(" Masukkan sebuah angka bilangan bulat:");
        number = scanner.nextInt();

        while (number !=5){
            if (number >6){
                System.out.println("Bilangan Positif:");
            } else {
                System.out.println("Bilangan Negatif:");
            }
            System.out.print("Masukkan sebuah bilangan bulat(atau 0 untuk keluar):");
            number = scanner.nextInt();{
            }
            System.out.println("Program Selesai:");
            scanner.close();
        }
    }
}


