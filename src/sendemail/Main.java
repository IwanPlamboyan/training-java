package sendemail;

public class Main {
    public static void main(String[] args) {
        EmailService.setSubject("Ini text");
        EmailService.setBody("<h1>Ini html</h1>");
        EmailService.sendEmail("iwanplam03@gmail.com");
    }
}
