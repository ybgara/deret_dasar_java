import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Latihan Java Dasar Perhitungan Deret ");

        int A, B      ;
        int Hasil = 0 ;
        int Temp = 0  ;

        Scanner InputUser = new Scanner(System.in) ;

        System.out.print(" Masukkan Nilai A : ");
        A = InputUser.nextInt();
        System.out.print(" Masukkan NIlai B : ");
        B = InputUser.nextInt();

        System.out.println(" Hasil : ");

        // DELETE THE COMMENT AND CHOOSE ONE

        // DO WHILE
//        do {
//            Hasil += A ;
//
//            System.out.printf(" Nilai %d + %d = %d \n", A, Temp, Hasil);
//
//            Temp = Hasil ;
//            A++;
//        }while( A <= B ) ;

        // DELETE THE COMMENT AND CHOOSE ONE

        // FOR
//        for ( int i = 0 ; i < B ; i++ ){
//            Hasil += A ;
//
//            System.out.printf(" Nilai %d + %d = %d \n", A, Temp, Hasil);
//
//            Temp = Hasil ;
//            A++;
//        }
    }
}