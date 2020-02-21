package fr.softview.birdad.domain;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	@JsonProperty
	private Advertisement[] data;
	@JsonProperty
	Paging paging;

	public Response() {
		
	}

	public Advertisement[] getData() {
		return data;
	}

	public void setData(Advertisement[] data) {
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
		return "Response [data=" + Arrays.toString(data) + ", paging=" + paging + "]";
	}
	
    
}
