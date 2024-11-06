public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String text = wrapped.getText();
        String compressedText = text.replaceAll("\\s+", " ").trim(); // Видалення зайвих пробілів
        return compressedText;
    }
}
