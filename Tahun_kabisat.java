import java.util.Scanner;

public class Tahun_kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt() ;

        if (tahun % 400 == 0) {
            System.out.println(tahun+" Merupakan Tahun kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun+" Bukan Tahun Kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println(tahun+" Merupakan Tahun Kabisat");
        } else {
            System.out.println(tahun+" Bukan Tahun Kabisat");
        }
    }
}
