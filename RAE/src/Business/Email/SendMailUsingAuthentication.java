/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;
import javax.mail.*;
import java.util.*;
import javax.mail.internet.*;



/**
 *
 * @author Romell
 */
public class SendMailUsingAuthentication {
    public static final String SMTP_HOST_NAME = "smtp.gmail.com";
    public static final String SMTP_AUTH_USER = "romellsegaran2111@gmail.com";
    public static final String SMTP_AUTH_PWD= "9820612938";
    public static void postMail( String recipients[ ],  String message , String from) throws MessagingException
    {boolean debug = false;
    Properties props = new Properties();
props.put("mail.smtp.starttls.enable","true");
props.put("mail.smtp.host", SMTP_HOST_NAME);
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

Authenticator auth = new SMTPAuthenticator();
Session session = Session.getDefaultInstance(props, auth);
session.setDebug(debug);
Message msg = new MimeMessage(session);
InternetAddress addressFrom = new InternetAddress(from);
msg.setFrom(addressFrom);
InternetAddress[] addressTo = new InternetAddress[recipients.length];
for (int i = 0; i < recipients.length; i++)
{
addressTo[i] = new InternetAddress(recipients[i]);
}
msg.setRecipients(Message.RecipientType.TO, addressTo);

 msg.setContent(message, "text/plain");
 Transport.send(msg);
    }
}
    
    

