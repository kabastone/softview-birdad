package fr.softview.birdad.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Advertisement {
    @JsonProperty(value = "page_id")
	private Long pageID;
    
    @JsonProperty(value = "ad_snapshot_url")
	private String adSnapshotUrl;
    
    @JsonProperty(value = "ad_delivery_start_time")
	private String adDeliveryStartTime;
    
    @JsonProperty(value = "ad_delivery_stop_time")
	private String adDeliveryStopTime;
    
    @JsonProperty(value = "id")
	private Long adID;
    private Page page;
    
    
	
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

	public String getAdDeliveryStartTime() {
		return adDeliveryStartTime;
	}

	public void setAdDeliveryStartTime(String adDeliveryStartTime) {
		this.adDeliveryStartTime = adDeliveryStartTime;
	}

	public String getAdDeliveryStopTime() {
		return adDeliveryStopTime;
	}

	public void setAdDeliveryStopTime(String adDeliveryStopTime) {
		this.adDeliveryStopTime = adDeliveryStopTime;
	}

	public Long getAdID() {
		return adID;
	}

	public void setAdID(Long adID) {
		this.adID = adID;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Advertisement {pageID='" + pageID + '\'' + 
				", adSnapshotUrl='" + adSnapshotUrl + '\'' +
				", adDeliveryStartTime='" + adDeliveryStartTime + '\'' +
				", adDeliveryStopTime='" + adDeliveryStopTime + '\'' +
				", adID=" + adID + '\'' +
				", Page=" + page.toString() + " }";
	}
	
	
}
