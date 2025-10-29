public class Tugas2Jobsheet8 {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5; 
        for (int i = 1; i <= n2; i++) {
            if (i <= n1) {
                for (int j = 1; j <= n1; j++) {
                    if (i == 1 || i == n1 || j == 1 || j == n1) {
                        System.out.print("3 ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 1; j <= n1; j++) {
                    System.out.print("  "); 
                }
            }
            System.out.print("    "); 
            for (int j = 1; j <= n2; j++) {
                if (i == 1 || i == n2 || j == 1 || j == n2) {
                    System.out.print("5 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
