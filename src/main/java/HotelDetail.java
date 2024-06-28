
//inheritance
public class HotelDetail extends Hotel {
    //overriding
    public HotelDetail (String namatamu, String kode, String namahotel){
        super(namatamu,kode,namahotel);
    }
    
public String getLantaiKamar(){
    String kodeLantai = getKodepesanan().substring(0,1);
    //seleksi if
    if(kodeLantai.equals("1")){
        return "Lantai 1";
    } else if (kodeLantai.equals("2")){
        return "Lantai 2";
    } else if (kodeLantai.equals("3")){
        return "Lantai 3";
    } else if (kodeLantai.equals("4")){
        return "Lantai 4";
    } else if (kodeLantai.equals("5")){
        return "Lantai 5";
    } else {
        return "Lantai tidak ada";
    }
}

public String getNomorKamar(){
    String kodeKamar = getKodepesanan().substring(1, 3);
    
    //seleksi switch
    switch(kodeKamar){
        case "01":
            return "01";
        case "02":
            return "02"; 
        case "03":
            return "03";
        case "04":
            return "04";
        case "05":
            return "05";
        case "06":
            return "07";
        case "08":
            return "08";
        default:
            return "Kamar Tidak Tersedia";
    }
}

public String getKelas(){
    String kodeKelas = getKodepesanan().substring(3, 6);
    switch(kodeKelas){
    case "001":
        return "Standar";
    case "002":
        return "Deluxe";
    case "003":
        return "Superior";
    case "004":
        return "Eksekutif";   
    case "005":
        return "Suite";
    case "006":
        return "Apartemen";
    default:
        return "Fasilitas Tidak Tersedia";
    }   
}

//polymorpshim (overriding)
public String infoHotel(){
    return super.infoHotel()+
            "\nLantai Kamar: "+getLantaiKamar()+
            "\nNomor Kamar: "+getNomorKamar()+
            "\nKelas Hotel: "+getKelas();
    }
}
