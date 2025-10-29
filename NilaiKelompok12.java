import java.util.Scanner;
public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelompok = 1;
        double totalNilai, rataNilai;

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

            kelompok++;
        }
    }
}
