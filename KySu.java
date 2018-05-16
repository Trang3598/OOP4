package BT4_Trang;

public class KySu extends Canbo {
	private String nganhDt , loaiBang;

	public KySu(String ten, String namSinh, String gioiTinh, Diachi diaChi, String nganhDt, String loaiBang) {
		super(ten, namSinh, gioiTinh, diaChi);
		this.nganhDt = nganhDt;
		this.loaiBang = loaiBang;
	}

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String ten, String namSinh, String gioiTinh, Diachi diaChi) {
		super(ten, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	public String getNganhDt() {
		return nganhDt;
	}

	public void setNganhDt(String nganhDt) {
		this.nganhDt = nganhDt;
	}

	public String getLoaiBang() {
		return loaiBang;
	}

	public void setLoaiBang(String loaiBang) {
		this.loaiBang = loaiBang;
	}
	

}
