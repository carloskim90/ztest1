package org.zerock.service;

import java.util.*;

import org.zerock.domain.Question;

public class QuestionService {
	
	private static QuestionService service;
	
	private ArrayList<Question> list;
	
	// ������ �Ѱ��ֱ�.
	public static QuestionService getInstance() {
		
		if(service == null) {
			service = new QuestionService();
		}
		
		return service;
		
	}
	
	// �����ڸ� private���� �����ؾ� �ܺο��� �ν��Ͻ��� ������ ���Ѵ�.
	private QuestionService() {
		
		list = new ArrayList<Question>();
		
		list.add(new Question("���� ������ �� �� ���� �������� �ֿ��Ѵ�.", 1, 3)); // �ؽ�Ʈ, yes, no
		list.add(new Question("�ڵ����� ������ ����� ���� ����.", 4, 2));
		list.add(new Question("������ ��� �׻� �ֽ� ��ǰ�� �����Ѵ�.", 4, 5));
		list.add(new Question("�������ٴ� �� �ո� ��ӵ��ΰ� ����.", 6, 7));
		list.add(new Question("���������� �ͺ��� ȥ�ڸ��� �ð��� �� ��ȣ�Ѵ�.", 3, 7));
		list.add(new Question("�������ٴ� �Ҹ��� ���� ��´�.", 8, 5));
		list.add(new Question("ģ������ ���� '�ڵ����� ��ͳ�?'�� ����� �Ѵ�.", 9, 7));
		list.add(new Question("�ٴ尡���ٴ� ���񱸺� ����� �� �ų���.", 10, 11));
		list.add(new Question("�ڵ����� ������ �ǳ��� �о�� �Ѵ�.", 11, 7));
		list.add(new Question("�� ���κ��� Ƣ�� ���� �±� �Ⱦ �׻� �ָ� ��������.", 12, 13));
		list.add(new Question("���� ������ ���� �� ���麸�� ������.", 13, 14));
		list.add(new Question("���� �����ϱ⺸�� ���¼��� �ɴ� ���� �� ��ȣ�Ѵ�.", 15, 14));
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
