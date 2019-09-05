package CHALENGE;
import java.util.Scanner;
public class chalenge2 {
    public static void main(String[] args) {
        //deklarasi nya 
        double nilaitugas;
       double nilailaporan;
      double nilaiujian;
     double total ;
      double nilai1;
       double nilai2;
        double nilai3;
      Scanner ren= new Scanner(System.in); 
      System.out.println("=============PROGRAM AKUMULASI NILAI================ ");
      System.out.println("====================by.rendi:)====================== "); 
      System.out.print("=>Masukan nilai tugas harian anda :");
      nilaitugas=ren.nextInt();
        System.out.print("=>Masukan nilai laporan anda :");
      nilailaporan=ren.nextInt();
        System.out.print("=>Masukan nilai ujian anda:");
      nilaiujian=ren.nextInt();
     
          //Rumus setiap nilai yang anda masukan GUYS
            nilai1 = nilaitugas*0.3;
            nilai2 = nilailaporan*0.2;
            nilai3 = nilaiujian*0.5;
          //Rumus setiap niali yang sudah anada masukan  YA GUYS
            total=nilai1+nilai2+nilai3;
          //System out print program
    if(total<=40){
             System.out.println("================TOTAL NILAI ANDA=======================");
             System.out.println("=>nlai anda kategori (F)"); 
             System.out.println("=>TOTAL AKUMULASI NILAI ANDA :"+total);         
             System.out.println("=>Anda tidak lulus tingkatkan belajar anda");
    }else if(total>=41&&total<=55){
            System.out.println("================TOTAL NILAI ANDA=======================");
            System.out.println("=>Nilai anda kategori (E)");
            System.out.println("=>TOTAL AKUMULASI NILAI ANDA :"+total);     
            System.out.println("=>Anda tidak lulus tingkatkan belajar anda");
    }else if(total>=56&&total<=74){
            System.out.println("================TOTAL NILAI ANDA=======================");
            System.out.println("=>Nilai anda kategori (D)");
            System.out.println("=>TOTAL AKUMULASI NILAI ANDA :"+total);     
            System.out.println("=>Anda tidak lulus tingkatkan belajar anda");
    }else if(total>=75&&total<=85){
            System.out.println("================TOTAL NILAI ANDA=======================");
            System.out.println("=>Nilai anda kategori (C)");
            System.out.println("=>TOTAL AKUMULASI NILAI ANDA :"+total);     
            System.out.println("=>Anda lulus dengan cukup,tingkatkan lagi prsetasimu");
    }else if(total>=86&&total<=92){
            System.out.println("================TOTAL NILAI ANDA=======================");
            System.out.println("=>Nilai anda kategori (B)");
            System.out.println("=>TOTAL AKUMULASI NILAI ANDA :"+total);     
            System.out.println("=>Anda lulus dengan baik pertahankan prestasimu :)");
    }else if(total>=93&&total<=100){
            System.out.println("================TOTAL NILAI ANDA=======================");
            System.out.println("=>Nilai anda kategori (A)");
            System.out.println("=>TOTAL AKUMULASI NILAI ANDA :"+total);     
            System.out.println("=>Anda lulus Excellent!!");
        
    }else if(total>=101&&total<=999999999){
            System.out.println("================NILAI APA ITU WOII!!!!!!!=======================");
            
    }
        
    
    
    
}
}