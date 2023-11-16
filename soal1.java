import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int masuk,keluar,lama ;
        Scanner scan = new Scanner (System.in);

        System.out.println("Masuk Jam :");
        masuk = scan.nextInt();
        System.out.println("Keluar Jam :");
        keluar = scan.nextInt();

        if(keluar >= masuk ){ 
            lama = keluar-masuk ;
        
        }else{lama =(12-masuk)+keluar;
        

        }
        System.out.println("Lama bekerja : "+lama + " jam");
        scan.close();

    }
}