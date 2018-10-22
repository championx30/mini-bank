package org.java.handle;

import java.util.List;

import org.java.data.Borrower;

public class UserHandle {

	public void show(List<Borrower> listBorrower) {
		if (listBorrower == null) {
			return;
		}
		for (Borrower borrower : listBorrower) {
			System.out.println(borrower);
		}
	}

	public Borrower add() {
		System.out.println("===== THÊM TÀI KHOẢN VAY TIỀN =====");
		System.out.println("=> Nhập họ và tên");
		System.out.print("Họ: ");
		System.out.println("Tên đệm: ");
		Borrower borrower = new Borrower();
		return borrower;
	}

	public void update() {

	}

	public void delete() {

	}
}
