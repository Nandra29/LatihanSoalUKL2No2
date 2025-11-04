import java.util.Scanner;

public class LatihanSoalUKL2Part2 {
    static double hitungVolume(double r, double t) {
        return 3.14 * r * r * t; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t); 
        System.out.println("Volume tabung adalah " + volume);
    }
}
