class Book
{
	String Book_name;
	public String getBook_name() 
	{
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getISBN_number() {
		return ISBN_number;
	}
	public void setISBN_number(String iSBN_number) {
		ISBN_number = iSBN_number;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	String ISBN_number;
	String Author_name;
	String Publisher;
	Book(String Book_name,String ISBN_number,String Author_name,String Publisher)
	{
		this.Book_name=Book_name;
		this.ISBN_number=ISBN_number;
		this.Author_name=Author_name;
		this.Publisher=Publisher;
	}
	
	public static void main(String []args)
	{
		Book s=new Book("Love the life", "AT2536", "Khalid", "K Publication");
		System.out.println("Book_name is " +s.Book_name);
		System.out.println("ISBN_number is " +s.ISBN_number);
		System.out.println("Author_name is " +s.Author_name);
		System.out.println("Publisher is " +s.Publisher);
	}
}