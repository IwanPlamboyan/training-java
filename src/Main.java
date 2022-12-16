// import java.io.*;
import java.util.Scanner;

public class Main {
    // public static void main(String[] args) throws IOException {
    public static void main(String[] args) {
        // Membuat Object HP
        Phone redmiNote8 = new Xiaomi();

        // Membuat object user
        PhoneUser dian = new PhoneUser(redmiNote8);

        // Kita coba nyalakan HP-nya
        dian.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while(true) {
            System.out.println("== APLIKASI INTERFACE ==");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar volume");
            System.out.println("[4] Perkecil volume");
            System.out.println("[0] Keluar");
            System.out.println("------------------------");
            System.out.print("Pilih aksi>");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")) {
                dian.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")) {
                dian.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")) {
                dian.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            }else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }



        // InputStreamReader cin = null;

        // try {
        //     cin = new InputStreamReader(System.in);
        //     System.out.println("Enter characters, 'q' to quit ");

        //     char c;
        //     do {
        //         c = (char) cin.read();
        //         System.out.print(c);
        //     }while (c != 'q');
        // }finally {
        //     if (cin != null) {
        //         cin.close();
        //     }
        // }




//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try {
//            in = new FileInputStream("input.txt");
//            out = new FileOutputStream("output.txt");
//
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        }finally {
//            if(in != null) {
//                in.close();
//            }
//            if(out != null) {
//                out.close();
//            }
//        }

//        System.out.println("Hello world!");
    }
}