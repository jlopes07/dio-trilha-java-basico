package messenger;

public class FacebookMessenger extends ServicoMensagemInstantanea {
        @Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
        @Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}