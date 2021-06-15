package creationalPatterns.factory;

import creationalPatterns.factory.factoryPattern.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    // this method will be used by client to get the Object of the method
    public Message getMessage() {
        Message msg = createMessage();
        // can do additional processing
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    //Factory method - concrete creator will implement the create Message
    public abstract Message createMessage();
}
