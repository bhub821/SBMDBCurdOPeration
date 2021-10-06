package in.monocept.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.monocept.entity.Book;

@Repository
public interface BookRepo extends MongoRepository<Book,Integer>{
	
}
