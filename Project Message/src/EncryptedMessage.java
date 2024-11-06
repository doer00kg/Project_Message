import java.util.Base64;

public class EncryptedMessage extends MessageDecorator {
    public EncryptedMessage(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String text = wrapped.getText();
        String encryptedText = Base64.getEncoder().encodeToString(text.getBytes()); // Просте шифрування
        return encryptedText;
    }
}