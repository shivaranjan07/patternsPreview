package creationalPatterns.factory.factoryPattern.message;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text";
    }

}