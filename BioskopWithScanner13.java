import java.util.Scanner;
public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next, menu;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("Menu 1 : input data penonton");
            System.out.println("Menu 2 : Tampilkan daftar penonton");
            System.out.println("Menu 3 : Exit");
            System.out.print("Silah kan pilih Menu :");
            menu = sc.nextLine();
            if (menu.equalsIgnoreCase("3")) {
                break;
            }

            if (menu.equalsIgnoreCase("1")) {
                while (true) {
                    System.out.print("Masukkan nama  : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris > 4 || baris < 1 || kolom > 2 || kolom < 1) {
                        System.out.println("KURSI TIDAK TERSEDIA SILAHKAN INPUT ULANG !!!");
                        continue;
                    }

                    if (penonton[baris-1][kolom-1] == null){
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("KURSI SUDAH TERISI !!!");
                        continue;
                    }

                    System.out.print("Input penonton lainnya (y/n) : ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                }
            }

            if (menu.equalsIgnoreCase("2")){
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Penonton Baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " : ***");
                        }else {
                            System.out.println("Penonton Baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " : " + penonton [i][j]);
                        }
                    }
                }
            }
        }while (true);
    }
}
