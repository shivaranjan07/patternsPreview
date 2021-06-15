package creationalPatterns.factory.simpleFactory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a product information post. 
 *
 */
@Setter
@Getter
@NoArgsConstructor
public class ProductPost extends Post{
	private String imageUrl;
	private String name;
}
