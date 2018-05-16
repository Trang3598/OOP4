package BT4_Trang;

public class Canbo {
	private String ten, namSinh, gioiTinh;
	private Diachi diaChi;

	public Canbo(String ten, String namSinh, String gioiTinh, Diachi diaChi) {
		super();
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public Canbo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Diachi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(Diachi diaChi) {
		this.diaChi = diaChi;
	}

}
