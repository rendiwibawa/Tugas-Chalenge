package CHALENGE;
import java.util.Scanner;
import java.text.NumberFormat;
public class chalenge1 {
    public static void main(String[] args) {
      double penjualan;
      double hasil;
      double komisi;
      double total;
       Scanner ren= new Scanner(System.in); 
       System.out.print("========Masukan hasil penjualan anda kali ini============ :\n=>Rp.");
      penjualan=ren.nextInt();
        if(penjualan<=20000){
            System.out.println("anda berhasil menjual kurang dari 20.000");
            komisi=penjualan*0.1;
            System.out.println("komisi anda adalah  :Rp."+NumberFormat.getCurrencyInstance().format(komisi));
            total = komisi+10000;
            System.out.println("di tambah dengan Rp.10.000");
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
}else
        if(penjualan>20000&&penjualan<=50000){
            System.out.println("anda berhasil menjual lebih dari 20.000");
            komisi=penjualan*0.15;
            System.out.println("komisi anda adalah  :Rp."+NumberFormat.getCurrencyInstance().format(komisi));
            total = komisi+20000;
             System.out.println("di tambah dengan Rp.20.000");
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
}else
            if(penjualan>50000&&penjualan<=100000){
            System.out.println("anda berhasil menjual barang di atas Rp.50.000");
            komisi=penjualan*0.2;
            System.out.println("komisi anda adalah  :Rp."+NumberFormat.getCurrencyInstance().format(komisi));
            total = komisi+30000;
             System.out.println("di tambah dengan Rp.30.000");
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
}else
                if(penjualan>100000&&penjualan<150000){
            System.out.println("anda berhasil menjual barang di atas Rp.100.000");
            komisi=penjualan*0.3;
            System.out.println("komisi anda adalah  :Rp."+NumberFormat.getCurrencyInstance().format(komisi));
            total = komisi+50000;
             System.out.println("di tambah dengan Rp.50.000");
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
}else
                    if(penjualan>150000){
            System.out.println("anda berhasil menjual barang di atas Rp.150.000");
            komisi=penjualan*0.4;
            System.out.println("komisi anda adalah  :Rp."+NumberFormat.getCurrencyInstance().format(komisi));
            total = komisi+75000;
             System.out.println("di tambah dengan Rp.75.000");
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
}
}
}
    

