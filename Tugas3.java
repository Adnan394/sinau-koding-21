package tugas.pkg3;

import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
    int pilihan, pilihan2;
    float sisi,panjang,lebar,hasil;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("menghitung luas dan keliling bangun datar");
            System.out.println("===================MENU===============");
            System.out.println("1. Persegi panjang");
            System.out.println("2. Persegi");
            System.out.println("3. keluar");
            System.out.println("===================MENU===============");
            System.out.print("masulan pilihan : ");
            pilihan = input.nextInt();
            if(pilihan == 1) {
                System.out.println("==============KELILING / LUAS===============");
                System.out.println("1. Keliling persegi panjang");
                System.out.println("2. luas Persegi panjang");
                System.out.println("3. keluar");
                System.out.println("============================================");
                System.out.print("masulan pilihan : ");
                pilihan2 = input.nextInt();
                if(pilihan2 == 1) {
                    System.out.print("masukan panjang : ");
                    panjang = input.nextInt();
                    System.out.print("masukan lebar : ");
                    lebar = input.nextInt();
                    hasil = 2 * (panjang + lebar);
                    System.out.println("keliling persegi panjang adalah : " + hasil);
                }else if(pilihan2 == 2){
                    System.out.print("masukan panjang : ");
                    panjang = input.nextInt();
                    System.out.print("masukan lebar : ");
                    lebar = input.nextInt();
                    hasil = panjang * lebar;
                    System.out.println("keliling persegi panjang adalah : " + hasil);
                }else{
                    System.exit(0);
                }
            }else if(pilihan == 2){
                System.out.println("==============KELILING / LUAS===============");
                System.out.println("1. Keliling persegi");
                System.out.println("2. luas Persegi");
                System.out.println("3. keluar");
                System.out.println("============================================");
                System.out.print("masulan pilihan : ");
                pilihan2 = input.nextInt();
                if(pilihan2 == 1) {
                    System.out.print("masukan Sisi : ");
                    sisi = input.nextInt();
                    hasil = 4 * sisi;
                    System.out.println("keliling persegi panjang adalah : " + hasil);
                }else if(pilihan2 == 2){
                    System.out.print("masukan sisi : ");
                    sisi = input.nextInt();
                    hasil = sisi * sisi;
                    System.out.println("keliling persegi panjang adalah : " + hasil);
                }else{
                    System.exit(0);
                }
            }
            
            if(pilihan == 3){
                System.exit(0);
            }
        }
    }
    
}
