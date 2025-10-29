import java.util.Scanner;
public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelompok = 1;
        double totalNilai, rataNilai;
        double tertinggi = 0;
        int kelompokTertinggi = 0;
        while (kelompok <= 6) {
            totalNilai = 0;
            System.out.println("Kelompok " + kelompok);
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari penilai ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + kelompok + " = " + rataNilai);
            System.out.println();
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelompokTertinggi = kelompok;
            }
            kelompok++;
        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah: Kelompok " + kelompokTertinggi);
        System.out.println("Nilai rata-rata tertinggi: " + tertinggi);
    }
}
