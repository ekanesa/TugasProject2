package tugasproject2;
import java.util.Scanner;

public class TugasProject2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Hitung Volume Balok");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Cek Kubus");
            System.out.println("4. Exit");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hitungVolumeBalok(scanner);
                    break;
                case 2:
                    hitungLuasPermukaan(scanner);
                    break;
                case 3:
                    cekKubus(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 4);
    }

    private static void hitungVolumeBalok(Scanner scanner) {
        System.out.print("Input Nilai Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Input Nilai Lebar: ");
        double lebar = scanner.nextDouble();
        System.out.print("Input Nilai Tinggi: ");
        double tinggi = scanner.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);
        double volume = balok.hitungVolume();
        System.out.println("Volume Balok: " + volume);
    }

    private static void hitungLuasPermukaan(Scanner scanner) {
        System.out.print("Input Nilai Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Input Nilai Lebar: ");
        double lebar = scanner.nextDouble();
        System.out.print("Input Nilai Tinggi: ");
        double tinggi = scanner.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);
        double luasPermukaan = balok.hitungLuasPermukaan();
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
    }

    private static void cekKubus(Scanner scanner) {
        System.out.print("Input Nilai Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Input Nilai Lebar: ");
        double lebar = scanner.nextDouble();
        System.out.print("Input Nilai Tinggi: ");
        double tinggi = scanner.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);
        boolean isKubus = balok.isKubus();
        System.out.println("Apakah balok ini kubus? " + (isKubus ? "Ya" : "Tidak"));
    }
}

class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public boolean isKubus() {
        return panjang == lebar && lebar == tinggi;
    }
}