package br.com.erudio;

public class Greeting {
	private final long id;
	private final String content;
	
	//Contrutor
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;		
	}	
	//Getters
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	
	
	
}
