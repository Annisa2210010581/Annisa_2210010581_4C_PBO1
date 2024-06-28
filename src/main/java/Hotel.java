
public class Hotel {
  //atribut encapsulation
    private String namatamu;
    private String kode;
    private String namahotel;
    
    //constructor
    public Hotel(String namatamu, String kode, String namahotel) {
        this.namatamu = namatamu;
        this.kode = kode;
        this.namahotel = namahotel;
    }
    
    //mutator setter
    public void setNamatamu (String namatamu) {
        this.namatamu = namatamu;
    }
    
    public void setKodepesanan (String kode){
        this.kode = kode;
    }
    
    public void setNamahotel (String namahotel) {
        this.namahotel = namahotel;
    }
    
    //accsessor getter
    public String getNamatamu() {
        return namatamu;
    }
    
     public String getKodepesanan() {
        return kode;
     }
     
     public String getNamahotel() {
         return namahotel;
     }
     
     public String infoHotel() {
         return "Nama Tamu: "+getNamatamu()+
                 "\nKode Pesanan: "+getKodepesanan()+
                 "\nNama Hotel: "+getNamahotel();
     }
     
     //polymorphism (overloading)
     public String infoHotel(String harga) {
         return infoHotel() + "\nHarga : "+harga;
     }
}
