import java.util.Scanner;
public class Tugas3Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        int totalPelangganAll = 0;
        int totalItemAll = 0;
        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            totalPelangganAll += pelanggan;
            int totalItemCabang = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);
            totalItemAll += totalItemCabang;
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganAll + " orang");
        System.out.println("Item terjual: " + totalItemAll + " item");
    }
}
