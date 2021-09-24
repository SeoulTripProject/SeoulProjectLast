package com.sist.vo;
/*
 *  ENO    NOT NULL NUMBER        
	NO              NUMBER        
	TITLE  NOT NULL VARCHAR2(100) 
	POSTER NOT NULL VARCHAR2(350) 
	DETAIL          CLOB          
	PERIOD          VARCHAR2(100) 
	TEL             VARCHAR2(50)  
	TIME            VARCHAR2(100) 
	DAY             VARCHAR2(100) 
	PRICE           VARCHAR2(50)  
	ADDR            VARCHAR2(500) 
	TRANS           VARCHAR2(500) 
	TAG             VARCHAR2(700) 
	TYPE            NUMBER        

 */
public class ExbitVO {
	private int eno,no;
	private String title,poster,detail,period,tel,time,day,price,addr,trans,tag,images;
	private int preno, nextno;
	private String addr1;
	
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public int getPreno() {
		return preno;
	}
	public void setPreno(int preno) {
		this.preno = preno;
	}
	public int getNextno() {
		return nextno;
	}
	public void setNextno(int nextno) {
		this.nextno = nextno;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTrans() {
		return trans;
	}
	public void setTrans(String trans) {
		this.trans = trans;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
}

