package Util;

public class Book {
	private int bookId;
	private String bookOther;
	private String bookAuthor;
	private String bookName;
    private String bookPrice;
    private String bookType;
	/**
	 * @return the bookId
	 */
	public final int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId 
	 *           the bookId to set
	 */
	public final void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookOther
	 */
	public final String getBookOther() {
		return bookOther;
	}
	/**
	 * @param bookOther 
	 *           the bookOther to set
	 */
	public final void setBookOther(String bookOther) {
		this.bookOther = bookOther;
	}
	/**
	 * @return the bookAuthor
	 */
	public final String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * @param bookAuthor 
	 *           the bookAuthor to set
	 */
	public final void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 * @return the bookName
	 */
	public final String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName 
	 *           the bookName to set
	 */
	public final void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the bookPrice
	 */
	public final String getBookPrice() {
		return bookPrice;
	}
	/**
	 * @param bookPrice 
	 *           the bookPrice to set
	 */
	public final void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 * @return the bookType
	 */
	public final String getBookType() {
		return bookType;
	}
	/**
	 * @param bookType 
	 *           the bookType to set
	 */
	public final void setBookType(String bookType) {
		this.bookType = bookType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookOther=" + bookOther + ", bookAuthor=" + bookAuthor + ", bookName="
				+ bookName + ", bookPrice=" + bookPrice + ", bookType=" + bookType + "]";
	}
	
	
    
}
