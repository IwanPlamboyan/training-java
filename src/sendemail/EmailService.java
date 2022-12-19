package sendemail;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {
    private static final String myAccountEmail = "iwan.boyan03@gmail.com";
    private static final String password = "iozahompfvhknffw";
    private static String file;


    public static void sendEmail(String to, String subject, String body) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        //set-up email
        Session session =  Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //call method prepareMessage
        Message message = prepareMessage(session, to, subject, body);
    }

    public static void sendEmail(String to, String subject, String body, String filePath) {
        file = filePath;

        sendEmail(to, subject, body);
    }

    private static Message prepareMessage(Session session, String to, String subject, String body) {

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

            //check filePath exist
            if(file == null) {
                message.setContent(body, "text/html");
            }else {
                // Create the message part
                BodyPart messageBodyPart = new MimeBodyPart();

                // Fill the message
                messageBodyPart.setContent(body, "text/html");

                // Create a multipar message
                Multipart multipart = new MimeMultipart();

                // Set text message part
                multipart.addBodyPart(messageBodyPart);

                // Part two is attachment
                messageBodyPart = new MimeBodyPart();
                String filename = file;
                DataSource source = new FileDataSource(filename);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(filename);
                multipart.addBodyPart(messageBodyPart);

                // Send the complete message parts
                message.setContent(multipart );
                file = null;
            }

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        return null;
    }
}
