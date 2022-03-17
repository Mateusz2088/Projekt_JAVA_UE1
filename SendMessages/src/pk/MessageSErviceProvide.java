package pk;

import java.util.ArrayList;
import java.util.List;

public class MessageSErviceProvide {

    private static List<MessageService> messageServices = new ArrayList<>();
    static {
        messageServices.add(new MailService());
        messageServices.add(new SmsService());
    }
    static MessageService find(MessagesTYpe messagesTYpe){
        return messageServices.stream()
                .filter(service -> service.isAcceptable(messagesTYpe))
                .findAny().orElseThrow(() -> new IllegalArgumentException("wtf"));
    }
}
