package creationalPatterns.factory.simpleFactory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a blog post. 
 * 
 */
@Setter
@Getter
@NoArgsConstructor
public class BlogPost extends Post {
	private String author;
	private String[] tags;
	public String getAuthor() {
		return author;
	}
	
	
}
