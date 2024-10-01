/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilaimahasiswa;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class PotonganPembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan total pembelian (Rp): ");
        double totalPembelian = scanner.nextDouble();
        
        double potongan;
        double totalBayar;
        
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;  
        } else {
            potongan = 0.2 * totalPembelian;   
        }
        totalBayar = totalPembelian - potongan;
        
        System.out.println("Total pembelian Rp. = " + totalPembelian);
        System.out.println("Besarnya potongan Rp. = " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + totalBayar);
        scanner.close();
    }
    
}
