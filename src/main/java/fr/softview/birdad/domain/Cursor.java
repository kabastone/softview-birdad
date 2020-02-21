package fr.softview.birdad.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cursor {
	@JsonProperty
	private String after;

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	@Override
	public String toString() {
		return "Cursor [after=" + after + "]";
	}

}
