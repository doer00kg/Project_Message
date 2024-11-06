public class Main {
    public static void main(String[] args) {
        // Початкове повідомлення
        Message message = new Message("  Тестове повідомлення з   зайвими пробілами.  ");
        System.out.println("Повідомлення: " + message.getText());

        // Стискання
        Message compressedMessage = new CompressedMessage(message);
        System.out.println("Повідомлення після стиснення: " + compressedMessage.getText());

        // Шифрування
        Message encryptedMessage = new EncryptedMessage(compressedMessage);
        System.out.println("Шифроване повідомлення: " + encryptedMessage.getText());

        // Дата/час
        Message timestampedMessage = new TimestampedMessage(encryptedMessage);
        System.out.println("Після додавання дати та часу: " + timestampedMessage.getText());

        // ПІБ
        Message authorMessage = new AuthorMessage(timestampedMessage);
        System.out.println("Після додавання автора: " + authorMessage.getText());
    }
}