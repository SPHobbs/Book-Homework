
public class volume {
	private static String volumeName;
	private static int numberOfBooks;
	private static book[] books;
	public volume(String name, int number, book[] booksCon) {
	    volumeName = name;
	    numberOfBooks = number;
	    books = booksCon;
	}
	public book getBooks(int index) {
		return getBooks(index);
	}
	public String toString(){
		return "Volume Name: " + volumeName + ".\nNumber of Books: " + numberOfBooks + ".\nBooks in collection: " + books;
	}
}
