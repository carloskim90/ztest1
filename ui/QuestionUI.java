package org.zerock.ui;

import org.zerock.domain.Question;
import org.zerock.service.QuestionService;
import org.zerock.util.ScanUtil;

public class QuestionUI {
	
	private static QuestionUI instance;
	
	public static QuestionUI getInstance() {
		if(instance == null) {
			instance = new QuestionUI();
		}
		return instance;
	}
	
	private QuestionUI() {
		
	}
	
	// ���� �̱������� ����� ����.
	
	void solveQuestion(int idx) {
		
		Question question = QuestionService.getInstance().getQuestion(idx);
		
		System.out.println(question.getContent());
		String answer = ScanUtil.getInstance().input(question.getContent());
		
		int next = answer.contentEquals("Y")? question.getYes(): question.getNo();
		
		if (next == 0) {
			return;
		}
		solveQuestion(next);
		
//		if(answer.equals("Y")) {	
//			if(question.getYes() == 0) {
//				return;
//			}else {
//				solveQuestion(question.getYes());
//			}
//		}
//		else {
//			if(question.getNo() == 0) {
//				return;
//			}else {
//				solveQuestion(question.getNo());
//			}
//		}
		
	}

}
