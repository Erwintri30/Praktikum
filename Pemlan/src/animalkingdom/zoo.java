package animalkingdom;

import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        pantheraTigris harimau1 = new pantheraTigris();

        System.out.println("=====================");
        System.out.println("Vet v1.0");
        System.out.println("=====================");
        System.out.println("\nApa ID harimau anda?");
        harimau1.Id = scn.nextLine();
        System.out.println("\nsiapakah nama harimau?");
        harimau1.nama = scn.nextLine();
        System.out.println("Tahun berapa harimau mu lahir?");
        harimau1.tahun = scn.nextInt();
        harimau1.age = 2024 - harimau1.tahun;
        System.out.println("\nselamat datang " + harimau1.nama + " di Vet_v_1_0");
        System.out.println("\nTahun ini " + harimau1.nama + " telah berumur " + harimau1.age);
        System.out.println("\ningin mengaum? ya/tidak");

        String mengaum = scn.next();
        if (mengaum.equalsIgnoreCase("ya")) {
            System.out.println(harimau1.roar());
        } else {
            System.out.println("Baik tidak apa-apa, lain kali saja.");
        }

        System.out.println(" terimaksih telah menggunakan system ini");

        scn.close();

    }

}
