package creationalPatterns.factory;

import creationalPatterns.factory.factoryPattern.message.Message;
import creationalPatterns.factory.factoryPattern.message.TextMessage;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
