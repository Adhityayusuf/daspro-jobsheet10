import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data [][] = new int [6][10];
        int pertanyaan [] = new int [6];
        int respon [] = new int [10];
        int totalper = 0;
        double ratPer = 0, ratRes = 0, ratAll = 0;

        System.out.println("======= PENGINPUTAN SURVEI KEPUASAN =======");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Pertanyaan ke-" + (i + 1 ));
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("Masukkan Respon (1-5) ke-" + (j + 1) + " : ");
                data [i][j] = sc.nextInt();
                if (data [i][j] > 5 || data [i][j] < 1) {
                    j--;
                } else {
                pertanyaan [i] += data [i][j];
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                respon [i] += data [j][i];
            }
        }
        System.out.println();
        System.out.println("======= RATA-RATA DARI NILAI PERTANYAAN ======");
        for (int i = 0; i < 6; i++) {
            ratPer = pertanyaan[i] / 10;
            totalper += pertanyaan[i];
            System.out.println("Rata-rata dari pertanyaan ke-" + (i + 1) + " : " + ratPer);
        }
        System.out.println();
        System.out.println("======= RATA-RATA DARI NILAI RESPON =======");
        for (int i = 0; i < 10; i++) {
            ratRes = respon[i] / 6;
            System.out.println("Rata-rata dari respon ke-" + (i + 1) + " : " + ratRes);
        }
        System.out.println();
        ratAll = totalper / 60;
        System.out.println("Rata-rata keseluruhan : " + ratAll);
        System.out.println("======= SELESAI =======");
    }
}