package sendemail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {
    private static final String myAccountEmail = "";
    private static final String password = "";
    private static String subject;
    private static String body;


    public static void setSubject(String subject) {
        EmailService.subject = subject;
    }

    public static void setBody(String body) {
        EmailService.body = body;
    }

    public static void sendEmail(String to) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        //set-up email
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //call method prepareMessage
        Message message = prepareMessage(session, to);
    }

    private static Message prepareMessage(Session session, String to) {

        System.out.println("Loading...");

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(myAccountEmail));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(subject);

            message.setContent(body, "text/html");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        return null;
    }
}
