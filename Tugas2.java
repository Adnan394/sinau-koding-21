package tugas.pkg2;

public class Tugas2 {
    static int angka=15;
    static int jumlah=0;
    
    public static void main(String[] args) {
        for (int j = 1; j <= angka; j++) {
            for (int i = 1; i <= j; i++){
                if(j%i==0) {
                    jumlah++;
                }          
            }
            
            if(jumlah==2) {
                System.out.println(j + " : adalah bilangan prima");
            }else {
                System.out.println(j + " : bukan bilangan prima");
            }
            jumlah=0;
        }
//        for (int i = 1; i <= angka; i++){
//            if(angka%i==0) {
//                jumlah++;
//            }          
//        }
//        
//        if(jumlah==2) {
//            System.out.println(angka + "adalah bilangan prima");
//        }else {
//            System.out.println(angka + "bukan bilangan prima");
//        }
        
    }
    
}
