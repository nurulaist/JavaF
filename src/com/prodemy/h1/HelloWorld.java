package com.prodemy.h1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Siapa Namamu? ");
        String Nama = sc.nextLine();
        System.out.println("Halo Selamat Malam " + Nama);

        sc = new Scanner(System.in);
        System.out.print("Tinggal di daerah mana? ");
        String Nama_Kota = sc.nextLine();
        System.out.print("Selamat Datang di " + Nama_Kota);
    }
}
