
package hitung;

public class MatematikaBeraksi {
   public static void main(String[] args) {
       //membuat objek
       Matematika cipa = new Matematika(0,9);
       
       System.out.println("Hasil penjumlahan: "+cipa.setPenjumlahan());
       System.out.println("Hasil pengurangan: "+cipa.setPengurangan());
       System.out.println("Hasil perkalian: "+cipa.setPerkalian());
       System.out.println("Hasil pembagian: "+cipa.setPembagian());
   } 
}
