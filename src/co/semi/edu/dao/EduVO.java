package co.semi.edu.dao;

public class EduVO {
	private String eduNumber;  
	private String eduTitle;  
	private String eduPrice;  
	private String eduLecturer;  
	private String eduSubject;  
	private String eduState;  
	private String eduKeyword; 
	private String eduImg;
	public String getEduNumber() {
		return eduNumber;
	}
	public void setEduNumber(String eduNumber) {
		this.eduNumber = eduNumber;
	}
	public String getEduTitle() {
		return eduTitle;
	}
	public void setEduTitle(String eduTitle) {
		this.eduTitle = eduTitle;
	}
	public String getEduPrice() {
		return eduPrice;
	}
	public void setEduPrice(String eduPrice) {
		this.eduPrice = eduPrice;
	}
	public String getEduLecturer() {
		return eduLecturer;
	}
	public void setEduLecturer(String eduLecturer) {
		this.eduLecturer = eduLecturer;
	}
	public String getEduSubject() {
		return eduSubject;
	}
	public void setEduSubject(String eduSubject) {
		this.eduSubject = eduSubject;
	}
	public String getEduState() {
		return eduState;
	}
	public void setEduState(String eduState) {
		this.eduState = eduState;
	}
	public String getEduKeyword() {
		return eduKeyword;
	}
	public void setEduKeyword(String eduKeyword) {
		this.eduKeyword = eduKeyword;
	}
	public String getEduImg() {
		return eduImg;
	}
	public void setEduImg(String eduImg) {
		this.eduImg = eduImg;
	}
	@Override
	public String toString() {
		return "EduVO [eduNumber=" + eduNumber + ", eduTitle=" + eduTitle + ", eduPrice=" + eduPrice + ", eduLecturer="
				+ eduLecturer + ", eduSubject=" + eduSubject + ", eduState=" + eduState + ", eduKeyword=" + eduKeyword
				+ ", eduImg=" + eduImg + "]";
	}  
	
	
}
