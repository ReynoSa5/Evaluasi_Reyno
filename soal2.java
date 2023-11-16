import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int masuk, keluar, lama, biaya;
        Scanner scan = new Scanner(System.in);

        System.out.println("Jam masuk :");
        masuk = scan.nextInt();
        System.out.println("Jam keluar :");
        keluar = scan.nextInt();

        if(keluar >=masuk){
        lama = keluar -masuk;
        }else{lama =(12-masuk)+keluar;

        }
        if(lama >2){
            biaya = 2000 +(lama -2)*500;
        }else{
            biaya = 2000;
        }
        System.out.println("Lama Parkir :"+ lama + " Jam" );
        System.out.println("Biaya :"+biaya);
        scan.close();

    }
}
