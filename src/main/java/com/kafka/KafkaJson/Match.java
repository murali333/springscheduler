package com.kafka.KafkaJson;

public class Match {
	
	private String mchstate; 
	private String srs;
	private String mnum;
	private String id;
	private String mchdesc;
	private String type;
	private String status;
	
	
	public String getMchstate() {
		return mchstate;
	}
	public void setMchstate(String mchstate) {
		this.mchstate = mchstate;
	}
	public String getSrs() {
		return srs;
	}
	public void setSrs(String srs) {
		this.srs = srs;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMchdesc() {
		return mchdesc;
	}
	public void setMchdesc(String mchdesc) {
		this.mchdesc = mchdesc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Match [mchstate=" + mchstate + ", srs=" + srs + ", mnum=" + mnum + ", id=" + id + ", mchdesc=" + mchdesc
				+ ", type=" + type + ", status=" + status + "]";
	}

}
