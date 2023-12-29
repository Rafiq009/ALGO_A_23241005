import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Data Member atau variabel
        int tot_belanja;

        // Membuat Objek scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Total Belanja");
        
        tot_belanja = input.nextInt();

        // Membuat Percabangan
        if (tot_belanja >= 50000){
            System.out.println("Selamat Dapat Mouse");
         } else {
                System.out.println("Tidak Dapat MOUSE");
            }
    

    }
}
