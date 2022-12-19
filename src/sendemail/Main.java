package sendemail;

public class Main {
    public static void main(String[] args) {
        EmailService.sendEmail("iwan.boyan03@gmail.com", "ini send email", "<h1>Ini html</h1>", "input.txt");
    }
}
