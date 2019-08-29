package enviando.mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * conta de email que será usado nos projetos
 * login: jeffersonjavaweb@gmail.com
 * senha: 987832042
 */
public class AppTest 
    
{
	private String userName = "jeffersonjavaweb@gmail.com";
	private String senha = "987832042";
	
	
	@org.junit.Test
 public void testeEmail() {
		try {
			
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/*Autorização*/
		properties.put("mail.smtp.starttls", "true");/*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail google*/
		properties.put("mail.smtp.port", "465");/*Porta do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465");/*Expecifica a porta a ser conectada pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao smtp*/
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}
		});
		
		Address[] toUser = InternetAddress.parse("jeffersonbraster@gmail.com, andrequinha99@gmail.com, jeffersonjavaweb@gmail.com");
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName));/*Quem está enviando*/
		message.setRecipients(Message.RecipientType.TO, toUser); /*Email de destino*/
		message.setSubject("Chegou o e-mail enviado via java"); /*Assunto do email*/
		message.setText("Olá, vc acaba de receber um e-mail enviado com java pelo jefferson brandao");
		
		
		Transport.send(message);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
 }
  
}
