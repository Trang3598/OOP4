 package BT4_Trang;

import java.util.Scanner;

import Bt3_Trang.Person;

public class QuanLy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scstr = new Scanner(System.in);
		QuanLy quanLy = new QuanLy();
		Diachi diaChi = new Diachi();
		Canbo[] dsCanbo = null;
		CongNhan[] dsCongNhan = null;
		KySu[] dsKySu = null;
		NhanVien[] dsNhanVien = null;

		int soCongNhan = 0;
		int soKySu;
		int soNhanVien;
		int luachon;

		String ngCantim;
		do {

			System.out.println("Chon 1 : Nhap dach sach cong nhan");
			System.out.println("Chon 2 : Nhap danh sach ky su ");
			System.out.println("Chon 3 : Nhap danh sach nhan vien");
			System.out.println("Chon 4 : Hien thi danh sach da nhap ");
			System.out.println("Chon 5 : Tim kiem theo ten  ");
			System.out.println("Chon 6 : Ket thuc chương trinh ");
			System.out.println("===================================");
			System.out.println("Moi ban nhap lua chon");
			luachon = sc.nextInt();

			switch (luachon) {

			case 1:
				System.out.println("Nhap so cong nhan ");
				soCongNhan = sc.nextInt();
				dsCongNhan = quanLy.enterDSCongNhan(soCongNhan);
				break;
			case 2:
				System.out.println("Nhap so ky su");
				soKySu = sc.nextInt();
				dsKySu = quanLy.enterDSKySu(soKySu);

				break;
			case 3:
				System.out.println("Nhap so nhan vien");
				soNhanVien = sc.nextInt();

				dsNhanVien = quanLy.enterDSNhanVien(soNhanVien);
				break;

			case 4:
				System.out.println("-------Danh sách đã nhập là ---------");
				if (dsNhanVien != null) {
					System.out.println("Danh sach nhan vien");
					quanLy.showDSNhanVien(dsNhanVien);

				} else {
					System.out.println("KHONG CO NHAN VIEN NAO DUOC NHAP !");
					System.out.println("---------------------------");

				}

				if (dsCongNhan != null) {
					System.out.println("Danh sach cong nhan");
					quanLy.showDSCongNhan(dsCongNhan);
				} else {
					System.out.println("KHONG CO CONG NHAN NAO DUOC NHAP !");
					System.out.println("-----------------------");
				}

				if (dsKySu != null) {
					System.out.println("Danh sach ky su");
					quanLy.showDsKySu(dsKySu);
				} else {
					System.out.println("KHONG CO KI SU NAO DUOC NHAP ");
					System.out.println("-----------------------");
				}
				break;
			case 5:
				System.out.println("Nhap  nguoi ban muon tim ");
				ngCantim = scstr.nextLine();
				System.out.println("Thông tin người bạn đang tìm là : ");
				quanLy.search(dsNhanVien, dsKySu, dsCongNhan, ngCantim);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (luachon != 0);
	}

	private Diachi enterDiachi() {
		Scanner scStr = new Scanner(System.in);

		// String soNha , ngach , ngo , duong , phuong , quan , thanhPho ;
		Diachi diaChi = new Diachi();

		System.out.println("So nha : ");
		diaChi.setSoNha(scStr.nextLine());

		System.out.println("Ngach : ");
		diaChi.setNgach(scStr.nextLine());

		System.out.println("Ngo : ");
		diaChi.setNgo(scStr.nextLine());

		System.out.println("Duong : ");
		diaChi.setDuong(scStr.nextLine());

		System.out.println("Phuong : ");
		diaChi.setPhuong(scStr.nextLine());

		System.out.println("Quan : ");
		diaChi.setQuan(scStr.nextLine());

		System.out.println("Thanh pho : ");
		diaChi.setThanhPho(scStr.nextLine());
		return diaChi;

	}

	private CongNhan enterCongNhan() {
		Scanner scStr = new Scanner(System.in);
		CongNhan congnhan = new CongNhan();
		System.out.println("Nhap ten : ");
		congnhan.setTen(scStr.nextLine());

		System.out.println("Nhap nam sinh  : ");
		congnhan.setNamSinh(scStr.nextLine());

		System.out.println("Nhap gioi tinh");
		congnhan.setGioiTinh(scStr.nextLine());

		System.out.println("Nhap dia chi");
		Diachi diaChi = null;
		congnhan.setDiaChi(enterDiachi());

		System.out.println("Nhap bac ");
		congnhan.setBac(scStr.nextLine());
		return congnhan;

	}

	private KySu enterKySu() {
		Scanner scStr = new Scanner(System.in);
		KySu kysu = new KySu();

		System.out.println("Nhap ten : ");
		kysu.setTen(scStr.nextLine());

		System.out.println("Nhap nam sinh  : ");
		kysu.setNamSinh(scStr.nextLine());

		System.out.println("Nhap gioi tinh");
		kysu.setGioiTinh(scStr.nextLine());

		System.out.println("Nhap dia chi");
		Diachi diaChi = null;
		kysu.setDiaChi(enterDiachi());

		System.out.println("Nganh dao tao");
		kysu.setNganhDt(scStr.nextLine());

		System.out.println("Loai bang");
		kysu.setLoaiBang(scStr.nextLine());

		return kysu;

	}

	private NhanVien enterNhanVien() {
		// TODO Auto-generated method stub
		Scanner scStr = new Scanner(System.in);
		NhanVien nhanvien = new NhanVien();

		System.out.println("Nhap ten : ");
		nhanvien.setTen(scStr.nextLine());

		System.out.println("Nhap nam sinh  : ");
		nhanvien.setNamSinh(scStr.nextLine());

		System.out.println("Nhap gioi tinh");
		nhanvien.setGioiTinh(scStr.nextLine());

		System.out.println("Nhap dia chi");
		Diachi diaChi = null;
		nhanvien.setDiaChi(enterDiachi());

		System.out.println("Nhap cong viec");
		nhanvien.setCongViec(scStr.nextLine());
		return nhanvien;
	}

	private CongNhan[] enterDSCongNhan(int soCongNhan) {
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		CongNhan[] dsCongNhan = new CongNhan[soCongNhan];
		for (int i = 0; i < dsCongNhan.length; i++) {
			System.out.println("Nguoi thu" + (i + 1));
			dsCongNhan[i] = enterCongNhan();
		}
		return dsCongNhan;

	}

	private KySu[] enterDSKySu(int soKySu) {
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		KySu[] dsKySu = new KySu[soKySu];
		KySu kysu = new KySu();
		for (int i = 0; i < dsKySu.length; i++) {
			System.out.println("Nguoi thu" + (i + 1));
			dsKySu[i] = enterKySu();
		}
		return dsKySu;

	}

	private NhanVien[] enterDSNhanVien(int soNhanvien) {
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		NhanVien[] dsNhanVien = new NhanVien[soNhanvien];
		for (int i = 0; i < dsNhanVien.length; i++) {
			System.out.println("Nguoi thu" + (i + 1));
			dsNhanVien[i] = enterNhanVien();

		}
		return dsNhanVien;
	}

	// String soNha , ngach , ngo , duong , phuong , quan , thanhPho ;

	private void showDSCongNhan(CongNhan[] dsCongNhan) {
		int dem = 0;
		for (CongNhan congNhan : dsCongNhan) {
			System.out.println("Người thứ  " + (++dem));
			System.out.println("\tTên : " + congNhan.getTen());
			System.out.println("\tNăm sinh : " + congNhan.getNamSinh());
			System.out.println("\tGiới tính : " + congNhan.getGioiTinh());
			System.out.println("\tCấp bậc : " + congNhan.getBac());
			System.out.println("\tSố nhà : " + congNhan.getDiaChi().getSoNha());
			System.out.println("\tNgách : " + congNhan.getDiaChi().getNgach());
			System.out.println("\tNgõ : " + congNhan.getDiaChi().getNgo());
			System.out.println("\tĐường : " + congNhan.getDiaChi().getDuong());
			System.out.println("\tPhường : " + congNhan.getDiaChi().getQuan());
			System.out.println("\tQuận : " + congNhan.getDiaChi().getQuan());
			System.out.println("\tThành phố	: " + congNhan.getDiaChi().getThanhPho());
			System.out.println("=============================");
		}

	}

	private void showDsKySu(KySu[] dsKySu) {
		int dem = 0;
		for (KySu kySu : dsKySu) {
			System.out.println("Người thứ " + (++dem));
			System.out.println("\tTên	: " + kySu.getTen());
			System.out.println("\tNăm sinh : " + kySu.getNamSinh());
			System.out.println("\tGiới tính : " + kySu.getGioiTinh());
			System.out.println("\tLoại bằng	: " + kySu.getLoaiBang());
			System.out.println("\tNgành đào tạo : " + kySu.getNganhDt());
			System.out.println("\tSố nhà  : " + kySu.getDiaChi().getSoNha());
			System.out.println("\tNgách:" + kySu.getDiaChi().getNgach());
			System.out.println("\tNgõ : " + kySu.getDiaChi().getNgo());
			System.out.println("\tĐường : " + kySu.getDiaChi().getDuong());
			System.out.println("\tPhường : " + kySu.getDiaChi().getQuan());
			System.out.println("\tQuận : " + kySu.getDiaChi().getQuan());
			System.out.println("\tThành phố :" + kySu.getDiaChi().getThanhPho());
			System.out.println("======================================");
		}

	}

	private void showDSNhanVien(NhanVien[] dsNhanVien) {
		int dem = 0;
		for (NhanVien nhanVien : dsNhanVien) {
			System.out.println(" Người thứ	: " + (++dem));
			System.out.println("\tTên :" + nhanVien.getTen());
			System.out.println("\tNăm sinh : " + nhanVien.getNamSinh());
			System.out.println("\tGiới tính : " + nhanVien.getGioiTinh());
			System.out.println("\tCông việc : " + nhanVien.getCongViec());
			System.out.println("\tSố nhà  :  " + nhanVien.getDiaChi().getSoNha());
			System.out.println("\t Ngách  : " + nhanVien.getDiaChi().getNgach());
			System.out.println("\tNgõ :  " + nhanVien.getDiaChi().getNgo());
			System.out.println("\tDường : " + nhanVien.getDiaChi().getDuong());
			System.out.println("\tPhường : " + nhanVien.getDiaChi().getQuan());
			System.out.println("\tQuận  : " + nhanVien.getDiaChi().getQuan());
			System.out.println("\tThành phố : " + nhanVien.getDiaChi().getThanhPho());
			System.out.println("=========================================");
		}
	}

	private void search(NhanVien[] dsNhanVien, KySu[] dsKySu, CongNhan[] dsCongNhan, String ngCantim) {

		if (dsCongNhan != null) {
			for (int i = 0; i < dsCongNhan.length; i++) {
				if (dsCongNhan[i].getTen().equalsIgnoreCase(ngCantim)) {
					System.out.println("Tên : " + dsCongNhan[i].getTen());
					System.out.println("Giới tính : " + dsCongNhan[i].getGioiTinh());
					System.out.println("Năm sinh :" + dsCongNhan[i].getNamSinh());
					System.out.println("Bậc : " + dsCongNhan[i].getBac());
					System.out.println("Ngõ : " + dsCongNhan[i].getDiaChi().getNgo());
					System.out.println("Ngách : " + dsCongNhan[i].getDiaChi().getNgach());
					System.out.println("Đường : " + dsCongNhan[i].getDiaChi().getDuong());
					System.out.println("Phường : " + dsCongNhan[i].getDiaChi().getPhuong());
					System.out.println("Quận : " + dsCongNhan[i].getDiaChi().getQuan());
					System.out.println("Số nhà : " + dsCongNhan[i].getDiaChi().getSoNha());
					System.out.println("Thành phố : " + dsCongNhan[i].getDiaChi().getThanhPho());
					System.out.println("=========================================");
				}else {
					System.out.println("Khong co thong tin nguoi nay ");
				}

			}
		} else {
			System.out.println();
		}
		if (dsKySu != null) {
			for (int j = 0; j < dsKySu.length; j++) {
				if (dsKySu[j].getTen().equalsIgnoreCase(ngCantim)) {

					System.out.println("Tên : " + dsKySu[j].getTen());
					System.out.println("Giới tính : " + dsKySu[j].getGioiTinh());
					System.out.println("Năm sinh : " + dsKySu[j].getNamSinh());
					System.out.println("Loại bằng : " + dsKySu[j].getLoaiBang());
					System.out.println("Ngành đào tạo : " + dsKySu[j].getNganhDt());
					System.out.println("Ngõ : " + dsKySu[j].getDiaChi().getNgo());
					System.out.println("Ngách : " + dsKySu[j].getDiaChi().getNgach());
					System.out.println("Đường : " + dsKySu[j].getDiaChi().getDuong());
					System.out.println("Phường : " + dsKySu[j].getDiaChi().getPhuong());
					System.out.println("Quận : " + dsKySu[j].getDiaChi().getQuan());
					System.out.println("Số nhà : " + dsKySu[j].getDiaChi().getSoNha());
					System.out.println("Thành phố : " + dsKySu[j].getDiaChi().getThanhPho());
					System.out.println("===================================");

				}else {
					System.out.println();
				}
			}
		} else {
			System.out.println();
		}
		if (dsNhanVien != null) {
			for (int k = 0; k < dsNhanVien.length; k++) {

				if (dsNhanVien[k].getTen().equalsIgnoreCase(ngCantim)) {

					System.out.println("Tên : " + dsNhanVien[k].getTen());
					System.out.println("Giới tính : " + dsNhanVien[k].getGioiTinh());
					System.out.println("Năm sinh : " + dsNhanVien[k].getNamSinh());
					System.out.println("Công việc : " + dsNhanVien[k].getCongViec());
					System.out.println("Ngõ : " + dsNhanVien[k].getDiaChi().getNgo());
					System.out.println("Ngách : " + dsNhanVien[k].getDiaChi().getNgach());
					System.out.println("Đường : " + dsNhanVien[k].getDiaChi().getDuong());
					System.out.println("Phường " + dsNhanVien[k].getDiaChi().getPhuong());
					System.out.println("Quận : " + dsNhanVien[k].getDiaChi().getQuan());
					System.out.println("Số nhà : " + dsNhanVien[k].getDiaChi().getSoNha());
					System.out.println("Thành phố : " + dsNhanVien[k].getDiaChi().getThanhPho());
					System.out.println("===================================");
				}else {
					System.out.println("");
				}
			}
		} else {
			System.out.println();
		}

	}
}
