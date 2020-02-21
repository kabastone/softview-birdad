package fr.softview.birdad.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paging {
	@JsonProperty
	private Cursor cursors;
	@JsonProperty
	private String next;
	public Cursor getCursors() {
		return cursors;
	}
	public void setCursors(Cursor cursors) {
		this.cursors = cursors;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Paging [cursors=" + cursors + ", next=" + next + "]";
	}
	

}
