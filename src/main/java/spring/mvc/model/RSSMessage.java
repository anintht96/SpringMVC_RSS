package spring.mvc.model;

import java.util.Date;

public class RSSMessage {

	private String title;
	private String url;
	private String summary;
	private Date createdDate;

	public RSSMessage() {
		super();
	}

	public RSSMessage(String title, String url, String summary, Date createdDate) {
		super();
		this.title = title;
		this.url = url;
		this.summary = summary;
		this.createdDate = createdDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
