/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Saldotabungan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan saldo Awal (Rp.) :");
        int saldo = sc.nextInt();
        
        System.out.print("Masukan Bungan :");
        int bunga = sc.nextInt();
        
        System.out.print("Selama berapa Bulan:");
        double bulan = sc.nextDouble();
        
        int i=0;
       int sampai=6000000;
        
        
        while ( saldo <sampai){
             i++;
            if(i<=bulan){
            saldo+=saldo*bunga/100;
            System.out.println("Saldo di bulan ke-"+i +" Rp." + saldo);
            }
                }
        
    }
}
