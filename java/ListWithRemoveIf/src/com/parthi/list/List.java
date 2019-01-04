package com.parthi.list;

public class List
{

	private String words;

	public List(String words) 
	{
		super();
		this.words = words;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	@Override
	public String toString() {
		return "List [words=" + words + "]";
	}
	
	
	
}
