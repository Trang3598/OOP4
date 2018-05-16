package BT4_Trang;

public class CongNhan extends Canbo {
	private String bac;

	public CongNhan(String ten, String namSinh, String gioiTinh, Diachi diaChi, String bac) {
		super(ten, namSinh, gioiTinh, diaChi);
		this.bac = bac;
	}

	
	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CongNhan(String ten, String namSinh, String gioiTinh, Diachi diaChi) {
		super(ten, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
	}


	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}

}
