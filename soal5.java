import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int jam,gol,gaji,upah =0;

        System.out.println("Golongan :");
        gol = scan.nextInt();
        System.out.println("Jam Kerja");
        jam = scan.nextInt();

        switch(gol){
            case 1:
            upah = 3000;
            break;
            case 2:
            upah = 3500;
            break;
            case 3:
            upah = 4000;
            break;
            case 4:
            upah = 5000;
            break;

        }
        gaji = jam * upah;

        if((jam - 48)> 0){
            gaji = (int) (upah +((jam-48)*1.5*upah));
        }
        System.out.println("Total gaji :"+gaji);
        scan.close();
    }
    
}
