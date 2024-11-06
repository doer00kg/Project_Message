abstract class MessageDecorator extends Message {
    protected Message wrapped;

    public MessageDecorator(Message wrapped) {
        super("");
        this.wrapped = wrapped;
    }

    @Override
    public String getText() {
        return wrapped.getText();
    }
}