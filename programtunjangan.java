import java.util.Scanner;

public class ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========Program Tunjangan==========");

        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum)    : ");
        String status = input.next();

        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n==========Hasil Perhitungan Gaji Anda==========");
        System.out.printf("Gaji Pokok       : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan        : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji       : Rp %.1f%n", totalGaji);
        System.out.println("\n(Developed by: Rizki Adam Kurniawan)");

        input.close();
    }
}
