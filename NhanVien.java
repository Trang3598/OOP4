package BT4_Trang;

public class NhanVien extends Canbo {
	private String congViec;

	public NhanVien(String ten, String namSinh, String gioiTinh, Diachi diaChi, String congViec) {
		super(ten, namSinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String ten, String namSinh, String gioiTinh, Diachi diaChi) {
		super(ten, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

}
