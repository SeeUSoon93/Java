package model;

public class BookDTO {

	private String title;
	private String name;
	private int price;
	private String booknum;

	public BookDTO(String title, String name, int price, String booknum) {
		this.title = title;
		this.name = name;
		this.price = price;
		this.booknum = booknum;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBooknum() {
		return booknum;
	}

	public void setBooknum(String booknum) {
		this.booknum = booknum;
	}

}
