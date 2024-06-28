import java.util.Scanner;

public class HotelBeraksi {
    public static void main(String[] args){
        //object
        //Hotel tamu = new Hotel("Annisa","101001","Aston");
        
        //System.out.println(tamu.infoHotel());
        //System.out.println(tamu.infoHotel("400000"));
        
        //eror handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            HotelDetail[] tamu = new HotelDetail[2];
            
            //perulangan
            for(int i=0; i<tamu.length; i++){
               System.out.print(" 1. Masukkan Nama Tamu : ");
               String namatamu = scanner.nextLine();
               System.out.print(" 2. Masukkan Kode Pesanan : ");
               String kode = scanner.nextLine();
               System.out.print(" 3. Masukkan Nama Hotel : ");
               String harga = scanner.nextLine();
               
               //objek
               tamu[i] = new HotelDetail(namatamu, kode, harga);
            }
            
            //perulangan
            for(HotelDetail data: tamu){
                System.out.println ("=================");
                System.out.println ("Data Tamu Hotel: ");
                System.out.println (data.infoHotel());
            }
        
        } catch (NumberFormatException e){
            System.out.println ("Kesalahan Format Nomor:"+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
              System.out.println ("Kesalahan Format Kode Pesanan:"+e.getMessage());
        }catch (Exception e){
              System.out.println ("Kesalahan umum:"+e.getMessage());
        }
    }
            
}
