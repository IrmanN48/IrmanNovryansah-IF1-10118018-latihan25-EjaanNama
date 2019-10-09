/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan ejaan dari suatu nama atau 
 *                     kata.
 * 
 */
public class Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //variabel
        String nama;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.next();
        
        int len = nama.length();
        char[] arrChar = new char[len];
        
        //looping ejaan
        for (int no = 0; no <= len-1; no++){
            arrChar[no] = nama.charAt(no);
            System.out.println("Huruf ke-"+(no+1)+  " : "+arrChar[no]);
        }
    }
}
