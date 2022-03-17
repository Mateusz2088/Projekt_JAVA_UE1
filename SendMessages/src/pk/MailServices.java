package pk;

public interface MailServices {
    void send(Message message);

    boolean isAcceptable(MessagesTYpe messagesTYpe);
}
