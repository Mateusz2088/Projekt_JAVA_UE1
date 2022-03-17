package pk;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j
 class MailService implements MessageService {
    @Override
    public void send(Message message){
        System.out.println("EMAIL");
    }

    @Override
    public boolean isAcceptable(MessagesTYpe messagesTYpe){
        MessagesTYpe.EMAIL.equals(messagesTYpe);
        messagesTYpe.equals(MessagesTYpe.EMAIL);

        return MessagesTYpe.EMAIL.equals(messagesTYpe);
    }


}
