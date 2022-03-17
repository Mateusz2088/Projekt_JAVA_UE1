package pk;

 class SmsService implements MessageService{
    @Override
    public void send(Message message){

    }
    @Override
    public boolean isAcceptable(MessagesTYpe messagesTYpe){
        MessagesTYpe.SMS.equals(messagesTYpe);
        messagesTYpe.equals(MessagesTYpe.SMS);

        return MessagesTYpe.SMS.equals(messagesTYpe);
    }
}
