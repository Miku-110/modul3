import java.util.Scanner;

public class HitungRataRataKecepatanMotor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak yang ditempuh (dalam kilometer): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan waktu yang diperlukan (dalam jam): ");
        double waktu = input.nextDouble();

        input.close();

        // Menghitung rata-rata kecepatan motor
        double kecepatan = jarak / waktu;

        System.out.println("Rata-rata kecepatan motor adalah: " + kecepatan + " km/jam");
    }
}
