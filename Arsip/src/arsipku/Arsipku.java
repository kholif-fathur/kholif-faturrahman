package arsipku;
public class Arsipku implements Kelompok, Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ar = new Arsipku();
        ar.nama();
        ar.tempatLahir();
        ar.hobi();
        ar.agama();
        ar.bahasaIndonesia();
        ar.matematika();
        ar.namaKelompok();
    }
    
    public void namaKelompok(){
        System.out.println("----- Nama Kelompok -----");
        System.out.println("1. Dimas Setiadi");
        System.out.println("2. Diki Sudarsono");
        System.out.println("3. M.Feri Siswanto");
        System.out.println("4. irfan Prasetyo");
        System.out.println("5. Kholif Faturrohman");
        System.out.println("6. Abdul Bais Q.G.M.I.D.M");
        System.out.println("7. Lutfian Ali Putra");
    }

   public void nama(){
       System.out.println("----- Biodata -----");
       System.out.println("Namaku = KHOLIF FATURRAHMAN");
   }
   
   public void tempatLahir(){
       System.out.println("Tempat Lahir = Makassar");
   }
   
   public void hobi(){
       System.out.println("Hobi = Bermain Game");   
   }
   
   public void agama(){
       System.out.println("----- Nilai -----");
       System.out.println("Matematika =30 ");
   }
   
   public void bahasaIndonesia(){
       System.out.println("Bahasa Indonesia = 80");
   }
   
   public void matematika(){
       System.out.println("Fisika = 2510");
   }
    
}
