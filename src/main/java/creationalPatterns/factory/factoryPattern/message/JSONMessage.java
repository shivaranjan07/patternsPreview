package creationalPatterns.factory.factoryPattern.message;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }

}
