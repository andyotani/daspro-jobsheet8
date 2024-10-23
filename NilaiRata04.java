import java.util.Scanner;

public class NilaiRata04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, total, i = 0;
        double rata2;

        while (i < 5) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            total = 0;

            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai ke-" + (j + 1) + " = ");
                nilai = sc.nextInt();
                total += nilai;
            }

            rata2 = total / 5.0;
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + " = " + rata2);
            i++;
        }

        System.out.println();
    }
}
