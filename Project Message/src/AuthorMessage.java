public class AuthorMessage extends MessageDecorator {
    public AuthorMessage(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String text = wrapped.getText();
        String author = "Григорчук Денис Сергійович";
        return text + " (Автор: " + author + ")";
    }
}
