package structuralPatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *Concrete component. Object to be decorated
 * */
@NoArgsConstructor
@AllArgsConstructor
public class TextMessage implements Message {
	private String msg;
	
	@Override
	public String getContent() {
		return msg;
	}
}
