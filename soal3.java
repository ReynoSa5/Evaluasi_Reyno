import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        int pilihan ;
        float fr1,fr2,fr3,frespengganti;
        Scanner scan = new Scanner (System.in);

        System.out.println("fr1 :");
        fr1 = scan.nextFloat();
        System.out.println("fr2 :");
        fr2 = scan.nextFloat();
        System.out.println("fr3 :");
        fr3 = scan.nextFloat();
        System.out.println("Pilihan :");
        pilihan = scan.nextInt();
        boolean pilihansalah = true;

        switch(pilihan){
            case 1:
            frespengganti = fr1 + fr2 + fr3;
            break;
            case 2:
            frespengganti = (fr1*fr2*fr3)/(fr1+fr2+fr3);
            break;
            default:
            pilihansalah = false;
            System.out.println("Pilihan salah");
            break;
        }
        
        System.out.println("Resistor :"+pilihan);

    }
    
}
