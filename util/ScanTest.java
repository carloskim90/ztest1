package org.zerock.util;

public class ScanTest {

	public static void main(String[] args) {
		
		String name = ScanUtil.getInstance().input("이름을 입력하세요 : ");
		System.out.println(name);
		int age = ScanUtil.getInstance().inputInt("나이를 입력하세요 : ");
		System.out.println(age);

	}

}
