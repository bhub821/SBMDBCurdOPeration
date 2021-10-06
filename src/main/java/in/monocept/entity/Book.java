package in.monocept.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Data

@Document(collection = "Book")
public class Book {
	@Id
	private Integer id;
	
	private String bookName;
	
	private String authName;
}
