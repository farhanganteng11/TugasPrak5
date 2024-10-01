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

public class IndeksMassaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();
     
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
        scanner.close();
        
    }
    
}
