package fr.softview.birdad.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Advertisement {
    @JsonProperty(value = "page_id")
	private Long pageID;
    
    @JsonProperty(value = "ad_snapshot_url")
	private String adSnapshotUrl;
    
    @JsonProperty(value = "ad_delivery_start_time")
	private LocalDateTime adDeliveryStartTime;
    
    @JsonProperty(value = "ad_delivery_stop_time")
	private LocalDateTime adDeliveryStopTime;
    
    @JsonProperty(value = "id")
	private Long adID;
	
	public Advertisement() {
		super();
	}

	public Long getPageID() {
		return pageID;
	}

	public void setPageID(Long pageID) {
		this.pageID = pageID;
	}

	public String getAdSnapshotUrl() {
		return adSnapshotUrl;
	}

	public void setAdSnapshotUrl(String adSnapshotUrl) {
		this.adSnapshotUrl = adSnapshotUrl;
	}

	public LocalDateTime getAdDeliveryStartTime() {
		return adDeliveryStartTime;
	}

	public void setAdDeliveryStartTime(LocalDateTime adDeliveryStartTime) {
		this.adDeliveryStartTime = adDeliveryStartTime;
	}

	public LocalDateTime getAdDeliveryStopTime() {
		return adDeliveryStopTime;
	}

	public void setAdDeliveryStopTime(LocalDateTime adDeliveryStopTime) {
		this.adDeliveryStopTime = adDeliveryStopTime;
	}

	public Long getAdID() {
		return adID;
	}

	public void setAdID(Long adID) {
		this.adID = adID;
	}

	@Override
	public String toString() {
		return "Advertisement {pageID='" + pageID + '\'' + 
				", adSnapshotUrl='" + adSnapshotUrl + '\'' +
				", adDeliveryStartTime='" + adDeliveryStartTime + '\'' +
				", adDeliveryStopTime='" + adDeliveryStopTime + '\'' +
				", adID=" + adID + "}";
	}
	
	
}
