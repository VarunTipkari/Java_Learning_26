import com.book.Book;
import com.dao.BookDaoCollectionsImpl;
import com.service.*;
import com.dao.*;

public class Test {

	public static void main(String[] args) {

		BookDao dao = new BookDaoCollectionsImpl();
		BookService service = new BookServiceImpl(dao);
		
		//Save 
		service.save(new Book(11,"Hidden Truth","Vaurn Tipkari",350));
		service.save(new Book(13,"Build Dont talk","Raj Shamani",250));
		service.save(new Book(15,"Project Hail Mary","Rohit Pawar",500));
		
		//--------------------------------------------------------------
		for(Book b : service.list()) {
			System.out.println(b);
		}
		System.out.println();
		
		
		//--------------------------------------------------------------
		try {
			System.out.println(service.find(17));
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		//--------------------------------------------------------------
		
		for(Book b : service.findByPrice(200,400)) {
			System.out.println(b);
		}
		System.out.println();
		
		
		//--------------------------------------------------------------
		try {
			service.delete(15);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
