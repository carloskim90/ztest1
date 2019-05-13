package org.zerock.domain;

public class Question {
	
	private String content;
	private int yes, no;
	
	public Question(String content, int yes, int no) {
		// super();
		this.content = content;
		this.yes = yes;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Question [content=" + content + ", yes=" + yes + ", no=" + no + "]";
	}

	public String getContent() {
		return content;
	}

	public int getYes() {
		return yes;
	}

	public int getNo() {
		return no;
	}
	
	

}
