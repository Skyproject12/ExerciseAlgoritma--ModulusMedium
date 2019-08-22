package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char pilih;
        boolean jawaban=false  ;
        int  a, s , i;
        String n;
        Scanner scan = new Scanner(System.in);
          do {
            System.out.println("masukkan nama kalian :");
            n= scan.next()
;            System.out.println("masukkan  nim :");
            a = scan.nextInt();
            s = a % 10;
            System.out.println ("angka terakhir nim kalian adalah" + s);
                for (i=0;i<=100 ; i++){
                if (i % 2 == 0)
                    continue;
                    System.out.print(+i +" , ");
                }


            System.out.println("apakah anda ingin mengulang inputan (y/n) ");
            pilih=scan.next().charAt (0);

            if (pilih=='y'){
                jawaban=true;
            }
            if (pilih=='n'){
                System.out.println("ok");
                jawaban=false;

            }

        }while (jawaban==true);


    }

}