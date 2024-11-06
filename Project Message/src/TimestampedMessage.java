import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampedMessage extends MessageDecorator {
    public TimestampedMessage(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String text = wrapped.getText();
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return "[" + timestamp + "] " + text;
    }
}