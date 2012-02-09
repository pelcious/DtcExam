package net.skcomms.search.backend.server;

public class Visitor implements Person {
	private String myName;
	public Visitor(String name) {
		this.myName = name;
	}
	public void setName(String name) {
		this.myName = name;
	}
	@Override
	public String getName() {
		return this.myName;
	}

}
