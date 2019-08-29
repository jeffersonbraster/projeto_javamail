package enviando.mail;

import java.util.Properties;

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
	@org.junit.Test
 public void testeEmail() {
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/*Autorização*/
		properties.put("mail.smtp.starttls", "true");/*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail google*/
		properties.put("mail.smtp.port", "465");/*Porta do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465");/*Expecifica a porta a ser conectada pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao smtp*/
	 
 }
  
}
