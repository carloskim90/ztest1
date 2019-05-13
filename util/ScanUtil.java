package org.zerock.util;

import java.util.*;

public class ScanUtil {
	
	private Scanner scanner;
	
	// 리모컨?
	private static ScanUtil instance;
	
	public static ScanUtil getInstance() {
		if(instance == null) {
			instance = new ScanUtil();
		}
		return instance;
	}
	
	private ScanUtil() {
		this.scanner = new Scanner(System.in);
	}
	
	// 입력 받는 것 구현.
	public String input(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	public int inputInt(String msg) {
		return Integer.parseInt(input(msg));
	}
	
	public double inputDouble(String msg) {
		return Double.parseDouble(msg);
	}
}
