package org.java.console;

import java.util.List;
import java.util.Scanner;

import org.java.data.Borrower;
import org.java.data.Loan;
import org.java.handle.UserHandle;

public class Menu {

	public static List<Borrower> listBorrower;
	public static List<Loan> listLoan;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String choose = "";
		do {
			System.out.println("================ MENU ================");
			System.out.println("1. Quản lý tài khoản vay");
			System.out.println("2. Quản lý các khoản vay của mỗi tài khoản");
			System.out.println("3. Dự báo số tiền lãi và gốc tất cả các khoản vay trong tháng tới");
			System.out.println("0. Thoát");
			System.out.print("Lựa chọn của bạn: ");
			choose = scanner.nextLine();

			switch (choose) {
			case "1":
				showUser();
				break;
			case "2":
				showBorrow();
				break;
			case "3":
				showStatis();
				break;
			case "0":
				System.out.println("Hẹn gặp lại!");
				break;
			default:
				System.out.println("Bạn nhập sai cú pháp!");
				break;
			}
		} while (!choose.equals("0"));
		scanner.close();
	}

	public static void showUser() {
		String choose = "";

		while (!choose.equals("0")) {
			System.out.println("============ QUẢN LÝ NGƯỜI VAY ============");
			System.out.println("1. Hiển thị các tài khoản vay tiền");
			System.out.println("2. Thêm tài khoản vay tiền");
			System.out.println("3. Sửa tài khoản vay tiền");
			System.out.println("4. Xóa tài khoản vay tiền");
			System.out.println("0. Quay lại");
			System.out.print("Lựa chọn của bạn: ");
			choose = scanner.nextLine();

			switch (choose) {
			case "1":
				new UserHandle().show(listBorrower);
				break;
			case "2":
				new UserHandle().add();
				break;
			case "3":
				new UserHandle().update();
				break;
			case "4":
				new UserHandle().delete();
				break;
			case "0":
				break;
			default:
				System.out.println("Bạn nhập sai cú pháp!");
				break;
			}
		}
	}

	public static void showBorrow() {
		String choose = "";

		while (!choose.equals("0")) {
			System.out.println("============ QUẢN LÝ KHOẢN VAY ============");
			System.out.println("1. Hiển thị khoản vay của các tài khoản");
			System.out.println("2. Thêm khoản vay vào tài khoản");
			System.out.println("3. Sửa khoản vay của tài khoản");
			System.out.println("4. Xóa khoản vay của tài khoản");
			System.out.println("0. Quay lại");
			System.out.print("Lựa chọn của bạn: ");
			choose = scanner.nextLine();
			switch (choose) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				break;
			default:
				System.out.println("Bạn nhập sai cú pháp!");
				break;
			}
		}
	}

	public static void showStatis() {
		String choose = "";

		while (!choose.equals("0")) {
			System.out.println("============ THỐNG KÊ NGUỒN THU ============");
			System.out.println("1. Hiển thị người vay tiền");
			System.out.println("1. Thêm người vay tiền");
			System.out.println("1. Sửa người vay tiền");
			System.out.println("1. Xóa người vay tiền");
			System.out.println("0. Quay lại");
			System.out.print("Lựa chọn của bạn: ");
			choose = scanner.nextLine();
			switch (choose) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				break;
			default:
				System.out.println("Bạn nhập sai cú pháp!");
				break;
			}
		}
	}

}
