
public class book {
	private static String title;
	private static String author;
	private static int pages;
	public book(String Title, String Author, int Pages) {
	    title = "Title";
	    author = "Author";
	    pages = 5;
	}
	public String toString(){
		return "Title of the book: " + book.title + ".\n Name of the author: " + book.author + ".\nNumber of pages: " + book.pages;
	}
}
