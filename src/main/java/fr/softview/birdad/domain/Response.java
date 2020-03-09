package fr.softview.birdad.domain;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	@JsonProperty
	private List<Advertisement> data;
	@JsonProperty
	Paging paging;

	public Response() {
		
	}

	public List<Advertisement> getData() {
		return data;
	}

	public void setData(List<Advertisement> data) {
		this.data = data;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	@Override
	public String toString() {
		return "Response [data=" + data.toString() + ", paging=" + paging + "]";
	}
	
    
}
