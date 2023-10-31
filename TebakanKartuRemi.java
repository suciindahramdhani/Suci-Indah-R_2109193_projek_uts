import java.util.Scanner;

public class TebakanKartuRemi{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tebakanJenis;
        int tebakanNomor;
        
        int jenisKartu = 1;
        int nomorKartu = 2;

        int countTebakJenis = 0;
        int countTebakNomor = 0;
   

        // Tahap-1: Pemain menebak jenis kartu
        while (true) {
            System.out.println("Masukkan tebakan Jenis kartu (1=berlian, 2=sekop, 3=hati, 4=keriting):");
            tebakanJenis = scanner.nextInt();
            countTebakJenis++;

            if (tebakanJenis == jenisKartu) {
                System.out.println("Benar!");
                break;
            } else {
                System.out.println("Salah.");
            }
        }

        // Tahap-2: Pemain menebak nomor kartu
        while (true) {
            System.out.println("Masukkan tebakan Nomor (1=Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11=Jack, 12=Queen, 13=King):");
            tebakanNomor = scanner.nextInt();
            countTebakNomor++;

            if (tebakanNomor == nomorKartu) {
                System.out.println("Benar!");
                break;
            } else {
                System.out.println("Salah.");
            }
        }

        // Menampilkan prestasi penebak
        System.out.println("Selamat, Anda menang setelah " + countTebakJenis + " kali menebak jenis, dan " + countTebakNomor + " kali menebak nomor.");
    }
}