package creationalPatterns.factory.simpleFactory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Abstract post class. Represents a generic post on a web site. 
 */
@Setter
@Getter
@NoArgsConstructor
public abstract class Post {
	private Long id;
	private String title;
	private String content;
	private LocalDateTime createdOn;
	private LocalDateTime publishedOn;
}
