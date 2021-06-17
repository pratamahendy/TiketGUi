package GUI;

public class tiket {
	
	String JenisKereta, StasiunBerangkat, StasiunTiba, JumlahTiket, TanggalPembelian, TanggalBerangkat, HargaTotal;
	
	public tiket (String JK, String SB, String ST, String JE, String TP, String TB, String HT) {
		this.JenisKereta = JK;
		this.StasiunBerangkat = SB;
		this.StasiunTiba = ST;
		this.JumlahTiket = JE;
		this.TanggalPembelian = TP;
		this.TanggalBerangkat = TB;
		this.HargaTotal = HT;
		
				
	}

	@Override
	public String toString() {
		return "tiket [JenisKereta=" + JenisKereta + ", StasiunBerangkat=" + StasiunBerangkat + ", StasiunTiba="
				+ StasiunTiba + ", JumlahTiket=" + JumlahTiket + ", TanggalPembelian=" + TanggalPembelian
				+ ", TanggalBerangkat=" + TanggalBerangkat + ", HargaTotal=" + HargaTotal + "]";
	}

	public String getJenisKereta() {
		return JenisKereta;
	}

	public String getHargaTotal() {
		return HargaTotal;
	}

	public void setHargaTotal(String hargaTotal) {
		HargaTotal = hargaTotal;
	}

	public void setJenisKereta(String jenisKereta) {
		JenisKereta = jenisKereta;
	}

	public String getStasiunBerangkat() {
		return StasiunBerangkat;
	}

	public void setStasiunBerangkat(String stasiunBerangkat) {
		StasiunBerangkat = stasiunBerangkat;
	}

	public String getStasiunTiba() {
		return StasiunTiba;
	}

	public void setStasiunTiba(String stasiunTiba) {
		StasiunTiba = stasiunTiba;
	}

	public String getJumlahTiket() {
		return JumlahTiket;
	}

	public void setJumlahTiket(String jumlahTiket) {
		JumlahTiket = jumlahTiket;
	}

	public String getTanggalPembelian() {
		return TanggalPembelian;
	}

	public void setTanggalPembelian(String tanggalPembelian) {
		TanggalPembelian = tanggalPembelian;
	}

	public String getTanggalBerangkat() {
		return TanggalBerangkat;
	}

	public void setTanggalBerangkat(String tanggalBerangkat) {
		TanggalBerangkat = tanggalBerangkat;
	}
	
}
