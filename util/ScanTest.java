package org.zerock.util;

public class ScanTest {

	public static void main(String[] args) {
		
		String name = ScanUtil.getInstance().input("�̸��� �Է��ϼ��� : ");
		System.out.println(name);
		int age = ScanUtil.getInstance().inputInt("���̸� �Է��ϼ��� : ");
		System.out.println(age);

	}

}
