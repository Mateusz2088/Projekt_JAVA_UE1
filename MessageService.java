package pk;

public interface MessageService {

    void send(Message message);

    boolean isAcceptable(MessagesTYpe messagesTYpe);
}
