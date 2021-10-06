package in.monocept.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.monocept.entity.Book;
import in.monocept.repo.BookRepo;

@RestController
public class BookRestController {
	
	@Autowired
	private BookRepo bookRepo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "Add book with book Id ::"+book.getId();
	}
	
	@GetMapping("/getAllData")
	public List<Book> getAllData() {
		return bookRepo.findAll();
	}
	
	@GetMapping("/getBookById/{bookId}")
	public Optional<Book> getBookById(@PathVariable Integer bookId) {
		return bookRepo.findById(bookId);
	}
	
	@PutMapping("/updateById")
	public String updateById(@RequestBody Book book) {
		bookRepo.save(book);
		return "Data is updated with bookId :: "+book.getId();
	}
	
	@DeleteMapping("/deleteById/{bookId}")
	public String deleteById(@PathVariable Integer bookId) {
		bookRepo.deleteById(bookId);
		return "Book deleted with Id :: "+bookId;
	}
}
