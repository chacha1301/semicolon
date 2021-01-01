package co.semi.vo;

import java.sql.Date;

public class RepleVO {
	private int replenumber;
	private String repleid;
	private String password;
	private String replecontent;
	private Date repledate;
	private int boardnumber;
	
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public int getReplenumber() {
		return replenumber;
	}
	public void setReplenumber(int replenumber) {
		this.replenumber = replenumber;
	}
	public String getRepleid() {
		return repleid;
	}
	public void setRepleid(String repleid) {
		this.repleid = repleid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReplecontent() {
		return replecontent;
	}
	public void setReplecontent(String replecontent) {
		this.replecontent = replecontent;
	}
	public Date getRepledate() {
		return repledate;
	}
	public void setRepledate(Date repledate) {
		this.repledate = repledate;
	}
	@Override
	public String toString() {
		return "RepleVO [replenumber=" + replenumber + ", repleid=" + repleid + ", password=" + password
				+ ", replecontent=" + replecontent + ", repledate=" + repledate + ", boardnumber=" + boardnumber + "]";
	}
	
	
	
}
