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

public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Nilai Kehadiran: ");
        double nilaiKehadiran = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();
        
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        char grade;
        String keterangan;
        
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir < 76) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 66) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir < 56) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa  : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade          : " + grade);
        System.out.println("Keterangan     : " + keterangan);
        scanner.close();
    }
    }