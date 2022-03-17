package pk;

public class Main {
    public static void main(String[] args){
        Message message = new Message();
        message.setTo("Mati");
        message.setFrom("Kamil");
        message.setContent("ssss");

        MessageService messageService =MessageSErviceProvide.find(MessagesTYpe.SMS);
        messageService.send(message);
    }
}
