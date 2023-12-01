package datapegawai;

public class pegawaibaru{

    static void InsertData(String namaku, String nimku, int umurku, int gajiku) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	private final String nama;
	private final String nik;
	final int umur;
        final int gaji;
	
	public pegawaibaru(String nama, String nik, int umur, int gaji) {
		this.nama = nama;
		this.nik = nik;
		this.umur = umur;
                this.gaji = gaji;
	}
	
	public String getNama(){
		return nama;
	}
	
	public String getNik(){
		return nik;
	}
	
	public int getUmur(){
		return umur;
	}
        
	public int getGaji(){
		return gaji;
	}
		
	
        @Override
	public String toString(){
		return "Nama: " + nama + ", NPM: " + nik + ", Umur: " + umur + ", Gaji: " + gaji;
	}


}