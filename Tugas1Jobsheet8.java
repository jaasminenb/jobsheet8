import java.util.Scanner;
public class Tugas1Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        for (int n = 1; n <= 5; n++) { 
            jumlah += n * n;
            System.out.print("n = " + n + " → jumlah kuadrat = ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i * i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}
