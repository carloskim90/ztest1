package org.zerock.service;

import java.util.*;

import org.zerock.domain.Question;

public class QuestionService {
	
	private static QuestionService service;
	
	private ArrayList<Question> list;
	
	// 리모컨 넘겨주기.
	public static QuestionService getInstance() {
		
		if(service == null) {
			service = new QuestionService();
		}
		
		return service;
		
	}
	
	// 생성자를 private으로 설정해야 외부에서 인스턴스를 만들지 못한다.
	private QuestionService() {
		
		list = new ArrayList<Question>();
		
		list.add(new Question("나는 세차를 할 때 기계식 세차장을 애용한다.", 1, 3)); // 텍스트, yes, no
		list.add(new Question("자동차에 문제가 생기면 직접 뜯어본다.", 4, 2));
		list.add(new Question("무엇을 사든 항상 최신 제품을 고집한다.", 4, 5));
		list.add(new Question("국도보다는 뻥 뚫린 고속도로가 좋다.", 6, 7));
		list.add(new Question("왁자질껄한 것보다 혼자만의 시간을 더 선호한다.", 3, 7));
		list.add(new Question("게으르다는 소리를 종종 듣는다.", 8, 5));
		list.add(new Question("친구들이 내게 '자동차랑 사귀냐?'고 물어보곤 한다.", 9, 7));
		list.add(new Question("바닷가보다는 구비구비 산길이 더 신난다.", 10, 11));
		list.add(new Question("자동차는 모름지기 실내가 넓어야 한다.", 11, 7));
		list.add(new Question("앞 차로부터 튀는 돌을 맞기 싫어서 항상 멀리 떨어진다.", 12, 13));
		list.add(new Question("도로 위에서 나는 늘 남들보다 빠르다.", 13, 14));
		list.add(new Question("직접 운전하기보다 뒷좌석에 앉는 것을 더 선호한다.", 15, 14));
		list.add(new Question("A", 0, 0));
		list.add(new Question("B", 0, 0));
		list.add(new Question("C", 0, 0));
		list.add(new Question("D", 0, 0));
				
	}
	
	public Question getQuestion(int idx) {
		return list.get(idx);
	}
	
//	public ArrayList<Question> getList() {
//		return this.list;
//	}

}
