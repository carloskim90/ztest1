package org.zerock.domain;

import java.util.*;

import org.zerock.ui.QuestionUI;
import org.zerock.service.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		QuestionUI ui = new QuestionUI(scan);
		ui.solveQuestion(0);
		
	}
	
	// getyes 쓰면 이름없는 변수가 선언되는 것. 타입 쓰는 순간 생성되는 것. Question에 있는 yes가 이름 없는 변수에 로드 카피 스토어 되니 직접 접근이 아님. 원본훼손 X. 기본자료형만.

}
