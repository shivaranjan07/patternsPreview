package creationalPatterns.factory;

import creationalPatterns.factory.factoryPattern.message.JSONMessage;
import creationalPatterns.factory.factoryPattern.message.Message;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
