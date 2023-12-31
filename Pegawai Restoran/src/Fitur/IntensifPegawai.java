import java.util.Scanner;

public class IntensifPegawai {
    public static void main(String[] args) {

        Scanner kata = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        String namaPegawai;
        char back;
        int gajiAwal = 4000000, jumlahIzin, nominalIzin = 100000, gajiAkhir, potIzin, intensifLembur = 25000, jmlLembur,
                gajiLembur, shiftMasuk;

        System.out.println("======================================");
        System.out.println("          Penggajian Pegawai         ");
        System.out.println("======================================");
        System.out.print("Masukkan Nama Pegawai: ");
        namaPegawai = kata.nextLine();
        System.out.print("Masukkan jumlah izin (shift) : ");
        jumlahIzin = number.nextInt();
        System.out.print("Masukkan jumlah lembur (jam): ");
        jmlLembur = number.nextInt();

        shiftMasuk = 30 - jumlahIzin;
        potIzin = jumlahIzin * nominalIzin;
        gajiLembur = jmlLembur * intensifLembur;
        gajiAkhir = gajiAwal - potIzin + gajiLembur;

        System.out.println("\n\n\n==============================================================");
        System.out.println("                 Slip Gaji Pegawai Restoran 1C                ");
        System.out.println("==============================================================\n");
        System.out.println("Nama Pegawai\t: " + namaPegawai);
        System.out.println("Shift Masuk\t: " + shiftMasuk + " shift");
        System.out.println("Shift Izin\t: " + jumlahIzin + " shift");
        System.out.println("Lembur\t\t: " + jmlLembur + " jam\n");
        System.out.println("==============================================================\n");
        System.out.println("Gaji Pokok\t: " + gajiAwal);
        System.out.println("Potongan izin\t: " + potIzin);
        System.out.println("Gaji Lembur\t: " + gajiLembur + "\n");
        System.out.println("==============================================================\n");
        System.out.println("Total Gaji Akhir: " + "Rp " + gajiAkhir + "\n");
        System.out.println("==============================================================");

        System.out.print("Apakah anda ingin kembali ke menu? (Y/N): ");
        back = kata.next().charAt(0);

        if (back == 'y' || back == 'Y') {
            System.out.println("Kembali ke list menu");
        } else if (back == 'n' || back == 'N') {
            System.out.println("Tetap pada menu");
        } else {
            System.out.println("Input yang anda masukkan tidak sesuai!");
        }
    }
}
