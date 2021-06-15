package creationalPatterns.factory.simpleFactory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Represents a news post.
 *
 */
@Setter
@Getter
@NoArgsConstructor
public class NewsPost extends Post{
	private String headline;
	private LocalDate newsTime;
}
