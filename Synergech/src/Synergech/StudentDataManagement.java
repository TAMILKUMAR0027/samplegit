package Synergech;
import java.util.*;
class BookVO{
	private int isbn;
	private String title;
	private String author;
	private int year;
	BookVO(int isbn,String title,String author,int year){
		this.isbn=isbn;
		this.author=author;
		this.title=title;
		this.year=year;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}
 
}
class StudentData{
	List<BookVO> books=new ArrayList<BookVO>();
	public void addbook(BookVO book) {
		books.add(book);
	}
	public List<BookVO> findBook(String author){
		List<BookVO> result=new ArrayList<>();
		for(BookVO e:books) {
			if(e.getAuthor().equals(author)) {
				result.add(e);
			}
		}
		return result;
	}
	public List<BookVO> findBooksByYear(int year) {
        List<BookVO> result = new ArrayList<>();
        for(BookVO e:books) {
            if (e.getYear()==year) {
                result.add(e);
            }
        }
        return result;
    }

}
public class StudentDataManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		StudentData sd = new StudentData();
		BookVO b1=new BookVO(123,"Funny","Jhon",2005);
		sd.addbook(b1);
		for(BookVO b:sd.findBook("Jhon")) {
            System.out.println(b);
        }
		for(BookVO b:sd.findBooksByYear(2005)) {
            System.out.println(b);
        }

	}

}
