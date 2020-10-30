/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan30.cakep;

import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menampilkan kepribadian dari warna
 */
public class PBOIF210119053Latihan30Cakep {
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    
    public static void jawaban(String jawab){
        if("Yoi".equals(jawab)){
            System.out.println(RED + "Cakep Bener." + PURPLE + " Good Job");
        } else {
            System.out.println(RED + "Tetep cakep sih.");
            System.out.println(CYAN + "Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawab;
        
        System.out.println(RED + "Kamu" + GREEN + " ngerjain sendiri" + YELLOW + " latihan 17 sampe" + BLUE + " latihan 30 ini?");
        System.out.print(BLUE + "Jawab" + RED + "(Yoi/Enggak) : ");
        jawab = input.next();
        System.out.println("");
        jawaban(jawab);
    }
 
}
