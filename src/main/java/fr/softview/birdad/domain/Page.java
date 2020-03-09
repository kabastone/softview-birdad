package fr.softview.birdad.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page {
	@JsonProperty(value = "fan_count")
	private int fanCount;
	@JsonProperty(value= "id")
	private Long id;
	public int getFanCount() {
		return fanCount;
	}
	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Page [fanCount=" + fanCount + ", id=" + id + "]";
	}
	

}
